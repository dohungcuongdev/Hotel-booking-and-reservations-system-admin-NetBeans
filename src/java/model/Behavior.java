package model;

public final class Behavior {

    private double totalTimeAccess;
    private boolean hasAccount;
    private boolean hadFeedback;
    private boolean hadViewRoom;
    private boolean hadVoteRoom;
    private double percentComback;

    public double getTotalTimeAccess() {
        return totalTimeAccess;
    }

    public void setTotalTimeAccess(double totalTimeAccess) {
        this.totalTimeAccess = totalTimeAccess;
    }

    public boolean isHasAccount() {
        return hasAccount;
    }

    public void setHasAccount(boolean hasAccount) {
        this.hasAccount = hasAccount;
    }

    public boolean isHadFeedback() {
        return hadFeedback;
    }

    public void setHadFeedback(boolean hadFeedback) {
        this.hadFeedback = hadFeedback;
    }

    public boolean isHadViewRoom() {
        return hadViewRoom;
    }

    public void setHadViewRoom(boolean hadViewRoom) {
        this.hadViewRoom = hadViewRoom;
    }

    public boolean isHadVoteRoom() {
        return hadVoteRoom;
    }

    public void setHadVoteRoom(boolean hadVoteRoom) {
        this.hadVoteRoom = hadVoteRoom;
    }

    public double getPercentComback() {
        return percentComback;
    }

    public void setPercentComback(double percentComback) {
        this.percentComback = percentComback;
    }

    public Behavior(double totalTimeAccess, boolean hasAccount, boolean hadFeedback, boolean hadViewRoom, boolean hadVoteRoom, double percentComback) {
        this.totalTimeAccess = totalTimeAccess;
        this.hasAccount = hasAccount;
        this.hadFeedback = hadFeedback;
        this.hadViewRoom = hadViewRoom;
        this.hadVoteRoom = hadVoteRoom;
        this.percentComback = percentComback;
    }

    public double[] getAllDatas() {
        return new double[]{totalTimeAccess, hasAccount ? 1 : 0, hadFeedback ? 1 : 0, hadViewRoom ? 1 : 0, hadVoteRoom ? 1 : 0, percentComback};
    }

}
