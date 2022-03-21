import java.util.Scanner;


public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Lahjan suuruus? ");
        int viesti = Integer.valueOf(lukija.nextLine());
        double luku = (viesti - 5000)*0.08 + 100;
        double luku2 = (viesti - 25000)*0.10 + 1700;
        double luku3 = (viesti - 55000)*0.12 + 4700;
        double luku4 = (viesti - 200000)*0.15 + 22100;
        double luku5 = (viesti - 1000000)*0.17 + 142100;
        
        if ((viesti >= 5000 ) & (viesti < 25000))   {
            System.out.println("Vero: " + luku);
        } else if ((viesti >= 25000 ) & (viesti < 55000)) {
            System.out.println("Vero " + luku2);
        } else if ((viesti >= 55000 ) & (viesti < 200000)) {
            System.out.println("Vero " + luku3);
        } else if ((viesti >= 200000 ) & (viesti < 1000000)) {
            System.out.println("Vero " + luku4);
        } else if (viesti >= 1000000)  {
            System.out.println("Vero " + luku5);
        } else {
            System.out.println("Ei veroa!");
        }
    }
}
