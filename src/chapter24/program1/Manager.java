package chapter24.program1;

import java.util.Objects;

public class Manager {
    private String name;
    public Manager(String name){
        this.name = name;
    }

    public void getResult(String managerLevel , Request request){
        if (Objects.equals(managerLevel, "经理")){
            if (Objects.equals(request.getRequestType(), "请假") && request.getRequestNumber() <=2){
                System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 被同意了！");
            }else {
                System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 无权处理！");
            }
        }else if (Objects.equals(managerLevel, "总监")){
            if (Objects.equals(request.getRequestType(), "请假") && request.getRequestNumber()<=5){
                System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 被同意了！");

            }else {
                System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 无权处理！");

            }
        }else if (Objects.equals(managerLevel, "总经理")){
            if (Objects.equals(request.getRequestType(), "请假")){
                System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 被同意了！");
            }else if (Objects.equals(request.getRequestType(), "加薪") && request.getRequestNumber() <= 500){
                System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 被同意了！");

            }else if (Objects.equals(request.getRequestType(), "加薪") && request.getRequestNumber() >=1000){
                System.out.println(name+" :"+request.getRequestContent()+" 数量："+request.getRequestNumber()+" 以后再说吧！");

            }
        }
    }
}
