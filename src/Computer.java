public class Computer extends DispositivoElettronico {

    /**
     * costruttore che richiama costruttore superclass
     * @param marca
     */
    public Computer(String marca){
        super(marca);
    }

    //implemento il metodo astratto della superclass
    @Override
    public void accendi(){
        System.out.println("il computer"+ " "+ marca + " " + "si sta accendendo");

    }
}
