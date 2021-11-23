package chapter25.pprogram1;

public class ConcreteMediator extends Mediator{
    private Colleague colleague1;
    private Colleague colleague2;


    @Override
    public void sendMessage(String message, Colleague colleague) {
        if (colleague1 == colleague){
            colleague2.notify(message);
        }else {
            colleague1.notify(message);
        }
    }
    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

}
