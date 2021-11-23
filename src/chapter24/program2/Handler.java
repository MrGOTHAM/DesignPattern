package chapter24.program2;

public abstract class Handler {
    protected Handler successor;
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }
    public abstract void HandleRequest(int request);
}
