import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

         Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivoMB = input.nextDouble();

        System.out.print("Digite a velocidade do link de internet (em Mbps): ");
        double velocidadeInternetMbps = input.nextDouble();

        double tamanhoArquivoBits = tamanhoArquivoMB * 8 * 1024 * 1024;
        double tempoSegundos = tamanhoArquivoBits / (velocidadeInternetMbps * 1024 * 1024);
        double tempoMinutos = tempoSegundos / 60;

        System.out.println("Tempo aproximado de download: " + tempoMinutos + " minutos");
    }
}
