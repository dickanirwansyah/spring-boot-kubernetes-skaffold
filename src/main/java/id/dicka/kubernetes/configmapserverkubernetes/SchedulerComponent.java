package id.dicka.kubernetes.configmapserverkubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerComponent {

    @Autowired
    WelcomeConfig config;

    @Scheduled(fixedDelay = 3000)
    public void scheduled(){
        System.out.println(config.getMessage());
    }
}
