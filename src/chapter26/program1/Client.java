package chapter26.program1;

public class Client {
    public static void main(String[] args) {
        int outerValue = 22;

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight fx = flyweightFactory.getFlyweight("x");
        Flyweight fy = flyweightFactory.getFlyweight("y");
        Flyweight fz = flyweightFactory.getFlyweight("z");

        fx.operation(--outerValue);
        fy.operation(--outerValue);
        fz.operation(--outerValue);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--outerValue);
    }
}
