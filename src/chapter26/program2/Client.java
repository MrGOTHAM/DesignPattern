package chapter26.program2;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        FlyweightWeb web1 = flyweightFactory.getFlyweightWeb("x");
        FlyweightWeb web2 = flyweightFactory.getFlyweightWeb("y");
        FlyweightWeb web3 = flyweightFactory.getFlyweightWeb("x");

        web1.use("博客1");
        web2.use("博客2");
        web3.use("博客3");

        System.out.println(flyweightFactory.getWebCount());
    }
}
