package chapter24.program2;

public class ConcreteHandler3 extends Handler{
    @Override
    public void HandleRequest(int request) {
        if (request>=20 && request < 30){
            System.out.println("this request has been dealed by Handler3 ! And request=="+request);
        }else if (successor != null){
            successor.HandleRequest(request);
        }
    }
}
