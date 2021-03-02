import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz N");
        int n = sc.nextInt();

        int cyfra = 1;
        int cyfra2 = 1;
            for (int i = 3; i <= n; i++) {
            int j = cyfra + cyfra2;
            cyfra = cyfra2;
            cyfra2 = j;
                }
        System.out.println("Fibonacci Number = " +cyfra2);
    }
}

