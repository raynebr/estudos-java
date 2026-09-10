package poo.Polimorfismo;

public class Peixe extends Animal{
    private String corescama;

    @Override
    public void locomover(){
        System.out.println("nadar");
    }
    @Override
    public void alimentar(){
        System.out.println("alimentando2");
    }

    @Override
    public void emitirSom() {
        System.out.println("som2");
    }
    public void soltarBolha(){

    }
}
