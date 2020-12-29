package io.springbytes.autoconfig;

import io.springbytes.messageservice.message.MessageService;
import io.springbytes.messageservice.message.PrefixSuffixMessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageAutoConfiguration {

    @Bean
    public MessageService messageService() {
        return new PrefixSuffixMessageService();
    }
}
