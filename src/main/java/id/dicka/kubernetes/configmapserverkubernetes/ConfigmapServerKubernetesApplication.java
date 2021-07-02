package id.dicka.kubernetes.configmapserverkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ConfigmapServerKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigmapServerKubernetesApplication.class, args);
	}

}
