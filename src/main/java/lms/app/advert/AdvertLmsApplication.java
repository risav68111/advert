package lms.app.advert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = "lms.app")
@EntityScan(basePackages = "lms.app")
@EnableJpaRepositories(basePackages = "lms.app") @Slf4j
public class AdvertLmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvertLmsApplication.class, args);
        log.info("Server is running...");
    }

}
