package service.application;

import model.Behavior;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.nnet.learning.BackPropagation;
import org.neuroph.nnet.learning.MomentumBackpropagation;
import org.neuroph.util.TransferFunctionType;
import org.neuroph.util.data.norm.MaxNormalizer;
import org.neuroph.util.data.norm.Normalizer;

public class CustomerCombackPrediction {

    private String filename;
    private String typeAlgorithm;

    public CustomerCombackPrediction(String typeAlgorithm, String filename) {
        this.filename = filename;
        this.typeAlgorithm = typeAlgorithm;
    }

    public void run(double totalTimeAccess, boolean hasAccount, boolean hadFeedback, boolean hadViewRoom, boolean hadVoteRoom, double percentComback) {

        if (typeAlgorithm.equalsIgnoreCase("BackPropagation")
                && typeAlgorithm.equalsIgnoreCase("MomentumBackpropagation")) {
            //System.out.println("Wrong type Algorithm!");
        } else {
            //System.out.println("Creating training and test set from file...");
            String trainingSetFileName = "src\\java\\dataset\\" + filename + ".csv";
            int inputsCount = 6;
            int outputsCount = 1;

            // Create data set from file
            DataSet dataSet = DataSet.createFromFile(trainingSetFileName, inputsCount, outputsCount, ",", true);
            dataSet.shuffle();

            // Normalizing data set
            Normalizer normalizer = new MaxNormalizer();
            normalizer.normalize(dataSet);

            // Creating training set (80%) and test set (20%)
            DataSet[] trainingAndTestSet = dataSet.createTrainingAndTestSubsets(80, 20);
            DataSet trainingSet = trainingAndTestSet[0];
            DataSet testSet = trainingAndTestSet[1];

            //System.out.println("Creating neural network...");
            // Create MultiLayerPerceptron neural network

            MultiLayerPerceptron neuralNet = new MultiLayerPerceptron(TransferFunctionType.SIGMOID, inputsCount, 7, 5,
                    outputsCount);

            BackPropagation learningRule = null;

            if (typeAlgorithm.equalsIgnoreCase("BackPropagation")) {
                learningRule = neuralNet.getLearningRule();
            } else {
                learningRule = (MomentumBackpropagation) neuralNet.getLearningRule();
                ((MomentumBackpropagation) learningRule).setMomentum(0.7);
            }

            learningRule.setLearningRate(0.2);
            learningRule.setMaxError(0.1);
            learningRule.setMaxIterations(1000);

            //System.out.println("Training network...");
            // train the network with training set
            neuralNet.learn(trainingSet);

            neuralNet.save("abc.nnet");

            @SuppressWarnings("deprecation")
            NeuralNetwork<?> loadNet = NeuralNetwork.load("abc.nnet");

            //System.out.println("Testing network...\n\n");

            testNeuralNetwork(loadNet, testSet, totalTimeAccess, hasAccount, hadFeedback, hadViewRoom, hadVoteRoom, percentComback);
            //System.out.println("Predict Done.");
            //System.out.println("**************************************************");
        }

    }

    private void testNeuralNetwork(NeuralNetwork<?> neuralNet, DataSet testSet, double tem, boolean occ, boolean lum, boolean uri, boolean mic, double burn) {

        //System.out.println("**************************************************");
        //System.out.println("**********************RESULT**********************");
        //System.out.println("**************************************************");

        Behavior diagonsisdata = new Behavior(tem, occ, lum, uri, mic, burn);

        // create training set (logical AND function)
        DataSet trainSet = new DataSet(6, 0);

        trainSet.addRow(new DataSetRow(diagonsisdata.getAllDatas(), new double[]{}));

        Normalizer normalizer = new MaxNormalizer();
        normalizer.normalize(trainSet);

        for (DataSetRow testSetRow : trainSet.getRows()) {
            // for (DataSetRow testSetRow : testSet.getRows()) {
            neuralNet.setInput(testSetRow.getInput());
            neuralNet.calculate();

            // Finding network output
            double[] networkOutput = neuralNet.getOutput();
            System.out.println(" Output: " + (networkOutput[0] * 100));

        }
    }

    public static void main(String args[]) {
        CustomerCombackPrediction c = new CustomerCombackPrediction("MomentumBackpropagation", "customer_behavior");
        c.run(50, true, true, true, true, 50);
        c.run(100, true, true, true, true, 50);
        c.run(39, true, true, true, true, 50);
        c.run(39, true, true, true, true, 50);
        c.run(39, true, true, true, true, 50);
        c.run(39, true, true, true, false, 50);
        c.run(39, false, false, false, true, 50);
        c.run(39, true, false, false, false, 50);
        c.run(39, false, false, false, false, 50);
        c.run(39, false, false, false, false, 50);
        c.run(39, false, false, false, false, 50);
    }
}
