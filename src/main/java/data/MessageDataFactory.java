package data;

import net.datafaker.Faker;

public class MessageDataFactory {

    private static Faker faker = new Faker();

    private MessageDataFactory(){
        faker = new Faker();
    }

    public static Message createMessage(){
        return new MessageBuilder()
                .name(faker.name().fullName())
                .email(faker.internet().emailAddress())
                .phoneNumber(faker.number().digits(11))
                .subject(faker.internet().emailSubject())
                .message(faker.text().toString())
                .build();
    }

}
