package classBase;

class personBase {
    private String name;
    protected int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
      在类的内部可以访问自身protected，private成员
     */
    private void personFunction() {
        System.out.println(name);
        System.out.println(age);
    }
}

class sonBase extends personBase {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void sonFunction() {
        System.out.println(super.age); // 通过继承可以访问父类protected成员
        //System.out.println(super.name); //error 无法通过继承访问父类private成员
    }
}

public class extendsBase {
    public static void main(String[] args) {
        personBase person = new personBase();
        System.out.println(person.age); // 类外部：可以访问自身对象protected成员
        //System.out.println(person.name); // error 类外部：无法访问自身对象private成员

        sonBase son = new sonBase();
        System.out.println(son.age); // 子类可以访问父类protected成员
        //System.out.println(son.name); //error  子类无法访问父类private成员
    }
}