public class Televisore extends DispositivoElettronico {
    /**
     * costruttore
     * @param marca
     */
    public Televisore(String marca) {
        super(marca);
    }

    //implemento metodo astratto

    @Override
    public void accendi() {
        System.out.println("il televisore"+ " " + marca + " " + "si sta accendendo");
    }
}
