package atvsaladeaula;

public class Aluno {
    String nome;
    String sexo;
    int idade;
    int cpf;
    
    void falarNome(){
        System.out.println("Nome do aluno: " + nome);
    }
    
    void falarSexo(){
        System.out.println("Sexo do aluno: " + sexo);
    }
    
    void falarCpf(){
        System.out.println("Cpf do aluno: " + cpf);
    }
}
