package lesson;

public class Recursion {


    static int res = 0;

    public static void main(String[] args) {

        //f(0);
        //System.out.println(fib(7));

        System.out.println(fact(5));


    }


    public static void f(int arg) {
        System.out.print(" " + arg);
        if (arg < 10) {
            f(arg + 1);
        }
        System.out.print(" -" + arg);
    }


    public static int fib(int n) {

        if (n == 0) return 1;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);

    }

    //  5! = 1*2*3*4*5
    public static int fact(int n) {

        if (n > 0) {
            res = fact(n * (n - 1));
            n--;
        }

        return res;

    }
}