package atvsaladeaula;

public class Aluno {
    String nome;
    int idade;
    int matricula;
    
    public Aluno(String nomeA , int idadeA, int matriculaA){
        this.nome = nomeA;
        this.idade = idadeA;
        this.matricula = matriculaA;
    }
    
    String mostra(){
        return ("Nome do aluno: " + nome + "\nIdade do aluno: " + idade + "\nMatricula do aluno: " + matricula);
    }
    
    String idadeMatricular(){
        return ((idade >= 18 ? "Pode fazer matricula!" : "Não pode fazer matricula!"));  
    }
    
    void matriculaA(int novaMatricula){
        matricula = novaMatricula;
    }
}
