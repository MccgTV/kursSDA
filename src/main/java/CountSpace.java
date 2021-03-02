import java.util.Scanner;

public class CountSpace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz tekst");
        String tekst = sc.nextLine();
        float spacje=0f;
        float wynik;
        float dlugosc=0f;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == ' ') {
                spacje++;
                dlugosc = tekst.length();
                }
        }
        wynik = spacje/dlugosc*100;
        System.out.println("Ilosc % spacji to " + wynik);

    }
}