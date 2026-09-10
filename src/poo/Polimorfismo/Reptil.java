package poo.Polimorfismo;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover(){
        System.out.println("rastejar");
    }
    @Override
    public void alimentar(){
        System.out.println("alimentando1");
    }

    @Override
    public void emitirSom() {
        System.out.println("som1");
    }

}
