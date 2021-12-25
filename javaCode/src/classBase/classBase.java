package classBase;

class Test {

    public String getName() {
        return "eeeee";
    }
}

public class classBase {

    private int age;
    private String name;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public classBase(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.getName();

        classBase base = new classBase(10, "200");
        base.setAge(100);
        System.out.println(base.getAge());
    }
}
