import java.lang.Math;
import java.util.Scanner;

public class CircleField {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double PI = Math.PI;
        double poleKola;
        double srednica = sc.nextDouble();
        poleKola = PI*(srednica*srednica);
        System.out.println(poleKola);

    }
}
