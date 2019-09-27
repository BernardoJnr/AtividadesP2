package atvlista2;

public class AtvLista2 {

    public static void main(String[] args) {
        //questao2();
        //questao4();
        //questao7();
        //questao9();
           
    }
    
        static void questao2(){
        Lampada lampa1 = new Lampada();
        lampa1.ligada = true;
        lampa1.observa();

        Lampada lampa2 = new Lampada();
        lampa2.ligada = false;
        lampa2.observa();
    }
        
        static void questao4(){
            UsaQuadrado q1 = new UsaQuadrado(2);
            UsaQuadrado q2 = new UsaQuadrado(4);
            UsaQuadrado q3 = new UsaQuadrado(5);
        }
        
        static void questao7(){
            UsaEstoque estoque1 = new UsaEstoque("Impressora Jato de Tinta", 13 , 6);
            UsaEstoque estoque2 = new UsaEstoque("Monitor LCD 17 polegadas", 11 , 13);
            UsaEstoque estoque3 = new UsaEstoque("Mouse Ótico", 6 , 2);
            
            estoque1.darBaixa(5);
            estoque2.repor(7);
            estoque3.darBaixa(4);
            
            System.out.println(estoque1.mostra());
            System.out.println(estoque1.precisaRepor()? "Precisa repor!!" : "Não precisa repor!!!!");
            
            System.out.println(estoque2.mostra());
            System.out.println(estoque2.precisaRepor()? "Precisa repor!!" : "Não precisa repor!!!!");
         
            System.out.println(estoque3.mostra());    
            System.out.println(estoque3.precisaRepor()? "Precisa repor!!" : "Não precisa repor!!!!");              
        }
        
        static void questao9(){
            Conta cliente1 = new Conta("Joao da Silva", "3436", "27/09/2019", 14826, 5000);
            Conta cliente2 = new Conta("Bernardo Junior", "4578", "28/12/2018", 25551, 2000);
            Conta cliente3 = new Conta("Marcos Teixeira", "3625", "05/04/2019", 267841, 10000);
            Conta cliente4 = new Conta("Antonio Pedro", "1056", "08/06/2019", 367891, 12000);
            
            System.out.println(cliente1.recuperarDadosParaImpressao());
            System.out.println(cliente2.recuperarDadosParaImpressao());
            System.out.println(cliente3.recuperarDadosParaImpressao());
            System.out.println(cliente4.recuperarDadosParaImpressao());
        }  
}
