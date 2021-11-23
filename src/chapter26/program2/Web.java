package chapter26.program2;

public class Web extends FlyweightWeb{
    @Override
    public void use(String content) {
        System.out.println("具体的Web网站, 网站类型为："+ content);
    }
}
