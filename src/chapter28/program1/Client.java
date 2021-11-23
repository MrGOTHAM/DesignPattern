package chapter28.program1;

public class Client {
    public static void main(String[] args) {
        Male male = new Male();
        Female female = new Female();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(male);
        objectStructure.attach(female);

        objectStructure.display(new Failing());
        objectStructure.display(new Success());
        objectStructure.display(new Infection());
        objectStructure.display(new Marriage());

        objectStructure.detach(male);
        objectStructure.display(new Failing());
        objectStructure.display(new Success());
        objectStructure.display(new Infection());
    }
}
