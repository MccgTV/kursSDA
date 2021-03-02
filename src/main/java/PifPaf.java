import  java.util.Scanner;

public class PifPaf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz liczbe calkowita");
        int i = sc.nextInt();

        for (int j = 0; j <= i; j++) {
                if (j % 3 == 0) {
                System.out.println("pif"); }
                else if (j % 7 == 0) {
                System.out.println("paf"); }
                else if (j % 3 == 0 && j % 7 == 0) {
                System.out.println("pif paf"); }
                else {
                        System.out.println(j);
                    }
                }

            }

        }



