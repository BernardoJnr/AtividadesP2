
//QUESTÂO 5 e 6

package atvlista2;

public class Estoque {
    String nome;
    int qtdAtual;
    int qtdMinima;

    public Estoque() {
        
    }
    
    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
        
    }
    
    void mudarNome(String novoNome){
        nome = novoNome;
    }
    
    void mudarQtdMinima(int mudarQtdMinima){
        qtdMinima = mudarQtdMinima;
    }
    
    void repor(int qtd){
        qtdAtual += qtd;
    }
    
    void darBaixa(int qtd){
        qtdAtual -= qtd;
    }
    
    String mostra(){
        return ("Nome: " + nome + "\nQuantidade atual: " + qtdAtual + "\nQuantidade Minima: " + qtdMinima);
    }
    
    boolean precisaRepor(){
        return qtdAtual <= qtdMinima;
    }

}
