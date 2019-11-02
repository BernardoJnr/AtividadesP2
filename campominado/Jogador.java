package campominado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogador {

    int tamanhoL, tamanhoC, mina[][];

    Scanner scan = new Scanner(System.in);

    public Jogador() {

    }

    public void lendoTamanhoDotabuleiro() {
        boolean teste = true;
        do {
            try {
                System.out.println("Total de linhas: ");
                tamanhoL = scan.nextInt();
                System.out.println("Total de colunas: ");
                tamanhoC = scan.nextInt();
                teste = false;
            } catch (InputMismatchException erro) {
                System.out.println("Digite um numero valido!");
            }
        } while (teste);
    }

    public void iniciandoTamanhoDoTabuleiro() {
        mina = new int[tamanhoL][tamanhoC];
    }

}
