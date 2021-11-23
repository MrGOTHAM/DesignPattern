package chapter24.program3;

public abstract class Handler {
    protected String name;
    protected Handler successor;
    public Handler(String name){
        this.name = name;
    }
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }
    public abstract void handlerRequest(Request request);

}
