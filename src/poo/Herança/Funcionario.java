package poo.Herança;
//classe filha que herda tudoo de mae mais seus atributos exclusivos e metodos
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
