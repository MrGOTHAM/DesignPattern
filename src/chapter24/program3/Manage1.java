package chapter24.program3;

import java.util.Objects;

public class Manage1 extends Handler{
    public Manage1(String name) {
        super(name);
    }
    @Override
    public void handlerRequest(Request request) {
        if (Objects.equals(request.getRequestType(), "请假") && request.getRequestNumber() <=2){
            System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 被同意了！");
        }else if (successor != null){
            successor.handlerRequest(request);
        }
    }
}
