package pk1;

/**
 * Created by Livia on 11/2/2014.
 */
public class main {

    public static void main(String [] args) {
        // System.out.println("hello world");

        NrCalatori calatAutomobil = new automobil("B 56 GFD");
        autovehicule v1 = new motociclete(null);

        v1.setNumar("B89334");
        System.out.println("Motocicleta are urmatorul numar de inmatriculare: " + v1.getNumar());

        try {
            int x=v1.nr_pasageri();
            if(x <=2)
                System.out.println("aceasta este o motocicleta");
            else
                System.out.println("aceasta nu este o motocicleta");
        } catch (PasageriException e) {
            System.out.println("Exceptie numar pasageri " + e.getMessage());

        }

        automobil v2=new automobil(null);
        try {
            v2.setModel("Volkswagen");
        }catch (Exception e) {
            System.out.println("Acest automobil este " + v2.model_auto());
        }

        try {
        v2.detalii();
        }catch (Exception e) {
            System.out.println("Eroare detalii autovehicule");
        }
        }
    }

