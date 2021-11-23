package chapter28.program1;


public class Female extends Human{
    @Override
    public void accept(Action visitor) {
        visitor.getFemaleConclusion(this);
    }
}
