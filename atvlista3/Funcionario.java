package atvlista3;

public class Funcionario {

    private String nome;
    private long cpf;
    private double salario;
    private Cargo cargo;

    public Funcionario(String novoNome, long novoCpf, double novoSalario, Cargo novoCargo) {
        this.nome = novoNome;
        this.cpf = novoCpf;
        this.salario = novoSalario;
        this.cargo = novoCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario;
    }
}
