package cz.upce.fei.nnpia.cv02.spring;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmail(String to, String message) {
        System.out.println("Email sent to " + to + " with body: " + message);
    }
}
