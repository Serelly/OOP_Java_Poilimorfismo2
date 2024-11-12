public class Smartphone extends DispositivoElettronico {

    /**
     * costruttore che richiama il costruttore della superclass
     * @param marca
     */
    public Smartphone(String marca){
        super(marca);
    }

    //implemento i metodi astratti della superclass, mentre quelli concreti della superclass sono ereditati in automatico
    @Override
    public void accendi() {
        System.out.println("lo smartphone"+ " "+ marca + " " + "si sta accendendo");
    }
}
