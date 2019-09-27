package atvsaladeaula;

public class AtvSalaDeAula {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        
        aluno1.nome = "Joao da Silva";
        aluno1.sexo = "Masculino";
        aluno1.cpf = 542265214;
        
        aluno1.falarNome();
        aluno1.falarSexo();
        aluno1.falarCpf();
    }
    
}
