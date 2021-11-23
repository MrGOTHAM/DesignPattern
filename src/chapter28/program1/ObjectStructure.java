package chapter28.program1;

import java.util.ArrayList;

public class ObjectStructure {
    private ArrayList arrayList = new ArrayList();
    public void attach(Human human){
        arrayList.add(human);
    }
    public void detach(Human human){
        arrayList.remove(human);
    }
    public void display(Action visitor){
        for (Object human : arrayList) {
            ((Human) human).accept(visitor);
        }
    }
}
