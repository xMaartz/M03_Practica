/*
 * Un tripulant de cabina es defineix pel seu passaport, nom, edat, data d’alta 
 * en la companyia, hores que porta de vol, rang i barres
 */
package components;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class TripulantCabina {

    private final static Scanner DADES = new Scanner(System.in);

    private String passaport;
    private String nom;
    private int edat;
    private Date dataAlta;
    private LocalTime horesVol;
    private String rang;
    private int barres;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys dataAlta i barres.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar l'atribut dataAlta amb l'hora actual del sistema.
     - Inicialitzar l'atribut barres mitjançant el mètode pertinent d'aquesta classe.
     */
    
    public TripulantCabina (String tcPassaport, String tcNom, int tcEdat, LocalTime tcHores, String tcRang) {
        
        this.passaport = tcPassaport;
        this.nom = tcNom;
        this.edat = tcEdat;
        this.dataAlta = new Date();
        this.horesVol = tcHores;
        this.rang = tcRang;
        assignarBarres(this.rang);
        
    }

    /*
    Mètodes accessors
     */
    
    public String getPassaport() {
        return passaport;
    }

    public void setPassaport(String passaport) {
        this.passaport = passaport;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }

    public LocalTime getHoresVol() {
        return horesVol;
    }

    public void setHoresVol(LocalTime horesVol) {
        this.horesVol = horesVol;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public int getBarres() {
        return barres;
    }

    public void setBarres(int barres) {
        this.barres = barres;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou tripulant de cabina.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que el nom no té per què estar format per una única 
    paraula, per exemple, Pep Gómez.
    - També heu de tenir en compte que les hores de vol són de tipus LocalTime, per
    tant heu de demanar a l'usuari les hores i minuts per crear el LocalTime. En aquest
    cas es considerarà que els segons i nanosegons, sempre són  0.
    -  Li demanarà a l'usuari el rang del tripulant de cabina tenint en compte que
    "C" serà el que ha d'introduir l'usuari si el rang és comandant, "CP" si és
    copilot i "EV" si és enginyer de vol.
    - Si no introdueix cap dels tres rangs, no se li assignarà cap valor al rang i se 
    li mostrarà a l'usuari el missatge "\nEl rang introduït no és correcte".
    - Si el rang introduït és correcte, se li assignarà a l'atribut rang "Comandant"
    en cas que el valor introduït sigui "C", "Copilot" en cas que el valor introduït
    sigui "CP" i "Enginyer de vol" en cas que el valor introduït sigui "EV".
    Retorn: El nou tripulant de cabina.
     */
    public static TripulantCabina nouTripulantCabina() {
        
        System.out.print("Introdueix passaport: ");
        String nouPassaport = DADES.next();
        
        System.out.print("Introdueix nom: ");
        String nouNom = DADES.nextLine();
        
        System.out.print("Introdueix edat: ");
        int nouEdat = DADES.nextInt();
        
        System.out.print("Introdueix hores de vol: ");
        int hores = DADES.nextInt();
        System.out.print("Introdueix minuts de vol: ");
        int minuts = DADES.nextInt();
        LocalTime nouHores = LocalTime.of(hores,minuts);
        
        System.out.print("Introdueix rang (C, CP o EV): ");
        String rangIntro = DADES.next();
        
        String nouRang = null;
        
        switch (rangIntro) {
            case "C":  nouRang = "Comandant";
                     break;
            case "CP":  nouRang = "Copilot";
                     break;
            case "EV":  nouRang = "Enginyer de vol";
                     break;
            default: System.out.print("\nEl rang introduït no és correcte");
                     break;
        }
        
        TripulantCabina nouTripulant = new TripulantCabina(nouPassaport,nouNom,nouEdat,nouHores,nouRang);
        
        return nouTripulant;
                
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte menys data d'alta.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. En el cas de les hores de vol, només se li han
     de mostrar les hores i minuts.
     - Si es vol modificar el rang, a l'hora de demanar-li el nou rang a l'usuari
     haurem de fer el mateix que en el mètode nouTripulantCabina, però en aquest 
     cas, si no s'introdueix un rang correcte, en lloc de no assignar-li res a 
     l'atribut rang, el que farem és no modificar el seu valor actual.
     - Abans de modificar el valor del rang, hem de comprovar que el nou valor 
     compleix els requisits especificats en l'enunciat de la pràctica de la UF1 
     del mòdul 5, és a dir, un Enginyer de cabina pot passar a ser còpilot si té 5
     o més anys d'antiguetat, i un copilot pot passar a ser comandant, si té 15 
     o més anys d'antiguetat.
     - Si modifiquem el valor del rang, també haurem de modificar el valor de les
     barres amb el mètode adient d'aquesta classe.
    
     NOTA: 5 anys són 157788000 segons.
    
     Retorn: cap
     */
    public void modificarTripulantCabina() {
        
        mostrarTripulantCabina();
        
        System.out.print("Introdueix passaport: ");
        String nouPassaport = DADES.next();
        
        System.out.print("Introdueix nom: ");
        String nouNom = DADES.nextLine();
        
        System.out.print("Introdueix edat: ");
        int nouEdat = DADES.nextInt();
        
        System.out.print("Introdueix hores de vol: ");
        int hores = DADES.nextInt();
        System.out.print("Introdueix minuts de vol: ");
        int minuts = DADES.nextInt();
        LocalTime nouHores = LocalTime.of(hores,minuts);
        
        System.out.print("Introdueix rang (C, CP o EV): ");
        String rangIntro = DADES.next();
        Date dataActual = new Date();
        long difHores =  dataActual.getTime() - this.dataAlta.getTime();
        
        String nouRang = null;
        
        switch (rangIntro) {
            case "C":  nouRang = "Comandant";
                     break;
            case "CP":  
                        if ( difHores >= 473364000) {
                            nouRang = "Comandant";
                        } else nouRang = "Copilot";
                     break;
            case "EV":  
                        if ( difHores >= 157788000) {
                            nouRang = "Copilot";
                        } else nouRang = "Enginyer de vol";
                        
                     break;
            default: nouRang = this.rang;
                     break;
        }
        
        this.passaport = nouPassaport;
        this.nom = nouNom;
        this.edat = nouEdat;
        this.horesVol = nouHores;
        this.rang = nouRang;
        assignarBarres(this.rang);
        
    }

    public void mostrarTripulantCabina() {
        System.out.println("\nLes dades del tripulant de cabina amb passaport " + getPassaport() + " són:");
        System.out.println("\nNom: " + getNom());
        System.out.println("\nEdat: " + getEdat());
        System.out.println("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(getDataAlta()));
        System.out.println("\nHores de vol: " + getHoresVol().getHour() + ":" + getHoresVol().getMinute());
        System.out.println("\nRang: " + getRang());
        System.out.println("\nBarres: " + getBarres());
    }

    /*
     Paràmetres: rang
     Accions:
     - Se li assignarà a l'atribut barres el valor corresponent segons el rang introduït
     per paràmetre i les especificacions de l'enunciat de la UF1 del mòdul 5, és a dir, 
     en el cas del copilot, 2 barres si té menys de 1500 hores de vol i 3 si té 1500 o més, 
     en el cas del comandant sempre 4 i en el cas de l'enginyer de vol sempre 1.
     Retorn: número de barres
     */
    public void assignarBarres(String pRang) {
        
        int hores = getHoresVol().getHour() + ((getHoresVol().getMinute()) / 60);
        
        switch (pRang) {
            
            case "Comandant":  this.barres = 4;
                     break;
            case "Copilot":  
                        if ( hores < 1500) {
                            this.barres = 2;
                        } else this.barres = 3;
                     break;
            case "Enginyer de vol":  this.barres = 1;
                        
                     break;
        }
    }

    

}
