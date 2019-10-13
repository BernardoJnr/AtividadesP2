package atvlista3;

public class Produto {

    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double novoCusto) {
        this.precoCusto = novoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double novoVenda) {
        if (novoVenda >= precoCusto) {
            this.precoVenda = novoVenda;
        } else {
            System.out.println("Preco de venda menor que o de custo!!!");
        }
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double novoLucro) {
        this.margemLucro = novoLucro;
    }

    public double calcularMargemLucro() {
        return this.precoVenda - this.precoCusto;
    }

    public double getMargemLucroPorcentagem() {
        return calcularMargemLucro() / (getPrecoCusto() / 100);
    }
}
