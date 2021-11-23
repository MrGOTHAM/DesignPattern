package chapter24.program2;

public class ConcreteHandler1 extends Handler{
    @Override
    public void HandleRequest(int request) {
        if (request>=0 && request < 10){
            System.out.println("this request has been dealed by Handler1 ! And request=="+request);
        }else if (successor != null){
            successor.HandleRequest(request);
        }
    }
}
