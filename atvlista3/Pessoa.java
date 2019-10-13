package atvlista3;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double novaAltura) {
        this.altura = novaAltura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double novoPeso) {
        this.peso = novoPeso;
    }

    public double imc() {
        return peso / (altura * altura);
    }

    public void mostraDados() {
        System.out.format("Nome: " + nome + "\nIdade: " + idade + "\nAltura : " + altura + "\nPeso: " + peso + "\nIMC: " + imc());
    }
}
