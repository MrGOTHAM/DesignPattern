package chapter24.program1;

public class Client {
    public static void main(String[] args) {
        Manager qiNingBi = new Manager("麒麟逼");
        Request request1 = new Request();
        request1.setRequestNumber(5);
        request1.setRequestContent("昭哥想去请假！ ");
        request1.setRequestType("请假");
        qiNingBi.getResult("经理", request1);

        Manager tuBi = new Manager("土逼");
        Request request2 = new Request();
        request2.setRequestType("加薪");
        request2.setRequestNumber(500);
        request2.setRequestContent("昊哥想加薪！ ");
        tuBi.getResult("总监", request2);

        Manager jinShao = new Manager("金少");
        jinShao.getResult("总经理", request2);
    }
}