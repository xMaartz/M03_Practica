/*
 * Una ruta internacional es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen i país de destí
 */
package components;

import java.util.Scanner;


/**
 *
 * @author root
 */
public class RutaInternacional {
    
    public String codi;
    public String aeroportOri;
    public String aeroportDes;
    public String paisOri;
    public String paisDes;
    public double distancia;
    private static final Scanner DADES = new Scanner(System.in);
    
    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaInternacional (String pCodi, String pAeroportOri, String pAeroportDes,  String pPaisOri, String pPaisDes, double pDistancia){
        this.codi=pCodi;
        this.aeroportOri=pAeroportOri;
        this.aeroportDes=pAeroportDes;
        this.paisOri=pPaisOri;
        this.paisDes=pPaisDes;
        this.distancia=pDistancia;
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
    - Heu de tenir en compte que els aeroports països no tene per què estar formats per una única 
    paraula, per exemple, El Prat o Regne Unit.
     */
    public static RutaInternacional novaRutaInternacional() {
        String nCodi;
        String nAeroportOri;
        String nAeroportDes;
        String nPaisOri;
        String nPaisDes;
        double nDistancia;
        
        System.out.print("Introdueix el codi: ");
        nCodi=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport d'origen: ");
        nAeroportOri=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport de desti: ");
        nAeroportDes=DADES.nextLine();
        
        System.out.print("Introdueix el pais d'origen: ");
        nPaisOri=DADES.nextLine();
        
        System.out.print("Introdueix el pais de desti: ");
        nPaisDes=DADES.nextLine();

        System.out.print("Introdueix la distancia: ");
        nDistancia=DADES.nextDouble();
        
        RutaInternacional nRutaInternacional = new RutaInternacional(nCodi,nAeroportOri,nAeroportDes,nPaisOri,nPaisDes,nDistancia);
        
        return nRutaInternacional;
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
    public void modificarRutaInternacional() {
        String nCodi;
        String nAeroportOri;
        String nAeroportDes;
        String nPaisOri;
        String nPaisDes;
        double nDistancia;
        
        System.out.println("Codi actual.............:"+getCodi());
        System.out.println("Aeroport Origen actual..:"+getAeroportOri());
        System.out.println("Aeroport Desti actual...:"+getAeroportDes());
        System.out.println("Pais Origen actual......:"+getPaisOri());
        System.out.println("Pais Desti actual.......:"+getPaisDes());
        System.out.println("Distancia actual........:"+getDistancia());
        
        System.out.print("Introdueix el codi: ");
        nCodi=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport d'origen: ");
        nAeroportOri=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport de desti: ");
        nAeroportDes=DADES.nextLine();
        
        System.out.print("Introdueix el pais d'origen: ");
        nPaisOri=DADES.nextLine();
        
        System.out.print("Introdueix el pais de desti: ");
        nPaisDes=DADES.nextLine();

        System.out.print("Introdueix la distancia: ");
        nDistancia=DADES.nextDouble();
        
        this.codi=nCodi;
        this.aeroportOri=nAeroportOri;
        this.aeroportDes=nAeroportDes;
        this.paisOri=nPaisOri;
        this.paisDes=nPaisDes;
        this.distancia=nDistancia;
    }

    public void mostrarRutaInternacional() {
        System.out.println("\nLes dades de la ruta internacional amb codi " + getCodi() + " són:");
        System.out.println("\nAeroport d'origen: " + getAeroportOri());
        System.out.println("\nAeroport de destí: " + getAeroportDes());
         System.out.println("\nPaís d'origen: " + getPaisOri());
        System.out.println("\nPaís de destí: " + getPaisDes());
        System.out.println("\nDistància: " + getDistancia());
    }
}
