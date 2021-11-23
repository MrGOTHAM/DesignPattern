package chapter26.program1;


import java.util.Hashtable;

public class FlyweightFactory {

  Hashtable flyweights = new Hashtable();
  public FlyweightFactory(){
      flyweights.put("x", new ConcreteFlyweight());
      flyweights.put("y", new ConcreteFlyweight());
      flyweights.put("z", new ConcreteFlyweight());
  }

  public Flyweight getFlyweight(String s){
      return (Flyweight) flyweights.get(s);
  }
}
