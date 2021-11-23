package chapter28.program1;

public class Success extends Action{
    @Override
    public void getMaleConclusion(Male male) {
        System.out.println("男人成功时，。。。。。。");
    }

    @Override
    public void getFemaleConclusion(Female female) {
        System.out.println("女人成功时，。。。。。。");

    }
}
