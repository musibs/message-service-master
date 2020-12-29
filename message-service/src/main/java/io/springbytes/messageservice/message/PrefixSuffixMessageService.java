package io.springbytes.messageservice.message;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PrefixSuffixMessageService implements MessageService {

    private String prefix = "Hello";
    private String suffix = "!";

    @Override
    public void displayMessage(String message) {
        String genMessage = String.format("%s %s%s", prefix, message, suffix);
        System.out.println(genMessage);
    }
}
