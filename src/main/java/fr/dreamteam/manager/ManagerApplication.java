package fr.dreamteam.manager;

import fr.dreamteam.manager.schedule.ManagerRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ManagerApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(ManagerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class, args);
    }

    @Override
    public void run(String... args) {
        logger.info("Lancement de manager");
    }

}
