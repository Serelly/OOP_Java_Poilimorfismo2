//creo classe che utilizza il polimorfismo

public class GestioneDispositivi {

    /**
     * metodo che gestisce il dispositivo che invoca quei metodi
     * @param dispositivo
     */
    public void GestisciDispositivo(DispositivoElettronico dispositivo) {
        dispositivo.accendi();
        dispositivo.connettiAllaRete();
        dispositivo.spegniti();
    }

    //faccio la classe main dove eseguo

    public static void main(String[] args) {
        //istanzio oggetti dalle relative classi e subclassi
        GestioneDispositivi gd = new GestioneDispositivi(); //istazio un oggetto dalla classe GestioneDispositivi per poi invocare il metodo
        //(polimorfismo)
        DispositivoElettronico smartphone = new Smartphone("Apple");
        DispositivoElettronico computer = new Computer("MacBook");
        DispositivoElettronico televisore = new Televisore("LG");

        //invoco il metodo GestisciDispositivo per ogni dispositivo
        System.out.println("\n Gestione smartphone:");
        gd.GestisciDispositivo(smartphone);

        System.out.println("\n Gestione computer:");
        gd.GestisciDispositivo(computer);

        System.out.println("\n Gestione televisore:");
        gd.GestisciDispositivo(televisore);

    }

}
