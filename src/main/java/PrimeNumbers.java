import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int num =0;
        System.out.println("Wpisz N");
        int n = scanner.nextInt();
        for (i = 1; i <= n; i++)
        {
            int licznik=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    licznik = licznik + 1;
                }
            }
            if (licznik ==2)
            {
                System.out.println(i);
            }
        }

    }
}