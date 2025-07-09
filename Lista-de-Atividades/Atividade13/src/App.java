import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua altura para saber seu peso ideal : ");

        float altura = input.nextFloat();

        double valor_fixo_1_H = 72.7; 
        int valor_fixo_2_H = 58 ; 

        double valor_fixo_1_M = 62.1; 
        double valor_fixo_2_M = 44.7 ; 

        double peso_ideal_H = (valor_fixo_1_H * altura) - valor_fixo_2_H;

        double peso_ideal_M = (valor_fixo_1_M * altura) - valor_fixo_2_M;
        
        System.out.println("O peso ideal da altura " + altura + " Para homen "+ peso_ideal_H +" Para mulheres " + peso_ideal_M);

        input.close();
    
    }
}
