package atvsaladeaula;

public class Sala {
    int numero;
    int qtdAlunos;
    
    void identificar(){
        System.out.println("Numero da Sala: " + numero + "\nQuantidade maxima de alunos: " + qtdAlunos);
    }
    
    String capacidadeMax(){
        return (qtdAlunos > 25 ? "Sala passou do limite maximo!!" : "Sala ainda com vagas!!");
    }
}
