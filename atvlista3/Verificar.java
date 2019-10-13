package atvlista3;

import java.util.ArrayList;

public class Verificar {

    private int tamanho, positivos, negativos, primos, divisiveis;
    private ArrayList<Integer> lista = new ArrayList();

    public ArrayList<Integer> getArray() {
        return lista;
    }

    public void setArray(ArrayList novaLista) {
        this.lista = novaLista;
    }

    public void tamanho() {
        System.out.println("Tamanho da Lista: " + lista.size());
    }

    public void Positivos() {
        for (Integer positivo : lista) {
            if (positivo >= 0) {
                System.out.println("Positivos: " + positivo);   
            }
        }  
    }

    public void Negativos() {
        for (Integer negativo : lista) {
            if (negativo < 0) {
                System.out.println("Positivos: " + negativo);
            }
        }
    }

    public void Primos() {
        int contador = 0;
        for (Integer primo : lista) {
            for (int i = 1; i <= lista.size(); i++) {
                if (primo % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println("Primos: " + primo);
            }
            contador = 0;
        }

    }

    public void Divisiveis(int novaDivisao) {
        for (int divisivel : lista) {
            if (divisivel % novaDivisao == 0) {
                System.out.println("Numeros Divisiveis: " + divisivel);
            }
        }
    }

}
