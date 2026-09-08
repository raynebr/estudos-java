package poo.EstruturaInicial;


//definição da classe
public class Caneta {
    //nivel de acesso + tipo  + nome do atributo
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected Boolean tampada;

    //metodos comuns
       void status(){
            System.out.println("uma caneta:" + this.cor);
            System.out.println("esta tampada?" + this.tampada);
            System.out.println("e um modelo:" + this.modelo);
            System.out.println("tem ponta:" + this.ponta);
            System.out.println("esta carregada?" + this.carga);
       }

       void rabiscar(){
           if (tampada == true){
               System.out.println("erro: caneta tampada");
           }else {
               System.out.println("rabisco");
           }

       }

       void destampar(){
          this.tampada =false;
       }

       void tampar(){
           this.tampada = true;
       }


       //METODOS GETTERS SETTERS E CONSTRUTOR

        //metrodo acessor
       public String getModelo(){
           return this.modelo;
       }

       //metodo modificador
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    //criando um construtor
    public  Caneta(String m, String c, float p){
           this.modelo = m;
           this.cor = c;
           this.ponta = p;
    }
}