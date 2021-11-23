package chapter25.pprogram1;

public class Client {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Colleague colleague1 = new Colleague1(mediator);
        Colleague colleague2 = new Colleague2(mediator);
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.sendMessage("我是colleague1啊！！！");


    }


}
