import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int wynik=0;
        char operator;

        System.out.println("Wpisz pierwsza cyfre");
        int num1 = sc.nextInt();
        System.out.println("Wpisz znak operacji");
        operator = sc.next().charAt(0);
        System.out.println("Wpisz druga cyfre");
        int num2 = sc.nextInt();

        switch (operator) {
            case '+': wynik = num1 + num2;
            break;
            case '-': wynik = num1 + num2;
            break;
            case '*': wynik = num1 * num2;
            break;
            case '/': wynik = num1 / num2;
            break;
        }
        System.out.println(num1+""+operator+""+num2+" = "+wynik);
    }
}
