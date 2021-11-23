package chapter26.program3;

import java.util.Hashtable;

public class FlyweightFactory {
    Hashtable flyweights = new Hashtable();

    public Flyweight getFlyweight(String type){
        if (!flyweights.contains(type)){
            flyweights.put(type,new FlyweightWeb(type));
        }
        return (Flyweight) flyweights.get(type);
    }

    public void getFlyweightCount(){
        System.out.println(flyweights.size());
    }
}
