
package javaapplication3;

public class Vetor {
    private Agenda[] agenda;
    private int cont=0;
    
    public Vetor(){
        agenda = new Agenda[100]; 
    }
    public void adiciona(Agenda novo){
       agenda[cont] = novo;
       cont++;  
    }
    
    public Agenda busca(int pos){
        return agenda[pos];
    }
    
    public void remove(int pos){
        agenda[pos] = null;
        cont--;
    }
    public Agenda[] getLista(){
        return agenda;
    }
}
