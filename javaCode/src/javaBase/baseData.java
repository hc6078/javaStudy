package javaBase;

import static sun.misc.Version.println;

public class baseData {
    private static boolean a;
    public static void main(String[] args) {
//        a = true;
//        if (!a) {
//            System.out.println("ok1");
//        }else {
//            System.out.println("99");
//        }
//        String str = "abaa";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }

        int[] ns =  { 68, 79, 91, 85, 62 };
        //System.out.println(ns[0]);

//        String[] ss = {"str1","str2"};
//        System.out.println(ss[1]);

        ns = new int[]{1,2,3,4,};
        for (int i = 0; i < ns.length; i++) {
            System.out.println(ns[i]);
        }

        int a = 100;
        do {
            a+=2;
        }while (a<200);
        System.out.println(a);
    }
}
