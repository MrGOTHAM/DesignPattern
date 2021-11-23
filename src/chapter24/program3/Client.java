package chapter24.program3;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new Manage1("麒麟逼");
        Handler handler2 = new Manager2("土逼");
        Handler handler3 = new Manager3("金少");
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        Request request1 = new Request();
        request1.setRequestContent("昭哥要请假 ！");
        request1.setRequestNumber(7);
        request1.setRequestType("请假");
        handler1.handlerRequest(request1);

        request1.setRequestNumber(3);
        handler1.handlerRequest(request1);

        request1.setRequestNumber(2);
        handler1.handlerRequest(request1);

    }
}
