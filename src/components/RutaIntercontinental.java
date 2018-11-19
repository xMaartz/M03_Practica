/*
 * Una ruta intercontinental es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen, país de destí, continent d’origen i continent 
 * de destí
 */
package components;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class RutaIntercontinental {
    
    private static final Scanner DADES = new Scanner(System.in);

    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private String continentOri;
    private String continentDes;
    private double distancia;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    
    public RutaIntercontinental (String riCodi, String riAeroportOri, String riAeroportDes,  String riPaisOri, String riPaisDes, String riContOri, String riContDes, double riDistancia){
        this.codi = riCodi;
        this.aeroportOri = riAeroportOri;
        this.aeroportDes = riAeroportDes;
        this.paisOri = riPaisOri;
        this.paisDes = riPaisDes;
        this.continentOri = riContOri;
        this.continentDes = riContDes;
        this.distancia = riDistancia;
    }
    
    /*
    Mètodes accessors
    */
    
    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getAeroportOri() {
        return aeroportOri;
    }

    public void setAeroportOri(String aeroportOri) {
        this.aeroportOri = aeroportOri;
    }

    public String getAeroportDes() {
        return aeroportDes;
    }

    public void setAeroportDes(String aeroportDes) {
        this.aeroportDes = aeroportDes;
    }

    public String getPaisOri() {
        return paisOri;
    }

    public void setPaisOri(String paisOri) {
        this.paisOri = paisOri;
    }

    public String getPaisDes() {
        return paisDes;
    }

    public void setPaisDes(String paisDes) {
        this.paisDes = paisDes;
    }

    public String getContinentOri() {
        return continentOri;
    }

    public void setContinentOri(String continentOri) {
        this.continentOri = continentOri;
    }

    public String getContinentDes() {
        return continentDes;
    }

    public void setContinentDes(String continentDes) {
        this.continentDes = continentDes;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
   /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta internacional.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports i països no tene per què estar formats
    per una única paraula, per exemple, El Prat i Regne Unit.
     */
    public static RutaIntercontinental novaRutaIntercontinental() {
        
        System.out.print("Introdueix el codi: ");
        String nouCodi=DADES.next();
        
        System.out.print("Introdueix el aeroport d'origen: ");
        String nouAeroportOri=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport de desti: ");
        String nouAeroportDes=DADES.nextLine();
        
        System.out.print("Introdueix el pais d'origen: ");
        String nouPaisOri=DADES.nextLine();
        
        System.out.print("Introdueix el pais de desti: ");
        String nouPaisDes=DADES.nextLine();
        
        System.out.print("Introdueix el continent d'origen: ");
        String nouContOri=DADES.next();
        
        System.out.print("Introdueix el continent de desti: ");
        String nouContDes=DADES.next();

        System.out.print("Introdueix la distancia: ");
        double nouDistancia=DADES.nextDouble();
        
        RutaIntercontinental nouRutaIntercontinental = new RutaIntercontinental(nouCodi, nouAeroportOri, nouAeroportDes,nouPaisOri, nouPaisDes, nouContOri, nouContDes, nouDistancia);
        
        return nouRutaIntercontinental;
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los.
    
     Retorn: cap
     */
    public void modificarRutaIntercontinental() {

        mostrarRutaIntercontinental();
        
        System.out.print("Introdueix el codi: ");
        String nouCodi=DADES.next();
        
        System.out.print("Introdueix el aeroport d'origen: ");
        String nouAeroportOri=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport de desti: ");
        String nouAeroportDes=DADES.nextLine();
        
        System.out.print("Introdueix el pais d'origen: ");
        String nouPaisOri=DADES.nextLine();
        
        System.out.print("Introdueix el pais de desti: ");
        String nouPaisDes=DADES.nextLine();
        
        System.out.print("Introdueix el continent d'origen: ");
        String nouContOri=DADES.next();
        
        System.out.print("Introdueix el continent de desti: ");
        String nouContDes=DADES.next();

        System.out.print("Introdueix la distancia: ");
        double nouDistancia=DADES.nextDouble();
        
        this.codi = nouCodi;
        this.aeroportOri = nouAeroportOri;
        this.aeroportDes = nouAeroportDes;
        this.paisOri = nouPaisOri;
        this.paisDes = nouPaisDes;
        this.continentOri = nouContOri;
        this.continentDes = nouContDes;
        this.distancia = nouDistancia;
        
    }

    public void mostrarRutaIntercontinental() {
        System.out.println("\nLes dades de la ruta intercontinental amb codi " + getCodi() + " són:");
        System.out.println("\nAeroport d'origen: " + getAeroportOri());
        System.out.println("\nAeroport de destí: " + getAeroportDes());
        System.out.println("\nPaís d'origen: " + getPaisOri());
        System.out.println("\nPaís de destí: " + getPaisDes());
        System.out.println("\nContinent d'origen: " + getContinentOri());
        System.out.println("\nContinent de destí: " + getContinentDes());
        System.out.println("\nDistància: " + getDistancia());
    }

    
}

