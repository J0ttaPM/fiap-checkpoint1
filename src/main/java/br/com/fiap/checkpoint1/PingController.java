package br.com.fiap.checkpoint1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping
public class PingController {

    @Value("${spring.profiles.active:}")
    private  String activeProfile;

    @GetMapping("/ping")
    public String ping() {
        String message = "Pong";
        if (activeProfile.equals("dev")) {
            message = "Pong em dev";
        } else if (activeProfile.equals("stg")) {
            message = "Pong em stg";
        } else if (activeProfile.equals("prd")) {
            message = "Pong em prd";
        }
        return message;
    }
}