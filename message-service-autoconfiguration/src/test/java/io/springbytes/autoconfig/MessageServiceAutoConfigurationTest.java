package io.springbytes.autoconfig;

import static org.assertj.core.api.Assertions.*;

import io.springbytes.messageservice.message.MessageService;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.boot.test.system.OutputCaptureRule;


public class MessageServiceAutoConfigurationTest {

    @Rule
    private OutputCaptureRule outputCaptureRule = new OutputCaptureRule();

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(MessageAutoConfiguration.class));

    @Test
    public void testDefaultServiceAutoConfigured() {
        this.contextRunner.run(context -> {
            assertThat(context).hasSingleBean(MessageService.class);
            context.getBean(MessageService.class).displayMessage("World");
            assertThat(this.outputCaptureRule.toString()).contains("Hello World!");
        });
    }
}
