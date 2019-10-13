package atvlista3;

public class Jogador {

    private String nome, nascimento, sexo, posicao;
    private int cpf, golsPro, golsContra, amarelos, vermelhos, partidas;
    private Time time = new Time();

    public Jogador() {
    }

    public Jogador(String novoNome, String novoNascimento, int novoCpf, String novoSexo, Time novoTime, String novoPosicao, int novoGolsPro,
                   int novoGolsContra, int novoAmarelo, int novoVermelho, int novoPartida) {
        this.nome = novoNome;
        this.nascimento = novoNascimento;
        this.cpf = novoCpf;
        this.sexo = novoSexo;
        this.time = novoTime;
        this.posicao = novoPosicao;
        this.golsPro = novoGolsPro;
        this.golsContra = novoGolsContra;
        this.amarelos = novoAmarelo;
        this.vermelhos = novoVermelho;
        this.partidas = novoPartida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getDataNascimento() {
        return nascimento;
    }

    public void setDataNascimento(String novoNascimento) {
        this.nascimento = novoNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int novoCpf) {
        this.cpf = novoCpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String novoSexo) {
        this.sexo = novoSexo;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time novoTime) {
        this.time = novoTime;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String novoPosicao) {
        this.posicao = novoPosicao;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int novoGolsPro) {
        this.golsPro = novoGolsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int novoGolsContra) {
        this.golsContra = novoGolsContra;
    }

    public int getAmarelos() {
        return amarelos;
    }

    public void setCartoesAmarelos(int novoAmarelo) {
        this.amarelos = novoAmarelo;
    }

    public int getVermelhos() {
        return vermelhos;
    }

    public void setCartoesVermelhos(int novoVermelho) {
        this.vermelhos = novoVermelho;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setPartidasJogadas(int novoPartidas) {
        this.partidas = novoPartidas;
    }
}
