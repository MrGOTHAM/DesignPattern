package chapter26.program1;

public class UnsharedConcreteFlyweight extends Flyweight{
    @Override
    public void operation(int outerOp) {
        System.out.println("不能共享的UnsharedConcreteFlyweight："+outerOp);
    }
}
