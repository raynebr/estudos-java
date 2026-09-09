package poo.Herança;
//classe filha que herda tudoo de mae mais seus atributos exclusivos e metodos
public class Aluno extends Pessoa{
    private  int matr;
    private  String curso;

    public void cancelarMatr(){

    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
