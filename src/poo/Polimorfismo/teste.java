package poo.Polimorfismo;

public class teste {
    static void main() {
        Animal m = new Mamifero();
        Animal p = new Peixe();
        Animal r = new Reptil();
        Animal a = new Ave();

        m.setPeso(5);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
       //polimorfismo de sobreposição ocorre quando substituido  metodo de uma super classe em uma subclasse com a mesma assinatura
    }
}
