import java.util.InputMismatchException; //Classe para verificação de erros de entrada
import java.util.Scanner;

public class Main { // Alterado de CentralDeControle para Main

    // Este é o nosso "Botão Play" polimórfico.
    public void apertarPlay(DispositivoDeMidia dispositivo) {
        System.out.println("Conectando ao dispositivo: " + dispositivo.nomeDoDispositivo);
        dispositivo.reproduzir();
        System.out.println("---");
    }



    public static void main(String[] args) {
        // Agora instanciamos a classe Main


        Main controle = new Main(); //Classe genérica

        // Criando os objetos (Atenção: SmartTv deve ser igual ao nome do seu arquivo .java)
        SmartTV tvDaSala = new SmartTV("TV da Sala", "Matrix");
        Celular meuCelular = new Celular("iPhone 15", "Stairway to Heaven", "Led Zeppelin");
        RadioAutomotivo radioDoCarro = new RadioAutomotivo("Rádio do Carro", 98.9);

        // USANDO O POLIMORFISMO:
        controle.apertarPlay(tvDaSala);
        controle.apertarPlay(meuCelular);
        controle.apertarPlay(radioDoCarro);



        System.out.println("\n--- Demonstração com uma Lista de Dispositivos ---");

        // Criando a lista polimórfica
        DispositivoDeMidia[] meusDispositivos = {tvDaSala, meuCelular, radioDoCarro};

        for (DispositivoDeMidia dispositivo : meusDispositivos) {
            dispositivo.reproduzir();
        }
    }
}
