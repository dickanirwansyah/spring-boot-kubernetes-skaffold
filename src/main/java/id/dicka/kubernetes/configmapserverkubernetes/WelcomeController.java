package id.dicka.kubernetes.configmapserverkubernetes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome")
public class WelcomeController {

    @Value("${message:Welcome to kubernetes controller message}")
    private String message;

    @GetMapping
    public String getMessage(){
        System.out.println(message);
        return message;
    }
}
