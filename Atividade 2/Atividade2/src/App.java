import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numeros para saber se e positivo ou negativo");
    
        int num = input.nextInt();



        if (num > 0){

            System.out.println(num +" Esse numero e positivo ");
        }

        else {

           System.out.println(num +" Esse numero e negativo ");
        }

       



        
        input.close();
    
    }
}
