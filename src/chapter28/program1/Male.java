package chapter28.program1;

public class Male extends Human{
    @Override
    public void accept(Action visitor) {
        visitor.getMaleConclusion(this);
    }
}
