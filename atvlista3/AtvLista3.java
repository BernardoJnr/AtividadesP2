package atvlista3;

import java.util.ArrayList;
import java.util.Scanner;

public class AtvLista3 {

    public static void main(String[] args) {

        //Questao1();
        //Questao2();
        //Questao3();
        //Questao4();
        Questao5();

    }

    static void Questao1() {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Marcos");
        pessoa1.setAltura(1.88);
        pessoa1.setIdade(33);
        pessoa1.setPeso(80);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Altura: " + pessoa1.getAltura());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Peso: " + pessoa1.getPeso());
        System.out.println("IMC: " + pessoa1.imc());

        pessoa1.mostraDados();
    }

    static void Questao2() {
        Produto prod1 = new Produto();
        Scanner novo = new Scanner(System.in);

        System.out.print("Digite o preço de custo: ");
        prod1.setPrecoCusto(novo.nextDouble());
        System.out.print("Digite o preco de venda: ");
        prod1.setPrecoVenda(novo.nextDouble());

        System.out.println("Preco de custo: " + prod1.getPrecoCusto());
        System.out.println("Preco de venda: " + prod1.getPrecoVenda());
        System.out.println("Sua margem de lucro: " + prod1.calcularMargemLucro());
        System.out.println("Sua porcentagem de lucro (%): " + prod1.getMargemLucroPorcentagem());
    }

    static void Questao3() {
        Conta conta1 = new Conta(12248, "Marcos", 100);
        Conta conta2 = new Conta(88425, "Paulo", 4000);

        conta1.saca(2500);
        conta1.deposita(300);

        conta2.saca(1000);

        System.out.println("Saldo conta 1: " + conta1.getSaldo());
        System.out.println("Saldo conta 2: " + conta2.getSaldo());

        conta2.transfere(conta1, 2000);

        conta1.transfere(conta2, 2500);

        conta1.imprimeNome();
        conta2.imprimeNome();

        conta1.setNome("Lima");
        conta1.imprimeNome();
    }

    static void Questao4() {
        ArrayList<Funcionario> executivo = new ArrayList<Funcionario>();
        ArrayList<Funcionario> administrativo = new ArrayList<Funcionario>();
        ArrayList<Funcionario> empresarial = new ArrayList<Funcionario>();
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

        Funcionario funcionario3 = new Funcionario("Tereza", 1452041789, 1500, Cargo.EXECUTIVO);
        executivo.add(funcionario3);
        lista.add(funcionario3);

        Funcionario funcionario2 = new Funcionario("Paulo", 414785145, 1200, Cargo.ADMINISTRATIVO);
        administrativo.add(funcionario2);
        lista.add(funcionario2);

        Funcionario funcionario1 = new Funcionario("Joao", 254545644, 1600, Cargo.EMPRESARIAL);
        empresarial.add(funcionario1);
        lista.add(funcionario1);

        System.out.println("Lista:");
        for (Funcionario i : lista) {
            System.out.println("Nome: " + i.getNome());
            System.out.println("Saldo: " + i.getSalario());
        }
        System.out.println("+++++++++++++++++++++++++++++++");
        for (Funcionario i : empresarial) {
            System.out.println("Empresarial: " + i.getNome());
            System.out.println("Saldo: " + i.getSalario());
        }
        for (Funcionario i : administrativo) {
            System.out.println("Adminstrativo: " + i.getNome());
            System.out.println("Saldo: " + i.getSalario());
        }
        for (Funcionario i : executivo) {
            System.out.println("Executivo: " + i.getNome());
            System.out.println("Saldo: " + i.getSalario());
        }
    }

    static void Questao5() {
        ArrayList<Analise> analises = new ArrayList<Analise>();
        ArrayList<Analise> analises2 = new ArrayList<Analise>();

        Analise note1 = new Analise("Acer",5,4,4,4,5,3); 
        Analise note2 = new Analise("Samsung",2,1,1,2,3,4);
        Analise note3 = new Analise("Philips",2,3,1,4,4,5); 
        
        analises.add(note1);
        analises.add(note2);
        analises.add(note3);

        for (Analise i : analises) {
            if (i.analiseGeral() >= 3) {
                analises2.add(i);
            }   
        }
        for(Analise i : analises2){
            System.out.println(i.getNome());
        }
    }
}

