import java.util.Scanner;

public class SumInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz liczbe");
        int liczba = sc.nextInt();
        int suma = 0;

        while (liczba != 0) {
            suma += liczba%10;
            liczba /= 10;
        }
        System.out.println(suma);
    }
}
