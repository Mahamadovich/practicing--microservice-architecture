package com.practicing_microservices.twitter_to_kafka;

import com.practicing_microservices.app_configuration.AppConfig;
import com.practicing_microservices.twitter_to_kafka.runner.StreamRunner;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
@ComponentScan(basePackages = "com.practicing_microservices")
public class TwitterToKafkaService implements CommandLineRunner {
    private final AppConfig config;
    private final StreamRunner runner;

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaService.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("\uD83D\uDD30 Our application succesfully started! \uD83D\uDD30");
        log.info(config.getWelcomeMessage());
        runner.start();
    }
}
