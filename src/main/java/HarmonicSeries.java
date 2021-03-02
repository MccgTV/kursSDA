import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz n");
        double n = sc.nextDouble();


        double result = 0;
        for (int i = 1; i<=n; i++) {
            result = result + (float)1/i;
        }
        System.out.println("wynik to "+result);
    }
        }
