/*
 * Defineix una classe d’un avió. Una classe d’un avió es defineix pel seu nom 
 * (no pot haver-hi un avió amb dues classes amb el mateix nom) i capacitat.
 * 
 */
package components;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Classe {
      
    private String nom;
    private int capacitat;
    private static final Scanner DADES = new Scanner(System.in);
    
     /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public Classe (String pNom, int pCap){
        this.nom=pNom;
        this.capacitat=pCap;
    }

    /*
    Mètodes accessors    
    */
   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }
    
    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova classe d'avió. 
      Les dades a demanar són les que necessita el constructor.
    - També heu de tenir en compte que el nom, no té perquè estar format per una única
    paraula, per exemple, Turista Preferent.
    Retorn: La nova classe.
     */
    public static Classe novaClasse() {
        
        String nom;
        int capacitat;
                
        System.out.print("Introdueix el nom de la classe: ");
        nom=DADES.nextLine();

        System.out.print("Introdueix la capacitat de la classe: ");
        capacitat=DADES.nextInt();
        
        Classe nClasse = new Classe(nom,capacitat);
        
        return nClasse;
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los
     Retorn: cap
     */
    public void modificarClasse() {
        
        String nNom;
        int nCapacitat;
        
        mostrarClasse();
        
        System.out.println("Nom actual........:"+getNom());
        System.out.println("Capacitat actual..:"+getCapacitat());
        
        System.out.print("Introdueix el nom de la classe: ");
        nNom=DADES.nextLine();

        System.out.print("Introdueix la capacitat de la classe: ");
        nCapacitat=DADES.nextInt();
                
        System.out.println("S'ha fet la modificacio.");
    }

    public void mostrarClasse() {
        System.out.println("\nLa classe " + nom + " té una capacitat de "+capacitat);
    }
    
}
