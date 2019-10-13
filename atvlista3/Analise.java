package atvlista3;

public class Analise {
    
    private String nome;
    private double preco, economiaEnergia, portabilidade, design, qualidadeAudio, video;

    private double resultado;


    public Analise(String novoNome, int novoPreco, int novoEconomia, int novoPortabilidade, int novoDesign, int novoAudio, int novoVideo) {
        this.nome = novoNome;
        this.preco = novoPreco;
        this.economiaEnergia = novoEconomia;
        this.portabilidade = novoPortabilidade;
        this.design = novoDesign;
        this.qualidadeAudio = novoAudio;
        this.video = novoVideo;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        condicao(novoPreco, this.preco);
    }

    public double getEconomiaEnergia() {
        return economiaEnergia;
    }

    public void setEconomiaEnergia(double novoEconomia) {
        condicao(novoEconomia, this.economiaEnergia);
    }

    public double getPortabilidade() {
        return portabilidade;
    }

    public void setPortabilidade(double novoPortabilidade) {
        condicao(novoPortabilidade, this.portabilidade );
    }

    public double getDesign() {
        return design;
    }

    public void setDesign(double design) {
        condicao(design, this.design);
    }

    public double getQualidadeAudio() {
        return qualidadeAudio;
    }

    public void setQualidadeAudio(double novoAudio) {
        condicao(novoAudio, this.qualidadeAudio);
    }

    public double getVideo() {
        return video;
    }

    public void setVideo(double novoVideo) {
        condicao(novoVideo, this.video);
    }

    private void condicao(double a, double b) {
        if (a <= 5 && a >= 0) {
            b = a;
        }else{
            System.out.println("Somente nota de 0 a 5!");
        }
    }

    public double analiseGeral() {
        resultado = (preco + economiaEnergia + portabilidade + design + qualidadeAudio + video) / 6;  
        return resultado;
    }
}
