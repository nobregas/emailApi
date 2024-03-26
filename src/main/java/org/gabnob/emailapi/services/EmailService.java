package org.gabnob.emailapi.services;

import lombok.RequiredArgsConstructor;
import org.gabnob.emailapi.dtos.EmailDto;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender javaMailSender;

    public void sendEmail(EmailDto emailDto) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("emailservicenob@gmail.com");
        message.setTo(emailDto.to());
        message.setSubject(emailDto.subject());
        message.setText(emailDto.body());

        javaMailSender.send(message);
    }

}
