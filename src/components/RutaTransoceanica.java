/*
 * Una ruta transoceànica es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen, país de destí, continent d’origen, continent 
 * de destí i oceà que sobrevola.
 */
package components;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class RutaTransoceanica {

    private static final Scanner DADES = new Scanner(System.in);
    
    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private String continentOri;
    private String continentDes;
    private String ocea;
    private double distancia;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    
    public RutaTransoceanica (String rtCodi, String rtAeroportOri, String rtAeroportDes,  String rtPaisOri, String rtPaisDes, String rtContOri, String rtContDes, String rtOcea, double rtDistancia){
        this.codi = rtCodi;
        this.aeroportOri = rtAeroportOri;
        this.aeroportDes = rtAeroportDes;
        this.paisOri = rtPaisOri;
        this.paisDes = rtPaisDes;
        this.continentOri = rtContOri;
        this.continentDes = rtContDes;
        this.ocea = rtOcea;
        this.distancia = rtDistancia;
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

    public String getOcea() {
        return ocea;
    }

    public void setOcea(String ocea) {
        this.ocea = ocea;
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
    - Demanar a l'usuari les dades per consola per crear una nova ruta transcoceanica.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports i països no tene per què estar formats
    per una única paraula, per exemple, El Prat i Regne Unit.
     */
    public static RutaTransoceanica novaRutaTransoceanica() {

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
        
        System.out.print("Introdueix el oceà: ");
        String nouOcea=DADES.next();

        System.out.print("Introdueix la distancia: ");
        double nouDistancia=DADES.nextDouble();
        
        RutaTransoceanica nouRutaTransoceanica = new RutaTransoceanica(nouCodi, nouAeroportOri, nouAeroportDes,nouPaisOri, nouPaisDes, nouContOri, nouContDes, nouOcea, nouDistancia);
        
        return nouRutaTransoceanica;
        
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
    public void modificarRutaTransoceanica() {

        mostrarRutaTransoceanica();
        
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
        
        System.out.print("Introdueix el oceà: ");
        String nouOcea=DADES.next();

        System.out.print("Introdueix la distancia: ");
        double nouDistancia=DADES.nextDouble();
        
        this.codi = nouCodi;
        this.aeroportOri = nouAeroportOri;
        this.aeroportDes = nouAeroportDes;
        this.paisOri = nouPaisOri;
        this.paisDes = nouPaisDes;
        this.continentOri = nouContOri;
        this.continentDes = nouContDes;
        this.ocea = nouOcea;
        this.distancia = nouDistancia;
        
    }

    public void mostrarRutaTransoceanica() {
        System.out.println("\nLes dades de la ruta transoceànica amb codi " + getCodi() + " són:");
        System.out.println("\nAeroport d'origen: " + getAeroportOri());
        System.out.println("\nAeroport de destí: " + getAeroportDes());
        System.out.println("\nPaís d'origen: " + getPaisOri());
        System.out.println("\nPaís de destí: " + getPaisDes());
        System.out.println("\nContinent d'origen: " + getContinentOri());
        System.out.println("\nContinent de destí: " + getContinentDes());
        System.out.println("\nOceà que sobrevola: " + getOcea());
        System.out.println("\nDistància: " + getDistancia());
    }

    
}

