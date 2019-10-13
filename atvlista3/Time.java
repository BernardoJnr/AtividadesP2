package atvlista3;

import java.util.ArrayList;

public class Time {

    private String nome, fundacao;
    private ArrayList<Jogador> jogadores = new ArrayList();
    private Tecnico tecnico = new Tecnico();

    public Time() {
    }

    public Time(String novoNome, String novoFundacao, ArrayList novoJogadores, Tecnico novoTecnico) {
        this.nome = novoNome;
        this.fundacao = novoFundacao;
        this.jogadores = novoJogadores;
        this.tecnico = novoTecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getFundacao() {
        return fundacao;
    }

    public void setFundacao(String novoFundacao) {
        this.fundacao = novoFundacao;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico novoTecnico) {
        this.tecnico = novoTecnico;
    }

    public void artilheiro() {
        int maior = 0, a = 0;

        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getGolsPro() > maior) {
                maior = jogadores.get(i).getGolsPro();
                a = i;
            }
        }
        System.out.println("Artilheiro do time: " + jogadores.get(a).getNome());
    }

    public void experiente() {
        int maior = 0, a = 0;

        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getPartidas() > maior) {
                maior = jogadores.get(i).getPartidas();
                a = i;
            }
        }
        System.out.println("Mais experiente do time: " + jogadores.get(a).getNome());
    }

    public void statusTime() {
        for (Jogador status : jogadores) {
            System.out.println("\nNome: " + status.getNome() + "\nPosição: " + status.getPosicao());
        }
        System.out.println("\nTecnico: " + tecnico.getNome() + "\nData de entrada: " + tecnico.getEntrada() + "\nUltimo time que comandou: " + tecnico.getUltimo());
    }
}