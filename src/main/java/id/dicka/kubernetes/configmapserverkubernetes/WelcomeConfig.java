package id.dicka.kubernetes.configmapserverkubernetes;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "welcome")
@Configuration
public class WelcomeConfig {

    private String message = "welcome to kubernetes";


}
