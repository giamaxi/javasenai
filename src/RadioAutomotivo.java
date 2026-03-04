// Arquivo: RadioAutomotivo.java
public class RadioAutomotivo extends DispositivoDeMidia {
    private double estacaoAtual;

    public RadioAutomotivo(String nome, double estacao) {
        super(nome);
        this.estacaoAtual = estacao;
    }

    @Override
    public void reproduzir() {
        System.out.println("O rádio " + nomeDoDispositivo + " está sintonizado em: " + estacaoAtual + " FM.");
    }
}