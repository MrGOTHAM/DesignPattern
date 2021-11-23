package chapter26.program2;

import java.util.Hashtable;

public class FlyweightFactory {
    Hashtable flyweights = new Hashtable();

    public FlyweightWeb getFlyweightWeb(String type){
        if (!flyweights.contains(type)){
            flyweights.put(type, new Web());
        }
        return (FlyweightWeb)flyweights.get(type);
    }

    public int getWebCount(){
        return flyweights.size();
    }
}
