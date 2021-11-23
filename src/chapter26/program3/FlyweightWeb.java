package chapter26.program3;

public class FlyweightWeb extends Flyweight{
    private String name;
    FlyweightWeb(String name){
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName() + "is using "+name);
    }
}
