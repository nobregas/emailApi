package org.gabnob.emailapi.controllers;


import lombok.RequiredArgsConstructor;
import org.gabnob.emailapi.dtos.EmailDto;
import org.gabnob.emailapi.services.EmailService;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;


    @PostMapping
    public void sendEmail(@RequestBody EmailDto emailDto) {
        emailService.sendEmail(emailDto);
    }


}
