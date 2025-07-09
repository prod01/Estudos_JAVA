import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantos kilos você pescou hoje ");
    
        float peso = input.nextFloat();

        int multa = 4;

        int limite = 50;


        if (peso >50){

            double peso_excedente = peso - limite;

            double valor_da_multa = peso_excedente * multa;

            System.out.println("Você pescou mais que 50 kg hoje  ");
            System.out.println("Você foi multado em " + valor_da_multa);
        }

        else {

            System.out.println("Sua pesca não excedeu o limite");

        }

       



        
        input.close();
    
    }
}
