package chapter24.program3;

import java.util.Objects;

public class Manager2 extends Handler{
    public Manager2(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (Objects.equals(request.getRequestType(), "请假") && request.getRequestNumber() <=5){
            System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 被同意了！");
        }else if (successor != null){
            successor.handlerRequest(request);
        }
    }

}
