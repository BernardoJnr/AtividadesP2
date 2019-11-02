package campominado;

import java.util.Random;

public class Tabuleiro extends Jogador {

    char tabuleiro[][];

    Random random = new Random();

    public Tabuleiro() {

    }

    public void inciandoTabuleiro() {
        for (int linha = 0; linha < mina.length; linha++) {
            for (int coluna = 0; coluna < mina.length; coluna++) {
                System.out.print("  " + mina[linha][coluna]);
            }
            System.out.println();
        }
    }

    public int numeroDeBombas() {
        return ((tamanhoL * tamanhoC) * 16) / 100;
    }

    public void preenchendoTabuleiroComBombas() {
        boolean sorteado;
        int linha, coluna;
        for (int i = 0; i < numeroDeBombas(); i++) {

            do {
                linha = random.nextInt(tamanhoL);
                coluna = random.nextInt(tamanhoC);

                if (mina[linha][coluna] == -1) {
                    sorteado = true;
                } else {
                    sorteado = false;
                }
            } while (sorteado);

            mina[linha][coluna] = -1;
        }
    }

}
