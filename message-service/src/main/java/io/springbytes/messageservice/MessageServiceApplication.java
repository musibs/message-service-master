package io.springbytes.messageservice;

import io.springbytes.messageservice.message.MessageService;
import io.springbytes.messageservice.message.PrefixSuffixMessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner displayMessage(MessageService messageService){
        return args -> messageService.displayMessage("World");
    }

    @Bean
    public MessageService messageService() {
        return new PrefixSuffixMessageService();
    }

}
