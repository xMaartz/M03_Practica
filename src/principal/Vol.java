/*
 * Un vol es defineix pel seu codi, ruta, avio, un vector amb els seus tripulants 
 * (tripulació), data de sortida, data d’arribada, hora de sortida, hora d’arribada
 * i durada.
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
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Vol {

    public String codi;
    public Object ruta;
    public int tipusRuta;
    public Avio avio;
    public TripulantCabina[] tripulacioCabina;
    public int posicioTripulacioCabina;
    public TCP[] tcps;
    public int posicioTcps;
    private Date dataSortida;
    private Date dataArribada;
    private LocalTime horaSortida;
    private LocalTime horaArribada;
    private String durada;
    private static final Scanner DADES = new Scanner(System.in);

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys ruta, avio,
     tripulacioCabina, posicioTripulacioCabina,tipusRuta, tcp i posicioTCP.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar ruta i avio a null, ja que quan es crea un vol, encara no s'han
     assignat ni la ruta ni el vol.
     - Inicialitzarem l'atribut tipusRuta a 0, ja que com no s'ha assignat encara una ruta,
     no podem saber de quin tipus és.
     - Inicialitzar el vector tripulacioCabina com a buit i una longitud de 7.
     - Inicialitzar el vector tcps com a buit i una longitud de 25.
     - Inicialitzar els atributs posicioTripulacioCabina i posicioTcps a 0.
     - Inicialitzar l'atribut durada amb el mètode pertinent d'aquesta classe.
     */
    public Vol (String pCodi, Date pDataSortida, Date pDataArribada, int pHoraSortida, int minutsSortida, int pHoraArribada, int minutsArribada){
        codi=pCodi;
        ruta=null;
        tipusRuta=0;
        avio=null;
        tripulacioCabina=new TripulantCabina[7];
        posicioTripulacioCabina=0;
        tcps=new TCP[25];
        posicioTcps=0;
        dataSortida=pDataSortida;
        dataArribada=pDataArribada;
        horaSortida=LocalTime.of(pHoraSortida, minutsSortida);
        horaArribada=LocalTime.of(pHoraArribada, minutsArribada);
        
        calcularDurada();
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

    public Object getRuta() {
        return ruta;
    }

    public void setRuta(Object ruta) {
        this.ruta = ruta;
    }

    public int getTipusRuta() {
        return tipusRuta;
    }

    public void setTipusRuta(int tipusRuta) {
        this.tipusRuta = tipusRuta;
    }

    public Avio getAvio() {
        return avio;
    }

    public void setAvio(Avio avio) {
        this.avio = avio;
    }

    public TripulantCabina[] getTripulacioCabina() {
        return tripulacioCabina;
    }

    public void setTripulacioCabina(TripulantCabina[] tripulacioCabina) {
        this.tripulacioCabina = tripulacioCabina;
    }

    public int getPosicioTripulacioCabina() {
        return posicioTripulacioCabina;
    }

    public void setPosicioTripulacioCabina(int posicioTripulacioCabina) {
        this.posicioTripulacioCabina = posicioTripulacioCabina;
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
    
    public Date getDataSortida(){
        return dataSortida;
    }
    
    public void setDataSortida(Date dataSortida){
        this.dataSortida=dataSortida;
    }
    
    public Date getDataArribada(){
        return dataArribada;
    }
    
    public void setDataArribada(Date dataArribada){
        this.dataArribada=dataArribada;
    }
    
    public LocalTime getHoraSortida(){
        return horaSortida;
    }
    
    public void setHoraSortida(LocalTime horaSortida){
        this.horaSortida=horaSortida;
    }
    
    public LocalTime getHoraArribada(){
        return horaArribada;
    }
    
    public void setHoraArribada(LocalTime horaArribada){
        this.horaArribada=horaArribada;
    }
    
    public String getDurada() {
        return durada;
    }

    public void setDurada(String durada) {
        this.durada = durada;
    }
    
    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou vol.
    Les dades a demanar són les que necessita el constructor.
    - En el cas de les dates, li hem de demanar a l'usuari que les introdueixi
    amb el format dd-mm-yyyy. Penseu que la data introduïda per l'usuari serà
    de tipus String i nosaltres l'hem de convertir a data.
    - En el cas de les hores només haurem de demanar l'hora i minuts, els segons
    i nanosegons no els tindrem en compte.
    Retorn: El nou vol.
     */
    public static Vol nouVol() throws ParseException {
        
        String nCodi;
        Date nDataSortida;
        Date nDataArribada;
        int nHoraSortida;
        int minutsSortida;
        int nHoraArribada;
        int minutsArribada;
        
        System.out.print("Introdueix el codi: ");
        nCodi=DADES.nextLine();

        System.out.print("Introdueix la data de sortida(dd-mm-yyyy): ");
        nDataSortida=new SimpleDateFormat("dd-MM-yyyy").parse(new Scanner(System.in).nextLine());
        
        System.out.print("Introdueix la data de arribada (dd-mm-yyyy): ");
        nDataArribada=new SimpleDateFormat("dd-MM-yyyy").parse(new Scanner(System.in).nextLine());

        System.out.print("Introdueix la hora de sortida : ");
        nHoraSortida=DADES.nextInt();
        System.out.print("Introdueix els minuts de sortida : ");
        minutsSortida=DADES.nextInt();
        
        System.out.print("Introdueix la hora de arribada : ");
        nHoraArribada=DADES.nextInt();
        System.out.print("Introdueix els minuts de arribada : ");
        minutsArribada=DADES.nextInt();
        
        Vol nVol = new Vol(nCodi,nDataSortida,nDataArribada,nHoraSortida,minutsSortida,nHoraArribada,minutsArribada);
        
        return nVol;
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte, excepte ruta, avio,
     tripulacioCabina, tcps, posicioTripulacioCabina i posicioTcps.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. Les dates les heu de mostrar amb el format
     dd-mm-yyyy, i les hores amb el format hh:mm.
     - Per demanar els nous valors de les dates i les hores, farem el mateix que
     en el mètode anterior nouVol().
     - Si es modifiquen els atributs de data o d'hora, també s'haurà de modificar
     el valor de durada mitjançant el mètode adient d'aquesta classe.
     Retorn: cap
     */
    public void modificarVol() throws ParseException {
        
        String nCodi;
        Date nDataSortida;
        Date nDataArribada;
        int nHoraSortida;
        int minutsSortida;
        int nHoraArribada;
        int minutsArribada;
        
        mostrarVol();
        
        System.out.print("Introdueix el codi: ");
        nCodi=DADES.nextLine();

        System.out.print("Introdueix la data de sortida(dd-mm-yyyy): ");
        nDataSortida=new SimpleDateFormat("dd-MM-yyyy").parse(new Scanner(System.in).nextLine());
        
        System.out.print("Introdueix la data de arribada (dd-mm-yyyy): ");
        nDataArribada=new SimpleDateFormat("dd-MM-yyyy").parse(new Scanner(System.in).nextLine());

        System.out.print("Introdueix la hora de sortida : ");
        nHoraSortida=DADES.nextInt();
        System.out.print("Introdueix els minuts de sortida : ");
        minutsSortida=DADES.nextInt();
        
        System.out.print("Introdueix la hora de arribada : ");
        nHoraArribada=DADES.nextInt();
        System.out.print("Introdueix els minuts de arribada : ");
        minutsArribada=DADES.nextInt();
        
        calcularDurada();
        
        this.codi=nCodi;
        this.dataSortida=nDataSortida;
        this.dataArribada=nDataArribada;
        this.horaSortida=LocalTime.of(nHoraSortida,minutsSortida);
        this.horaArribada=LocalTime.of(nHoraArribada,minutsArribada);
    }
    
    /*
     Paràmetres: cap
     Accions:
     - Se li assignarà a l'atribut durada el valor tenint en compte que la durada
     és la diferència de temps entre la data i hora de sortida, i la data i hora
     d'arribada.
     - La durada ha de tenir el format "X h - Y m", on X seran les hores de durada i Y els minuts
     Retorn: cap
    */
    private void calcularDurada() {
        
        long difHores =  (this.dataArribada.getTime()+((getHoraArribada().getHour() + ((getHoraArribada().getMinute()) / 60))*3600)) - (this.dataSortida.getTime()+((getHoraSortida().getHour() + ((getHoraSortida().getMinute()) / 60))*3600));
        
        double hores=difHores/3600;
        int hora = (int)hores;
        double minuts = (hores-hora)*100;
        int minut = (int)minuts+1;
        
        String durHora=Integer.toString(hora);
        String durMin=Integer.toString(minut);
        
        setDurada(durHora+" h - "+durMin+" m");
    }
    
    /*
     Paràmetres: tripulant de cabina
     Accions:
     - afegeix el tripulant de cabina passat per paràmetre al vector tripulacioCabina    
     en la primera posició buida del vector i actualitza la posició del vector tripulacioCabina.
     Retorn: cap
     */
    public void afegirTripulantCabina(TripulantCabina tripulantCabina) {
        tripulacioCabina[posicioTripulacioCabina]=tripulantCabina;
        
        posicioTripulacioCabina++;
    }
    public int seleccionarTripulantCabinal() {

        System.out.println("\nCodi del tripulant de cabinal?:");
        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < getPosicioTripulacioCabina() && !trobat; i++) {
            if (getTripulacioCabina()[i].getPassaport().equals(DADES.next())) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }
    /*
     Paràmetres: TCP
     Accions:
     - afegeix el TCP passat per paràmetre al vector tcps en la primera posició buida 
     del vector i actualitza la posició del vector tcps.
     Retorn: cap
     */
    public void afegirTCP(TCP tcp) {
        tcps[posicioTcps]=tcp;
        
        posicioTcps++;
    }
    public int seleccionarTCP() {

        System.out.println("\nCodi del TCP?:");
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
    public void mostrarVol() {
        System.out.println("\nLes dades del vol amb codi " + getCodi() + " són:");

        System.out.println("\nRuta: ");
        switch (getTipusRuta()) {
            case 1:
                ((RutaNacional) getRuta()).mostrarRutaNacional();
                break;
            case 2:
                ((RutaInternacional) getRuta()).mostrarRutaInternacional();
                break;
            case 3:
                ((RutaIntercontinental) getRuta()).mostrarRutaIntercontinental();
                break;
            case 4:
                ((RutaTransoceanica) getRuta()).mostrarRutaTransoceanica();
                break;
        }

        System.out.println("\nAvio: ");
        getAvio().mostrarAvio();

        System.out.println("\nData de sortida: " + new SimpleDateFormat("dd-MM-yyyy").format(dataSortida));
        System.out.println("\nData d'arribada: " + new SimpleDateFormat("dd-MM-yyyy").format(dataArribada));
        System.out.println("\nHores de sortida: " + horaSortida.getHour() + ":" + horaSortida.getMinute());
        System.out.println("\nHores d'arribada: " + horaArribada.getHour() + ":" + horaArribada.getMinute());

        System.out.println("\nLa tripulació de cabina és:");
        for (int i = 0; i < getPosicioTripulacioCabina(); i++) {
            getTripulacioCabina()[i].mostrarTripulantCabina();
        }

        System.out.println("\nLa tripulació de cabina de passatgers és:");
        for (int i = 0; i < getPosicioTcps(); i++) {
            getTcps()[i].mostrarTCP();
        }

        System.out.println("\nDurada: " + durada);
    }

}
