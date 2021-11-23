package chapter26.program1;

public class ConcreteFlyweight extends Flyweight{
    @Override
    public void operation(int outerOp) {
        System.out.println("具体的对象ConcreteFlyweight1："+ outerOp);
    }
}
