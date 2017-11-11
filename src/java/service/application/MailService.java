/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.application;

import java.util.Properties;
import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Do Hung Cuong
 */
public class MailService {

    public static String sendEmail(String message, String sendto, String subject) {
        if(message == null || message.equals("") || subject == null || subject.equals("")) {
            return "Please input subject and message!";
        }
        String from = "cuongvip1295@gmail.com";
        String login = "cuongvip1295@gmail.com";
        String password = "Cuong@123";
        try {
            Properties props = new Properties();
            props.setProperty("mail.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            Authenticator auth = new SMTPAuthenticator(login, password);
            Session session = Session.getInstance(props, auth);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(message);
            msg.setSubject(subject);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(sendto));
            Transport.send(msg);
        } catch (AuthenticationFailedException ex) {
            return "Authentication failed";
        } catch (AddressException ex) {
            return "Wrong email address";
        } catch (MessagingException ex) {
            return "ErrorMessage";
        }
        return "Sent successfully";
    }

    private static class SMTPAuthenticator extends Authenticator {

        private final PasswordAuthentication authentication;

        public SMTPAuthenticator(String login, String password) {
            authentication = new PasswordAuthentication(login, password);
        }

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return authentication;
        }
    }
}
