import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Mikä tiedosto luetaan?");
        String viesti = lukija.nextLine();
        
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get(viesti))) {

            while (tiedostonLukija.hasNextLine()) {
                lista.add(tiedostonLukija.nextLine());
            }
            for (String henkilo: lista)  {
                String[] palat = henkilo.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);
                if (ika > 1 || ika == 0) {
                    System.out.println(nimi + ", ikä: " + ika + " vuotta");
                } 
                else if (ika < 2 && ika != 0) {
                    System.out.println(nimi + ", ikä: " + ika + " vuosi");
                }

               
 
            }


            
            
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

    }
}
