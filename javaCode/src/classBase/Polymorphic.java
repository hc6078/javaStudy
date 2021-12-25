package classBase;


// Overload(重载) 如果方法签名不同，Overload方法是一个新方法；
// Override(重写) 方法签名相同，并且返回值也相同。

// 多态实现的条件
// 1 子类继承父类
// 2 子类重写父类方法
// 3 父类对象实例指向子类对象

public class Polymorphic {
    public static void main(String[] args) {
        Person p = new Student();
        p.run(); // 对象p是person类型，但是初始化的是student,所以在运行时动态绑定为student
    }
}

class Person {
    public void run() {
        System.out.println("Person.run");
    }
}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}