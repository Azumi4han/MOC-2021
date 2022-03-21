
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            
            String viesti = lukija.nextLine();
            if(viesti.equals("")) {
                break;
            }
            String[] palat = viesti.split(" ");     
            if (viesti.contains("av")) {
                
                for (int i = 0; i < palat.length; i++) {
                    if (palat[i].contains("av")) {
                        System.out.println(palat[i]);
                    }             
                }
            }
        }
    }
}
