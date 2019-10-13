package atvlista3;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Boolean saca(double novoValor) {
        if (novoValor <= this.saldo) {
            this.saldo -= novoValor;
            return true;
        } else {
            return false;
        }
    }
    
    public void deposita(double novoDeposito) {
        this.saldo += novoDeposito;
    }
    
    public Boolean transfere(Conta destino, double novoValorTrans) {
        if (novoValorTrans <= this.saldo) {
            this.saldo -= novoValorTrans;
            destino.deposita(novoValorTrans);
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimeNome() {
        System.out.println("Nome: " + this.nome + "\nSaldo: " + this.saldo);
    }
    
     public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public double getSaldo() {
        return saldo;
    }

   

    
    

    
}
