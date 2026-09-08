package poo.EstruturaInicial;

public class TestesPoo {
    public static void main(String[] args) {

        //estanciando/criando um objeto
        Caneta c1 = new Caneta("bic", "preta", 1.0f);

        //referenciando a atributos de um objeto
        c1.carga = 100;
        c1.modelo = "big";
        c1.cor = "azul";


        //referenciando a metodos do objeto
         c1.destampar();
         c1.rabiscar();
         c1.status();

        //modificando usando os setters
        c1.setModelo("big");
        c1.setPonta(0.5f);

        //mostrando usando getters
        System.out.println("e um modelo:" + c1.getModelo());

        //usando o construtor
        c1.status();




        System.out.println("esta e a segunda caneta");

        Caneta c2 = new Caneta("bic", "preta", 1.0f);
        c2.status();
    }
}
