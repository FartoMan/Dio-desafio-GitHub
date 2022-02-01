package one.dio.gftbootcamp;

public class Main {

    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuições");
        atribuicoes();
        System.out.println("Precedencias");
        precedencia();

    }

    public static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d*b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%b: " + r5);

    }

    private static void atribuicoes() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int  k = 35;
        float f = 3.5F;
        double d = f;

        System.out.println("d: " + f);

        i += 5; // i = i + 5
        j -= 3; // j ] j - 3
        d /= 2.7d; // d + d / 2.7d
        l *= 3; // l = l + 3
        k %= 2; // k = k % 2

        System.out.println("i :" + i);
        System.out.println("j :" + j);
        System.out.println("d :" + d);
        System.out.println("l :" + l);
        System.out.println("k :" + k);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k= 30;

        int a = i++ + --j * k; // 10 + 19 * 30

        System.out.println("i++ + --j * k: " + a);

        System.out.println("i: " + i);

        int b = k / --i % j + i;

        System.out.println("k / --i % j + i: " + b);

        System.out.println("i: " + i);

        int c = 2;

        c += i += 5;

        System.out.println("c += i += 5: " + c);

    }

}
