/*
 * Una ruta nacional es defineix pel seu codi, aeroport d’origen, aeroport de 
 * destí, distància i país
 */
package components;

import java.util.Scanner;


/**
 *
 * @author root
 */
public class RutaNacional {
    
    public String codi;
    public String pais;
    public String aeroportOri;
    public String aeroportDes;
    public double distancia;
    private static final Scanner DADES = new Scanner(System.in);
    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaNacional (String pCodi, String pPais, String pAeroportOri, String pAeroportDes, double pDistancia){
        this.codi=pCodi;
        this.pais=pPais;
        this.aeroportOri=pAeroportOri;
        this.aeroportDes=pAeroportDes;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta nacional.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports no tene per què estar formats per una única 
    paraula, per exemple, El Prat.
     */
    public static RutaNacional novaRutaNacional() {
        String nCodi;
        String nPais;
        String nAeroportOri;
        String nAeroportDes;
        double nDistancia;
        
        System.out.print("Introdueix el codi: ");
        nCodi=DADES.nextLine();

        System.out.print("Introdueix el pais: ");
        nPais=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport d'origen: ");
        nAeroportOri=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport de desti: ");
        nAeroportDes=DADES.nextLine();

        System.out.print("Introdueix la distancia: ");
        nDistancia=DADES.nextDouble();
        
        RutaNacional nRutaNacional = new RutaNacional(nCodi,nPais,nAeroportOri,nAeroportDes,nDistancia);
        
        return nRutaNacional;
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
    public void modificarRutaNacional() {
        String nCodi;
        String nPais;
        String nAeroportOri;
        String nAeroportDes;
        double nDistancia;
        
        System.out.println("Codi actual.............:"+getCodi());
        System.out.println("Pais actual.............:"+getPais());
        System.out.println("Aeroport Origen actual..:"+getAeroportOri());
        System.out.println("Aeroport Desti actual...:"+getAeroportDes()); 
        System.out.println("Distancia actual........:"+getDistancia());
        
        System.out.print("Introdueix el codi: ");
        nCodi=DADES.nextLine();

        System.out.print("Introdueix el pais: ");
        nPais=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport d'origen: ");
        nAeroportOri=DADES.nextLine();
        
        System.out.print("Introdueix el aeroport de desti: ");
        nAeroportDes=DADES.nextLine();

        System.out.print("Introdueix la distancia: ");
        nDistancia=DADES.nextDouble();
        
        this.codi=nCodi;
        this.pais=nPais;
        this.aeroportOri=nAeroportOri;
        this.aeroportDes=nAeroportDes;
        this.distancia=nDistancia;        
    }

    public void mostrarRutaNacional() {
        System.out.println("\nLes dades de la ruta nacional amb codi " + getCodi() + " són:");
        System.out.println("\nAeroport d'origen: " + getAeroportOri());
        System.out.println("\nAeroport de destí: " + getAeroportDes());
        System.out.println("\nDistància: " + getDistancia());
    }

    
}