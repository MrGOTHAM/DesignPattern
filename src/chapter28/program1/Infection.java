package chapter28.program1;

public class Infection extends Action{


    @Override
    public void getMaleConclusion(Male male) {
        System.out.println("男人恋爱时，。。。。。。。。");
    }

    @Override
    public void getFemaleConclusion(Female female) {
        System.out.println("女人恋爱时，。。。。。。。。");
    }
}
