package InterFace;

public class MessageApp implements MessageInterface {
    public void sendmessage(){
        System.out.println("send message");

    }
    
    public void receivedMessage(){
        System.out.println("receive message");

    }

    public void reply(){
        System.out.println("reply to message");

    }


}
