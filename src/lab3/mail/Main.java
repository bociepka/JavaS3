package lab3.mail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class Main {
    public static void main(String[] argv) {

        final String username;
        final String password;

        EmailMessage wiadomosc = EmailMessage.builder()
                .addFrom("bargal2015@gmail.com")
                .addTo("bargal2015@gmail.com")
                .addSubject("Test")
                .addContent("Tresc")
                .build();

        System.out.print("Podaj haslo: ");
        username = wiadomosc.getFrom();
        Scanner odczyt = new Scanner(System.in);
        password = odczyt.nextLine();


        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username,password);
                    }
                });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(wiadomosc.getFrom()));
            for (int i = 0; i < wiadomosc.getTo().size(); i++) {
                message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(wiadomosc.getTo().get(i)));
            }
            message.setSubject(wiadomosc.getSubject());
            message.setText(wiadomosc.getContent());
            Transport.send(message);
            System.out.println("Sent message successfully....");

        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }
}