package atvsaladeaula;

public class Professor{
    String nome;
    String disciplina;
    int cpf;
    
    public Professor(String nomeP, String disciplinaP,  int cpfP){
        this.nome = nomeP;
        this.cpf = cpfP;
        this.disciplina = disciplinaP;
    }
    
    String disciplinaDispo(){
        return((disciplina == "Estatistica")?"Disciplina disponivel!" : "Disciplina não disponivel!");
    }
    
    String informacao(){
        return ("Nome do professor: " + nome + "\nCPF do professor: " + cpf + "\nDisciplina do professor: " + disciplina);
    }
}

