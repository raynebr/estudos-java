package poo.RelacionamentoEntreClasses;
//voce cria o objeto depois instancia o array na classe UltraEmogiCombate
public class Lutador {
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade;
    private int vitorias;
    private int derrotas;
    private int empates;
    private double peso;
    private double altura;

    public void apresentar(){
      System.out.println("CHEGOU A HORA apresentamos o lutador"+" "+ this.getNome());
      System.out.println("diretamente de " + this.getNacionalidade());
      System.out.println("com " + this.getIdade() + "e altura de "+ this.getAltura() );
      System.out.println("pesando " + this.getPeso()+"Kg");
      System.out.println(this.getVitorias()  +"vitorias");
      System.out.println(this.getDerrotas()+"derrotas");
      System.out.println(this.getEmpates()+"empates");
    }

    public void status(){
        System.out.println(this.getNome()+ "é um peso " +this.getCategoria());
        System.out.println("ganhou" + this.getVitorias()+"vezes");
        System.out.println("perdeu " +this.getDerrotas()+"vezes");
        System.out.println("empatou" + this.getEmpates()+"vezes");
    }

    public void ganharLuta(){
       this.setVitorias(this.getVitorias() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public Lutador(String no, String na,  int id,
                   int vi, int de, int em, double pe,
                   double al) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.setPeso(pe);
        this.altura = al;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "invalido";
        }else if (this.peso <= 70.3){
            this.categoria = "leve";
        }else if (this.peso <= 83.3){
            this.categoria = "medio";
        }else if (this.peso <=120.2){
            this.categoria ="pesado";
        }else{
            this.categoria = "invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}