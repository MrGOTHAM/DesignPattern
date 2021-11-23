package chapter24.program2;

public class ConcreteHandler2 extends Handler{
    @Override
    public void HandleRequest(int request) {
        if (request>=10 && request < 20){
            System.out.println("this request has been dealed by Handler2 ! And request=="+request);
        }else if (successor != null){
            successor.HandleRequest(request);
        }
    }
}
