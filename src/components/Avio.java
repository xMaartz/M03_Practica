/*
 * Un avió es defineix pel seu codi, fabricant, model, capacitat i un vector amb 
 * les seves classes.
 */
package components;


import java.util.Scanner;
/**
 *
 * @author root
 */
public class Avio {

    public String codi;
    public String fabricant;
    public String model;
    public int capacitat;
    public Classe[] classes;
    public int posicioClasses; //Atribut que controla la primera posició vuida del vector
    private static final Scanner DADES = new Scanner(System.in);

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys classes i posicioClasses.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar el vector classes com a buit i una longitud de 4.
     - Inicialitzar l'atribut possicioClasses a 0.
     */
    public Avio(String pCodi,String pFabricant,String pModel, int pCapacitat){
        this.codi=pCodi;
        this.fabricant=pFabricant;
        this.model=pModel;
        this.capacitat=pCapacitat;
        classes=new Classe[4];
        posicioClasses=0;
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

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public Classe[] getClasses() {
        return classes;
    }

    public void setClasses(Classe[] classes) {
        this.classes = classes;
    }

    public int getPosicioClasses() {
        return posicioClasses;
    }

    public void setPosicioClasses(int posicioClasses) {
        this.posicioClasses = posicioClasses;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou avió.
    Les dades a demanar són les que necessita el constructor.
    - També heu de tenir en compte que el fabricant o model, no tenen perquè estar 
    formats per una única paraula, per exemple, Airbus Company o Boing 777
    Retorn: El nou avió.
     */
    public static Avio nouAvio() {
        
        String nCodi;
        String nFabricant;
        String nModel;
        int nCapacitat;
        
        System.out.print("Introdueix el codi: ");
        nCodi=DADES.nextLine();

        System.out.print("Introdueix el fabricant: ");
        nFabricant=DADES.nextLine();
        
        System.out.print("Introdueix el model: ");
        nModel=DADES.nextLine();

        System.out.print("Introdueix la capacitat: ");
        nCapacitat=DADES.nextInt();
        
        Avio nAvio = new Avio(nCodi,nFabricant,nModel,nCapacitat);
        
        return nAvio;
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
    public void modificarAvio() {
           
        String nCodi;
        String nFabricant;
        String nModel;
        int nCapacitat;
                
        mostrarAvio();
        
        System.out.print("Introdueix el codi: ");
        nCodi=DADES.nextLine();

        System.out.print("Introdueix el fabricant: ");
        nFabricant=DADES.nextLine();
        
        System.out.print("Introdueix el model: ");
        nModel=DADES.nextLine();

        System.out.print("Introdueix la capacitat: ");
        nCapacitat=DADES.nextInt();
        
        this.codi=nCodi;
        this.fabricant=nFabricant;
        this.model=nModel;
        this.capacitat=nCapacitat;
    }

    public void mostrarAvio() {
        System.out.println("\nLes dades de l'avió amb codi " + getCodi() + " són:");
        System.out.println("\nFabricant: " + getFabricant());
        System.out.println("\nModel: " + getModel());
        System.out.println("\nCapacitat: " + getCapacitat());
    }

    /*
     Paràmetres: cap
     Accions:
     - Afegeix una nova classe al vector de classes de l'avió actual si aquesta encara 
     no s'ha afegit. S'ha de comprovar si s'ha afegit fent servir el mètode pertinent 
     d'aquesta classe, i actualitzar la posició del vector de classes.
     - Abans d'afegir la classe, també heu de comprovar que la seva capacitat sumada
     a la capacitat de les altres classes de l'avió, no superi la capacitat total
     de l'avió.
     - Si la classe ja s'havia afegit o bé la seva capacitat sumada a les capacitats 
     de les altres classes supera la capacitat total de l'avió, no s'afegirà de nou i 
     li mostrarem a l'usuari el missatge "\nLa classe no s'ha pogut afegir".
     Retorn: cap
     */
    public void afegirClasse() {
        
        Classe nClasse=Classe.novaClasse();
        
        int total=nClasse.getCapacitat();
        
        for(int i=0;i<classes.length;i++){
            total=total+classes[i].getCapacitat();
        }        
        
        if (total<this.capacitat){
            if (seleccionarClasse(nClasse.getNom())==-1){
                classes[posicioClasses] = nClasse;
        
                posicioClasses++;
            }
            else{
                System.out.println("La classe no s'ha pogut afegir");
            }
        }
        else{
            System.out.println("La classe no s'ha pogut afegir");
        }     
    }

    public int seleccionarClasse(String nom) {

        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioClasses() && !trobat; i++) {
            if (getClasses()[i].getNom().equals(nom)) {
                pos = i;
                trobat = true;
            }
        }
        
        
        
        return pos;
    }

}
