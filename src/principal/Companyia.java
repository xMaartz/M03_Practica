/*
 * Classe que defineix una companyia. Una companyia es defineix per un codi i un 
 * nom. A més, contindrà vectors amb avions, rutes nacionals, rutes internacionals,
 * rutes intercontinentals, rutes transocèaniques, tripulants de cabina, TCPs i vols.
 */
package principal;

import components.Avio;
import components.RutaIntercontinental;
import components.RutaInternacional;
import components.RutaNacional;
import components.RutaTransoceanica;
import components.TCP;
import components.TripulantCabina;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Companyia {
    
    private static final Scanner DADES = new Scanner(System.in);

    private int codi;
    private static int properCodi = 1; //El proper codi a assignar
    private String nom;
    private Avio[] avions;
    private int posicioAvions; //Possició actual buida del vector avions
    private RutaNacional[] rutesNacionals;
    private int posicioRutesNacionals; //Possició actual buida del vector rutesNacionals
    private RutaInternacional[] rutesInternacionals;
    private int posicioRutesInternacionals; //Possició actual buida del vector rutesInternacionals
    private RutaIntercontinental[] rutesIntercontinentals;
    private int posicioRutesIntercontinentals; //Possició actual buida del vector rutesIntercontinentals
    private RutaTransoceanica[] rutesTransoceaniques;
    private int posicioRutesTransoceaniques; //Possició actual buida del vector rutesTransoceaniques
    private TripulantCabina[] tripulantsCabina;
    private int posicioTripulantsCabina; //Possició actual buida del vector tripulantsCabina
    private TCP[] tcps;
    private int posicioTcps; //Possició actual buida del vector tcps
    private Vol[] vols;
    private int posicioVols; //Possició actual buida del vector vols

    /*
     CONSTRUCTOR
     Paràmetres: valor per l'atribut nom
     Accions:
     - Assignar a l'atribut corresponent el valor passat com a paràmetre
     - Assignar a l'atribut codi el valor de l'atribut properCodi i actualitzar
     properCodi amb el següent codi a assignar.
     - avions s'ha d'inicialtizar buit i amb una capacitat per 200 avions.
     - rutesNacionals s'ha d'inicialtizar buit i amb una capacitat per 100 rutes nacionals.
     - rutesInternacionals s'ha d'inicialtizar buit i amb una capacitat per 200 rutes internacionals.
     - rutesIntercontinentals s'ha d'inicialtizar buit i amb una capacitat per 100 rutes intercontinentals.
     - rutesTransoceaniques s'ha d'inicialtizar buit i amb una capacitat per 45 rutes transoceàniques.
     - tripulantsCabina s'ha d'inicialtizar buit i amb una capacitat per 600 tripulants de cabina.
     - tcps s'ha d'inicialtizar buit i amb una capacitat per 1000 TCPs.
     - vols s'ha d'inicialtizar buit i amb una capacitat per 700 vols.
     - posicioRutesNacionals, posicioRutesInternacionals, posicioRutesIntercontinentals, posicioRutesTransoceaniques, 
       posicioTripulantsCabina, posicioTcps i posicioVols, s'han d'inicialitzar a 0, què serà la primera posició
       buida dels vectors inicilitzats.
     */
    
    public Companyia (String cnom) {
    
        this.codi = properCodi;
        properCodi++;
        this.nom = cnom;
        this.avions = new Avio [200];
        this.posicioAvions = 0;
        this.rutesNacionals = new RutaNacional [100];
        this.posicioRutesNacionals = 0;
        this.rutesInternacionals = new RutaInternacional [200];
        this.posicioRutesInternacionals = 0;
        this.rutesIntercontinentals = new RutaIntercontinental [100];
        this.posicioRutesIntercontinentals = 0;
        this.rutesTransoceaniques = new RutaTransoceanica [45];
        this.posicioRutesTransoceaniques = 0;
        this.tripulantsCabina = new TripulantCabina [600];
        this.posicioTripulantsCabina = 0;
        this.tcps = new TCP [1000];
        this.posicioTcps = 0;
        this.vols = new Vol [700];
        this.posicioVols = 0;
        
        
    }
    
    /*
     Mètodes accessors    
     */

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Avio[] getAvions() {
        return avions;
    }

    public void setAvions(Avio[] avions) {
        this.avions = avions;
    }

    public int getPosicioAvions() {
        return posicioAvions;
    }

    public void setPosicioAvions(int posicioAvions) {
        this.posicioAvions = posicioAvions;
    }

    public RutaNacional[] getRutesNacionals() {
        return rutesNacionals;
    }

    public void setRutesNacionals(RutaNacional[] rutesNacionals) {
        this.rutesNacionals = rutesNacionals;
    }

    public int getPosicioRutesNacionals() {
        return posicioRutesNacionals;
    }

    public void setPosicioRutesNacionals(int posicioRutesNacionals) {
        this.posicioRutesNacionals = posicioRutesNacionals;
    }

    public RutaInternacional[] getRutesInternacionals() {
        return rutesInternacionals;
    }

    public void setRutesInternacionals(RutaInternacional[] rutesInternacionals) {
        this.rutesInternacionals = rutesInternacionals;
    }

    public int getPosicioRutesInternacionals() {
        return posicioRutesInternacionals;
    }

    public void setPosicioRutesInternacionals(int posicioRutesInternacionals) {
        this.posicioRutesInternacionals = posicioRutesInternacionals;
    }

    public RutaIntercontinental[] getRutesIntercontinentals() {
        return rutesIntercontinentals;
    }

    public void setRutesIntercontinentals(RutaIntercontinental[] rutesIntercontinentals) {
        this.rutesIntercontinentals = rutesIntercontinentals;
    }

    public int getPosicioRutesIntercontinentals() {
        return posicioRutesIntercontinentals;
    }

    public void setPosicioRutesIntercontinentals(int posicioRutesIntercontinentals) {
        this.posicioRutesIntercontinentals = posicioRutesIntercontinentals;
    }

    public RutaTransoceanica[] getRutesTransoceaniques() {
        return rutesTransoceaniques;
    }

    public void setRutesTransoceaniques(RutaTransoceanica[] rutesTransoceaniques) {
        this.rutesTransoceaniques = rutesTransoceaniques;
    }

    public int getPosicioRutesTransoceaniques() {
        return posicioRutesTransoceaniques;
    }

    public void setPosicioRutesTransoceaniques(int posicioRutesTransoceaniques) {
        this.posicioRutesTransoceaniques = posicioRutesTransoceaniques;
    }

    public TripulantCabina[] getTripulantsCabina() {
        return tripulantsCabina;
    }

    public void setTripulantsCabina(TripulantCabina[] tripulantsCabina) {
        this.tripulantsCabina = tripulantsCabina;
    }

    public int getPosicioTripulantsCabina() {
        return posicioTripulantsCabina;
    }

    public void setPosicioTripulantsCabina(int posicioTripulantsCabina) {
        this.posicioTripulantsCabina = posicioTripulantsCabina;
    }

    public TCP[] getTcps() {
        return tcps;
    }

    public void setTcps(TCP[] tcps) {
        this.tcps = tcps;
    }

    public int getPosicioTcps() {
        return posicioTcps;
    }

    public void setPosicioTcps(int posicioTcps) {
        this.posicioTcps = posicioTcps;
    }

    public Vol[] getVols() {
        return vols;
    }

    public void setVols(Vol[] vols) {
        this.vols = vols;
    }

    public int getPosicioVols() {
        return posicioVols;
    }

    public void setPosicioVols(int posicioVols) {
        this.posicioVols = posicioVols;
    }
    
    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari les dades per consola per crear una nova Companyia. Les dades
     a demanar són les que necessita el constructor.
     - Heu de tenir en compte que el nom de la companyia, poden ser frases, per exemple,
     Singapore Airlines.
     Retorn: La nova companyia.
     */
    public static Companyia novaCompanyia() {

        System.out.print("Introdueix el nom de la Companyia: ");
        String nouNom = DADES.nextLine();
        
        Companyia nouCompanyia = new Companyia(nouNom);
        
        return nouCompanyia;
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte. En aquest cas
     no es pot modificar el contingut dels vectors, només el de l'atribut nom. 
     Evidentment, tampoc podeu modificar el codi.
     - Li heu de mostrar a l'usuari els valor actual del nom de l'objecte
     actual, abans de modificar-lo.
     Retorn: cap
     */
    public void modificarCompanyia() {

        mostrarCompanyia();
        
        System.out.print("Introdueix el nom de la Companyia: ");
        String nouNom = DADES.nextLine();
        
        this.nom = nouNom;
        
    }

    public void mostrarCompanyia() {
        System.out.println("\nLes dades de la companyia amb codi " + getCodi() + " són:");
        System.out.println("\nNom:" + getNom());
    }

    /*
     AVIÓ
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou avió al vector d'avions de l'objecte actual (el que cridarà
     al mètode), fent servir el mètode de la classe Avio pertinent.
     - actualitza la posició del vector d'avions.
     Retorn: cap
     */
    public void afegirAvio() {

        this.avions[posicioAvions] = Avio.nouAvio();
        this.posicioAvions++;
        
    }

    public int seleccionarAvio() {

        System.out.println("\nCodi de l'avió?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioAvions() && !trobat; i++) {
            if (getAvions()[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA NACIONAL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta nacional al vector de rutes nacionals de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaNacional pertinent.
     - actualitza la posició del vector de rutes nacionals.
     Retorn: cap
     */
    public void afegirRutaNacional() {

        this.rutesNacionals[posicioRutesNacionals] = RutaNacional.novaRutaNacional();
        this.posicioRutesNacionals++;
        
    }

    public int seleccionarRutaNacional() {

        System.out.println("\nCodi de la ruta nacional?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioRutesNacionals() && !trobat; i++) {
            if (getRutesNacionals()[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA INTERNACIONAL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta internacional al vector de rutes internacionals de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaInternacional pertinent.
     - actualitza la posició del vector de rutes internacionals.
     Retorn: cap
     */
    public void afegirRutaInternacional() {

        this.rutesInternacionals[posicioRutesInternacionals] = RutaInternacional.novaRutaInternacional();
        this.posicioRutesInternacionals++;
        
    }

    public int seleccionarRutaInternacional() {

        System.out.println("\nCodi de la ruta internacional?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioRutesInternacionals() && !trobat; i++) {
            if (getRutesInternacionals()[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA INTERCONTINENTAL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta intercontinental al vector de rutes intercontinental de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaIntercontinental pertinent.
     - actualitza la posició del vector de rutes intercontinental.
     Retorn: cap
     */
    public void afegirRutaIntercontinental() {

        this.rutesIntercontinentals[posicioRutesIntercontinentals] = RutaIntercontinental.novaRutaIntercontinental();
        this.posicioRutesIntercontinentals++;
        
    }

    public int seleccionarRutaIntercontinental() {

        System.out.println("\nCodi de la ruta intercontinental?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioRutesIntercontinentals() && !trobat; i++) {
            if (getRutesIntercontinentals()[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     RUTA TRANSOCEÀNICA
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix una nova ruta transoceànica al vector de rutes transoceàniques de l'objecte 
     actual (el que cridarà al mètode), fent servir el mètode de la classe RutaTransoceanica pertinent.
     - actualitza la posició del vector de rutes transoceàniques.
     Retorn: cap
     */
    public void afegirRutaTransoceanica() {

        this.rutesTransoceaniques[posicioRutesTransoceaniques] = RutaTransoceanica.novaRutaTransoceanica();
        this.posicioRutesTransoceaniques++;
        
    }

    public int seleccionarRutaTransoceanica() {

        System.out.println("\nCodi de la ruta transoceànica?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioRutesTransoceaniques() && !trobat; i++) {
            if (getRutesTransoceaniques()[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     TRIPULACIÓ CABINA
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou tripulant de cabina al vector de tripulants de cabina de 
     l'objecte actual (el que cridarà al mètode), fent servir el mètode de la classe 
     TripulantCabina pertinent.
     - actualitza la posició del vector de tripulants de cabina.
     Retorn: cap
     */
    public void afegirTripulantCabina() {
        
        this.tripulantsCabina[posicioTripulantsCabina] = TripulantCabina.nouTripulantCabina();
        this.posicioTripulantsCabina++;
        
    }

    public int seleccionarTripulantCabina() {

        System.out.println("\nCodi del tripulant de cabina?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioTripulantsCabina() && !trobat; i++) {
            if (getTripulantsCabina()[i].getPassaport().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     TCP
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou TCP al vector de TCPs de l'objecte actual (el que cridarà 
     al mètode), fent servir el mètode de la classe TCP pertinent.
     - actualitza la posició del vector de TCPs.
     Retorn: cap
     */
    public void afegirTCP() {

        this.tcps[posicioTcps] = TCP.nouTCP();
        this.posicioTcps++;
        
    }

    public int seleccionarTCP() {

        System.out.println("\nCodi del tripulant de la cabina de passatgers?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioTcps() && !trobat; i++) {
            if (getTcps()[i].getPassaport().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     VOL
     */
 /*
     Paràmetres: cap
     Accions:
     - afegeix un nou vol al vector de vols de l'objecte actual (el que cridarà 
     al mètode), fent servir el mètode de la classe Vol pertinent.
     - actualitza la posició del vector de vols.
     Retorn: cap
     */
    public void afegirVol() throws ParseException {

        this.vols[posicioVols] = Vol.nouVol();
        this.posicioVols++;
        
    }

    public int seleccionarVol() {

        System.out.println("\nCodi del vol?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioVols() && !trobat; i++) {
            if (getVols()[i].getCodi().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

    /*
     Paràmetres: cap
     Accions:
     - afegeix l'avió seleccionat de la companyia al vol seleccionat, si el vol i l'avió 
     existeixen en la companyia.
     - heu de fer servir els mètodes escaients d'aquesta classe per seleccionar els 
     avió i vol, i el mètode escaient de la classe Vol per afegir l'avió al vol seleccionat.
     - Si el vol no existeix, no s'afegirà cap avió i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi l'avió
     li mostrarem el missatge "\nNo existeix aquest avió"
     Retorn: cap
     */
    public void afegirAvioVol() {
        int codiAvio;
        int codiVol;
        
        codiAvio=seleccionarAvio();
        codiVol=seleccionarVol();
        
        if (codiVol==-1){
            System.out.print("\nNo existeix aquest vol");
        }
        if (codiAvio==-1){
            System.out.print("\nNo existeix aquest avió");
        }
        else {
            Avio nAvio=getAvions()[codiAvio];
            Vol nVol=getVols()[codiVol];
            nVol.setAvio(nAvio); 
        }        
    }

    /*
     Paràmetres: cap
     Accions:
     - afegeix el tripulant de cabina seleccionat de la companyia al vector de
     tripulació de cabina del vol seleccionat, si el vol i el tripulant de cabina
     existeixen en la companyia.
     - heu de fer servir els mètodes escaients d'aquesta classe per seleccionar el 
     tripulant de cabina i vol, i el mètode escaient de la classe Vol per afegir 
     el tripulant de cabina al vol seleccionat.
     - Si el vol no existeix, no s'afegirà cap tripulant de cabina i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi el tripulant de cabina
     li mostrarem el missatge "\nNo existeix aquest tripulant de cabina"
     Retorn: cap
     */
    public void afegirTripulantCabinaVol() {
        int codiTC;
        int codiVol;
        
        codiTC=seleccionarTripulantCabina();
        codiVol=seleccionarVol();
        
        if (codiVol==-1){
            System.out.print("\nNo existeix aquest vol");
        }
        if (codiTC==-1){
            System.out.print("\nNo existeix aquest tripulant de cabina");
        }
        else {
            TripulantCabina nTripulantCabina=getTripulantsCabina()[codiTC];
            Vol nVol=getVols()[codiVol];
            nVol.afegirTripulantCabina(nTripulantCabina);
        } 
    }
    
    /*
     Paràmetres: cap
     Accions:
     - afegeix el TCP seleccionat de la companyia al vector de TCPs del vol seleccionat, 
     si el vol i el TCP existeixen en la companyia.
     - heu de fer servir els mètodes escaients d'aquesta classe per seleccionar el 
     TCP i vol, i el mètode escaient de la classe Vol per afegir el TCP al vol seleccionat.
     - Si el vol no existeix, no s'afegirà cap TCP i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi el TCP
     li mostrarem el missatge "\nNo existeix aquest tripulant de cabina de passatgers"
     Retorn: cap
     */
    public void afegirTCPVol() {
        int codiTCP;
        int codiVol;
        
        codiTCP=seleccionarTCP();
        codiVol=seleccionarVol();
        
        if (codiVol==-1){
            System.out.print("\nNo existeix aquest vol");
        }
        if (codiTCP==-1){
            System.out.print("\nNo existeix aquest tripulant de cabina de passatgersa");
        }
        else {
            TCP nTCP=getTcps()[codiTCP];
            Vol nVol=getVols()[codiVol];
            nVol.afegirTCP(nTCP);
        } 
    }

    /*
     Paràmetres: cap
     Accions:
     - Afegeix la ruta seleccionada de la companyia al vol seleccionat, si el vol 
     i la ruta existeixen en la companyia, i actualitza el tipus de ruta del vol
     amb el tipus de la ruta afegida.    
     - Heu de tenir en compte que la ruta a seleccionar ha de ser del tipus passat
     per paràmetre, és a dir, tipus 1 és ruta nacional, tipus 2 és ruta internacional,
     tipus 3 és ruta intercontinental i tipus 4 és ruta transoceànica.
     - Heu de fer servir els mètodes escaients d'aquesta classe per seleccionar 
     la ruta i el vol, i el mètode escaient de la classe Vol per afegir la ruta
     al vol seleccionat i actualitzar el tipus de ruta.
     - Si el vol no existeix, no s'afegirà cap ruta i li mostrarem a l'usuari
     el missatge "\nNo existeix aquest vol". En cas que no existeixi la ruta
     li mostrarem el missatge "\nNo existeix aquesta ruta"    
     Retorn: cap
     */
    public void afegirRutaVol(int tipus) {
        int codiRuta=-1;
        int codiVol;
        int tipusRuta;
        
        codiVol=seleccionarVol();
        
        if (codiVol==-1){
            System.out.print("\nNo existeix aquest vol");
        }
        
        do {
            System.out.println("\nSelecciona una ruta");
            System.out.println("\n1. Ruta nacional");
            System.out.println("\n2. Ruta internacional");
            System.out.println("\n3. Ruta intercontinental");
            System.out.println("\n4. Ruta transoceànic");
            
            tipusRuta=DADES.nextInt();
        
            switch (tipusRuta){
                case 1:
                    codiRuta=seleccionarRutaNacional();
                    if (codiRuta==-1){
                        System.out.print("\nNo existeix aquesta ruta");
                    }
                    else {
                        RutaNacional nRuta=getRutesNacionals()[codiRuta];
                        Vol nVol=getVols()[codiVol];
                        nVol.setRuta(nRuta);
                        nVol.setTipusRuta(tipusRuta);
                    } 
                    break;
                case 2:
                    codiRuta=seleccionarRutaInternacional();
                    if (codiRuta==-1){
                        System.out.print("\nNo existeix aquesta ruta");
                    }
                    else {
                        RutaInternacional nRuta=getRutesInternacionals()[codiRuta];
                        Vol nVol=getVols()[codiVol];
                        nVol.setRuta(nRuta);
                        nVol.setTipusRuta(tipusRuta);
                    } 
                    break;
                case 3:
                    codiRuta=seleccionarRutaIntercontinental();
                    if (codiRuta==-1){
                        System.out.print("\nNo existeix aquesta ruta");
                    }
                    else {
                        RutaIntercontinental nRuta=getRutesIntercontinentals()[codiRuta];
                        Vol nVol=getVols()[codiVol];
                        nVol.setRuta(nRuta);
                        nVol.setTipusRuta(tipusRuta);
                    } 
                    break;
                case 4:
                    codiRuta=seleccionarRutaTransoceanica();
                    if (codiRuta==-1){
                        System.out.print("\nNo existeix aquesta ruta");
                    }
                    else {
                        RutaTransoceanica nRuta=getRutesTransoceaniques()[codiRuta];
                        Vol nVol=getVols()[codiVol];
                        nVol.setRuta(nRuta);
                        nVol.setTipusRuta(tipusRuta);
                    }
                    break;
                default:
                    System.out.println("No s'ha seleccionat correctament la ruta");
            }
        } while(tipusRuta>5 && tipusRuta<1);
                
    }

    

}
