package atvsaladeaula;


public class Escola{
    String nomeE;
    String endereco;
    int capacidade;

    public Escola(String nomeE, String endereco, int capacidade) {
        this.nomeE = nomeE;
        this.endereco = endereco;
        this.capacidade = capacidade;
    }
    
    
    String mostrar(){
        return ("Nome da escola: " + nomeE + "\nEndereço da escola: " + endereco + "\nCapacidade da Escola: " + capacidade);
    }
    
    String capacidade(){
        return((capacidade <= 100)? "Escola com vagas!" : "Escola sem vagas!");
    }    
}
