public abstract class DispositivoElettronico {
    protected String marca;

    /**
     * costruttore che inizializza parametri della classe base
     * @param marca
     */
    public DispositivoElettronico(String marca) {
        this.marca = marca;
    }

    /**
     * metodo astratto che deve essere implementato dalle subclassi
     * ON
     */
    public abstract void accendi();


    /**
     * metodo concreto che può essere ereditato OFF
     */
    public void spegniti(){
        System.out.println("dispositivo si sta spegnendo");
    }

    /**
     * metodo concreto che può essere ereditato
     */
    public void connettiAllaRete(){
        System.out.println("il dispositivo" + " " + marca + " " + "è connesso alla rete");
    }

}
