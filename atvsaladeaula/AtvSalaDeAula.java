package atvsaladeaula;

public class AtvSalaDeAula {

    public static void main(String[] args) {
        
       Aluno aluno1 = new Aluno("Joao da Silva", 21, 1522147);
       Aluno aluno2 = new Aluno("Antonio Francisco", 17, 1522478);
  
       System.out.println(aluno1.mostra());
       System.out.println(aluno1.idadeMatricular());
       System.out.println(aluno2.mostra());
       System.out.println(aluno2.idadeMatricular());
       System.out.println("====================================");
       
       Sala sala1 = new Sala();
       sala1.numero = 14;
       sala1.qtdAlunos = 26;
       Sala sala2 = new Sala();
       sala2.numero = 06;
       sala2.qtdAlunos = 23;
       
       sala1.identificar();
       System.out.println(sala1.capacidadeMax());
       sala2.identificar();
       System.out.println(sala2.capacidadeMax());
       System.out.println("====================================");
       
       Professor prof1 = new Professor("João Eudes", "Circuitos Digitais", 123458714);
       Professor prof2 = new Professor("Marcos Oliveira", "Estatistica", 478546899);
       
       System.out.println(prof1.informacao());
       System.out.println(prof1.disciplinaDispo());
       System.out.println(prof2.informacao());
       System.out.println(prof2.disciplinaDispo());
       System.out.println("====================================");
       
       Escola escola1 = new Escola("E.M. Inacio Farias", "Av. inacio Farias", 120);
       Escola escola2 = new Escola("U.E. Visconde Sabugosa", "Av. Getulio vargas", 100);
       
       System.out.println(escola1.mostrar());
       System.out.println(escola1.capacidade());
       System.out.println(escola2.mostrar());
       System.out.println(escola2.capacidade());
       System.out.println("====================================");  
    }
    
}
