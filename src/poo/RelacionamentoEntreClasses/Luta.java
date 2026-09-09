package poo.RelacionamentoEntreClasses;

import java.util.Random;

public class Luta {
  //declarando os dados abstratos

    private Lutador desafiado;
    private Lutador desafiante;

    //agora dados primitivos de se ver
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1,Lutador l2){
       if (l1.getCategoria() .equals(l2.getCategoria()) && l1 != l2){
           this.aprovada = true;
           this.desafiado =l1;
           this.desafiante = l2;
       }else {
           this.aprovada = false;
           this.desafiado =null;
           this.desafiante = null;
       }
    }

    public void lutar() {
        if (this.aprovada == true) {
            desafiado.apresentar();
            desafiante.apresentar();
            desafiado.status();
            desafiante.status();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                break;
                case 1:
                    System.out.println(desafiado + " " + "venceu!!!" );
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante + " " + "vendeu!!!");
                    break;

            }
        }else{
            System.out.println("luta nao pode acontecer");
        }
    }
        //metodos especiais

        public Lutador getDesafiado () {
            return desafiado;
        }

        public void setDesafiado (Lutador dd){
            this.desafiado = dd;
        }


        public Lutador getDesafiante () {
            return desafiante;
        }

        public void setDesafiante (Lutador desafiante){
            this.desafiante = desafiante;
        }

}