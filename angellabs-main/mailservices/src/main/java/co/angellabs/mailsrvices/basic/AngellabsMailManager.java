/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.angellabs.mailsrvices.basic;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessagePreparator;

public class AngellabsMailManager {

    private JavaMailSender mailSender;
    private String  fromMail;
    private String toMail;
    private String subject;
    private String bodyText;

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public String getFromMail() {
        return fromMail;
    }

    public void setFromMail(String fromMail) {
        this.fromMail = fromMail;
    }

    public JavaMailSender getMailSender() {
        return mailSender;
    }

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getToMail() {
        return toMail;
    }

    public void setToMail(String toMail) {
        this.toMail = toMail;
    }


    public void sendMail() {

        MimeMessagePreparator preparator = new MimeMessagePreparator() {

            public void prepare(MimeMessage mimeMessage) throws Exception {
                mimeMessage.setRecipient(Message.RecipientType.TO,
                        new InternetAddress(getToMail()));
                mimeMessage.setFrom(new InternetAddress(getFromMail()));
                mimeMessage.setSubject(getSubject());
                mimeMessage.setText(getBodyText());
            }
//        };
//        try {
//            this.mailSender.send(preparator);
//        } catch (MailException ex) {
//            // simply log it and go on...
//            System.err.println(ex.getMessage());
        };

        Properties mailProp = new Properties();
        mailProp.setProperty("mail.smtp.auth", "true");
        mailProp.setProperty("mail.smtp.socketFactory.port", "465");
        mailProp.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        mailProp.setProperty("mail.smtp.socketFactory.fallback", "false");

        Authenticator smtpAuthe = new SmtpAuthenticator("contact@viswgnabharathi.com", "v.bharathi");

        javax.mail.Session mailSession = javax.mail.Session.getInstance(mailProp, smtpAuthe);

        JavaMailSenderImpl mail = new JavaMailSenderImpl();
        mail.setHost("smtp.gmail.com");
        mail.setSession(mailSession);
        mailSender = mail;

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(getFromMail());
        message.setTo(getToMail());
        message.setSubject(getSubject());
        message.setText(getBodyText());
        try {
            mailSender.send(preparator);
        } catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
    }
}
