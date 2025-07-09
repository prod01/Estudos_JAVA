import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora trabalhada:");
    
        double lavalor_hora_homem = input.nextDouble();

        double horas_trabalhadas_mes = 220;

        double Salario = lavalor_hora_homem * horas_trabalhadas_mes;

        System.out.println("Seu salario mensal é " + Salario);

        input.close();
    
    }
}
