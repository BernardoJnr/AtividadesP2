package atvlista3;

public class Tecnico {

    private String nome, entrada, ultimo;

    public Tecnico() {
    }

    public Tecnico(String novoNome, String novoEntrada, String novoUltimo) {
        this.nome = novoNome;
        this.entrada = novoEntrada;
        this.ultimo = novoUltimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setDataEntrada(String novoEntrada) {
        this.entrada = novoEntrada;
    }

    public String getUltimo() {
        return ultimo;
    }

    public void setUltimoTime(String novoUltimo) {
        this.ultimo = novoUltimo;
    }
}
