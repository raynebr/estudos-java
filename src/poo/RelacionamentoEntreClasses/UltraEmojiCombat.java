package poo.RelacionamentoEntreClasses;

public class UltraEmojiCombat {
    static void main() {
        Lutador l[] = new Lutador[6];//estanciando o array do objeto


       l[0] =new Lutador("pretty boy","frança",
               31,11,2,1,82,1.90);

       l[1] =new Lutador("putScript","Brasil",
                29,14,2,1,82,1.68);
       Luta uec1= new Luta();
       uec1.marcarLuta(l[0],l[1]);
       uec1.lutar();
    }
}
