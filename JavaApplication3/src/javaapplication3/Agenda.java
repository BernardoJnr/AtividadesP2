
package javaapplication3;

public class Agenda {
    private int dia;
    private int mes;
    private String descricao;
    
    void anote(int novoDia, int novoMes, String novaDesc){
        dia = novoDia;
        mes = novoMes;
        descricao = novaDesc;
        
        validaData();
    }
    
    void validaData(){
       if((dia < 1)||(dia > 31)||(mes < 1)||(mes > 12)){
           dia = 0;
           mes = 0;
           descricao = "Data invalida!!";
       } 
    }
    
    public String mostraAnotacao(){
        return (dia + "/" + mes + "/" + descricao);
    }
    
 
}
