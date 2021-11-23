package chapter24.program2;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int []request = {2,5,14,22,18,3,27,20};
        for (int r : request) {
            handler1.HandleRequest(r);
        }
    }
}
