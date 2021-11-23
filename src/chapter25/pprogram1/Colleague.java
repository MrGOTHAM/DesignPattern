package chapter25.pprogram1;

abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void notify(String message);
    abstract void sendMessage(String message);
}
