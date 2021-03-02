import java.util.Scanner;
public class Wave {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wpisz dlugosc fali");
        int wave_lenght = sc.nextInt();
        int wave_height=4;
        int wH = wave_height-1;
        int x = wH;

        for (int i=0 ; i<=wH;i++) {
            for (int j = 0; j < wH*wave_lenght*2; j++) {
                if (j % (wH * 2) == x || j % (wH * 2) == wH + i) {
                    System.out.println("*");
                } else {
                    System.out.println(" ");
                }
            }
            x--;
            System.out.println();
                }
            }

            }