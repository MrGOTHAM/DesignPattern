package chapter24.program3;

import java.util.Objects;

public class Manager3 extends Handler{
    public Manager3(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (Objects.equals(request.getRequestType(), "请假") && request.getRequestNumber() <=10){
            System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 被同意了！");
        }else if (successor != null){
            successor.handlerRequest(request);
        }
    }
}
