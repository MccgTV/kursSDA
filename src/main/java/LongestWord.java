import  java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tekst;
        int maxLength = 0;
        String longestWord ="";

        while (sc.hasNextLine()) {
            tekst = sc.nextLine();
            if (tekst.length() > maxLength){
                maxLength = tekst.length();
                longestWord = tekst; }

            if (tekst.equals("Starczy")) {
                System.out.println("Najdluzsze slowo to " + longestWord);
                break;
            } else if (tekst.isEmpty()) {
                System.out.println("Nie podano zadnego tekstu");
                continue;
            }

        }
    }
}
