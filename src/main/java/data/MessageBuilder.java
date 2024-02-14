package data;

public class MessageBuilder {

    private String name;
    private String email;
    private String phoneNumber;
    private String subject;
    private String message;

    public MessageBuilder name(String name){
        this.name = name;
        return this;
    }

    public MessageBuilder email(String email){
        this.email = email;
        return this;
    }

    public MessageBuilder phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public MessageBuilder subject(String subject){
        this.subject = subject;
        return this;
    }

    public MessageBuilder message(String message){
        this.message = message;
        return this;
    }

    public Message build(){
        return new Message(name, email, phoneNumber, subject, message);
    }



}
