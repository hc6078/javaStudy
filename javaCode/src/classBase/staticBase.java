package classBase;

// static字段和方法属于class，而不属于实例,所以所有的静态字段都是共享同一块内存
public class staticBase {
    public static void main(String[] args) {
        staticPerson ming = new staticPerson("Xiao Ming", 12);
        staticPerson hong = new staticPerson("Xiao Hong", 15);
        staticPerson tong = new staticPerson("Xiao Tong", 100);
        ming.number = 88;
        System.out.println(tong.number); //echo 88
        System.out.println(hong.number);// echo 88

        // 推荐用类名来访问静态字段。可以把静态字段理解为描述class本身的字段（非实例字段）
        staticPerson.getNumber();
        System.out.println(staticPerson.number);
    }
}

class staticPerson {
    public static int number;
    private String name;

    public staticPerson(String name, int number) {
        this.name = name;
        staticPerson.number = number; // 此处不能用this访问
    }

    public static int getNumber() {
        return number;
    }
}
