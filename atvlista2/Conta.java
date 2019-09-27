
//QUESTÃO 8

package atvlista2;

public class Conta {
    String titular;    
    String agencia;
    String abertura;
    int numero;
    double saldo;

    public Conta(String titular, String agencia, String abertura, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.abertura = abertura;
        this.numero = numero;
        this.saldo = saldo;
        
        saca(1200);
        deposita(600);
        calculaRendimento();
    }
    
    
    
    void saca(double valor){
        saldo -= valor;
    }
    
    void deposita(double depositoValor){
        saldo += depositoValor;
    }
    
    double calculaRendimento(){
        return (saldo * 0.1);
    }
    
    String recuperarDadosParaImpressao(){
        return ("Nome: "+ titular + "\nConta: " + numero + "\tAgencia: " + agencia + "\nData de abertura: "+ abertura +
                "\nSaldo: R$" + saldo + "\nRendimento Mensal: R$" + calculaRendimento());
    }   
}
