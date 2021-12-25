package classBase;

public class abstractBase {
    public static void main(String[] args) {
        //abstractPerson ap = new abstractPerson(); // error 抽象类不能实例化本身
        abstractPerson boy = new Boy();
        abstractPerson girl = new Girl();
        boy.run();
        girl.run();
    }
}

abstract class abstractPerson {
    public abstract void run(); // 一个方法定义为abstract，表示只声明不实现,
}

class Boy extends abstractPerson {
    @Override
    public void run() {
        System.out.println("Boy.run");
    }
}

class Girl extends abstractPerson {

    @Override
    public void run() {
        System.out.println("Girl.run");
    }
}