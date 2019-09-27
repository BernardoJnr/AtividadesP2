
//QUESTÃO 01

package atvlista2;

public class Lampada {
    boolean ligada;
    
    void liga(){
        ligada = true;
    }
    
    void desliga(){
        ligada = false;
    }
    
    void observa(){
        System.out.println((ligada == true)? "Ligada!!" : "Desligada!!");
    }
}
