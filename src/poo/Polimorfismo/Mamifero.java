package poo.Polimorfismo;

public class Mamifero extends Animal {
    private String corDoPelo;
    @Override
    public void locomover(){
        System.out.println("locomover");
    }
    @Override
    public void alimentar(){
      System.out.println("alimentando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som");

    }
    //lembrando que  se for metodo de sobrecarga oque muda e as assinaturas
    //ja na sobreposição sao metodos com as mesmas assinaturas
}
