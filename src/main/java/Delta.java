import java.util.Scanner;
import java.lang.Math;

public class Delta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1;
        double x2;

        System.out.println("Wpisz A");
        int a = sc.nextInt();
        System.out.println("Wpisz B");
        int b = sc.nextInt();
        System.out.println("Wpisz C");
        int c = sc.nextInt();

        double delta = b*b-4*a*c;

        if (delta < 0) {
            System.out.println("Brak rozwiązań (delta < 0)");
        } else if (delta == 0) {
            double x;
            x = -b / (2 * a);
            System.out.printf("Jedno podwójne rozwiązanie x = %f", x);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Istnieją dwa rozwiązania x1 = %f oraz x2 = %f", x1, x2);
        }
    }
}
