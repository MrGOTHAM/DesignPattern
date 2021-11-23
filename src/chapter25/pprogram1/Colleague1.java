package chapter25.pprogram1;

public class Colleague1 extends Colleague{
    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void notify(String message) {
        System.out.println("colleague1 收到消息，消息为："+message);
    }

    @Override
    void sendMessage(String message) {
        mediator.sendMessage(message,this);
    }
}
