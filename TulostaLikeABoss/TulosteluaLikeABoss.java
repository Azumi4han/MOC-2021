
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        
        int i = 0;
        while(maara > i) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        
        int i = 0;
        while (i < maara) {
            System.out.print(" ");
            i++;
        }
    }

    public static void tulostaKolmio(int koko) {  
        int i = 0;
        int tyhjat = koko - 1;
        int tahdet = (koko  - koko ) + 1;
        
        
        while(i < koko ) {
            tulostaTyhjaa(tyhjat);
            tulostaTahtia(tahdet);
           
            
            i++;
            tyhjat--;
            tahdet++;
        }
    }

    public static void jouluKuusi(int korkeus) {
        int i = 0;
        int tyhjat = korkeus - 1;
        int tahdet = (korkeus  - korkeus ) + 1;
        
        int jalkaTyhjat = 0;
        int jalkaTahdet = 0;
        
        while(i < korkeus ) {
            tulostaTyhjaa(tyhjat);
            tulostaTahtia(tahdet);
            
            if(i == 1) {
                jalkaTyhjat = tyhjat;
                jalkaTahdet = tahdet;
            }
            tulostaTyhjaa(0);
            
            i++;
            tyhjat--;
            tahdet++;
            tahdet++;
        }
        // jalka
        for(int j = 0; j < 2;j++) {
            tulostaTyhjaa(jalkaTyhjat);
            tulostaTahtia(jalkaTahdet);
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
