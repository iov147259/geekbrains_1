public class First {

    int a1 = 100;
    static double b2 = 100.5;
    float c3 = 200.54f;
    static boolean d4 = false;
    static char e5 = 'e';
    static String s = "string";

    public static void main(String[] args) {
        System.out.println(computation(2.0, 2.5, 10.5, 3.0));
        System.out.println(compare(2.5, 7.5));
        System.out.println(positive(7));
        System.out.println(negative(-7));
        System.out.println(hello("Таня"));
        System.out.println(year(2020));
    }


    static double computation(double a, double b, double c, double d) {

        return a * (b + (c / d));
    }

    static boolean compare(double a, double b) {
        return (d4 = ((a + b >= 10) && (a + b <= 20)) ? true : false);
    }

    static String positive(int a) {
        return (s = (a >= 0) ? "передано положительное число" : "передано отрицательное число ");
    }

    static boolean negative(int a) {
        return (d4 = (a <= 0) ? true : false);


    }

    static String hello(String a) {
        return ("Привет, " + a + "!");
    }

    static String year(int a) {
        return s = ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))) ? a + " год является високосным" : a + " год не является високосным";
    }
}
