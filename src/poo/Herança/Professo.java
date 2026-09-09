package poo.Herança;
//classe filha que herda tudoo de mae mais seus atributos exclusivos e metodos
public class Professo extends Pessoa{
    private String especialidade;
    private double salario;

    public void ReceberAumento(){

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
