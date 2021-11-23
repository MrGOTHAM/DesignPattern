package chapter28.program1;

public class Failing extends Action{
    @Override
    public void getMaleConclusion(Male male) {
        System.out.println("男人失败时，。。。。。。");
    }

    @Override
    public void getFemaleConclusion(Female female) {
        System.out.println("女人失败时，。。。。。。");

    }
}
