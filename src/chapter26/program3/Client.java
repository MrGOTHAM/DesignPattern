package chapter26.program3;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight fx = flyweightFactory.getFlyweight("x");
        Flyweight fy = flyweightFactory.getFlyweight("y");
        Flyweight fz = flyweightFactory.getFlyweight("z");
        Flyweight fa = flyweightFactory.getFlyweight("x");

        fx.use(new User("金少"));
        fy.use(new User("土逼"));
        fz.use(new User("麒麟臂"));
        fa.use(new User("安"));

        flyweightFactory.getFlyweightCount();
    }
}
