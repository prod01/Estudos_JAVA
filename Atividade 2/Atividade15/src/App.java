import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe os lados do trinagulo para saber se e ee quilatero, isosceles ou escaleno ");
    
        int lado_a = input.nextInt();

        int lado_b = input.nextInt();

        int lado_c = input.nextInt();


        if (lado_a == lado_b && lado_a == lado_c &&  lado_b == lado_c ){

            System.out.println(" trinagulo escaleno ");

        }

        else if  (lado_a != lado_b && lado_a !=  lado_c &&  lado_b != lado_c ){
            
            System.out.println(" trinagulo isosceles ");
        
        }

        else if  (lado_a == lado_b || lado_a == lado_c ||  lado_b == lado_c){

            System.out.println(" trinagulo escaleno ");
        
        }


        input.close();
    
    }
}
