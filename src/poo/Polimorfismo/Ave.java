package poo.Polimorfismo;

public class Ave extends Animal{
    private String corPena;
    @Override
    public void locomover(){
        System.out.println("voar");
    }
    @Override
    public void alimentar(){
        System.out.println("alimentando3");
    }

    @Override
    public void emitirSom() {
        System.out.println("som3");
    }
    public void fazerNinho(){
        System.out.println("fazendo ninho");
    }
}
