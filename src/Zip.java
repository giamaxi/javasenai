// Sub classe ou classe filha
public class Zip extends Documento {

    private String Descompacta;
    private String ImprimeZip;

    public Zip(String nome) {
        super(nome);
        this.musicaAtual = musica;
        this.artista = artista;
    }


    //private String musicaAtual;
    //private String artista;

    //public Celular(String nome, String musica, String artista) {
        // Chamando o construtor da classe mãe.
      //  super(nome);
    //    this.musicaAtual = musica;
  //      this.artista = artista;
//    }




    @Override
    public void imprimir() {
        System.out.println("Vai Zipar: '" + nome + "' yyyy");
    }
}