package chapter28.program1;

public class Marriage extends Action{
    @Override
    public void getMaleConclusion(Male male) {
        System.out.println("男人结婚时，。。。。");
    }

    @Override
    public void getFemaleConclusion(Female female) {
        System.out.println("女人结婚时，。。。。。");
    }
}
