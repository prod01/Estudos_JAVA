import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero para que ele seja escrito por extenco");
    
        int numero_1 = input.nextInt();
        int numero_2 = input.nextInt();

        System.out.println("Informe 1 - soma 2 - subtracao 3 - divisao 4 - multiplicacao");

        int opercao = input.nextInt();

        if (opercao == 1){

            System.out.println("A soma de " + numero_1 + "+" + numero_2 +  "e igual a " + soma ( numero_1,  numero_2));

           verificarPropriedades(soma ( numero_1,  numero_2));
     
    
        }

        else if  (opercao == 2){

            System.out.println("A subtracao de " + numero_1 + "+" + numero_2 +  "e igual a " + subtracao ( numero_1,  numero_2));

            verificarPropriedades(subtracao ( numero_1,  numero_2));

           
        }

        else if  (opercao == 3){

            System.out.println("A divisao de " + numero_1 + "+" + numero_2 +  "e igual a " + divisao ( numero_1,  numero_2));
        
            verificarPropriedades(divisao ( numero_1,  numero_2));

            

        }

        else if  (opercao == 4){

            System.out.println("A multiplicacao de " + numero_1 + "+" + numero_2 +  "e igual a " + multiplicacao ( numero_1,  numero_2));

            verificarPropriedades(multiplicacao ( numero_1,  numero_2));
            
            
        }

        else{

            System.out.println("valor invalido");

           
        }


        input.close();
    
    }

   public static double soma (int numero_1, int numero_2){

        int valor = numero_1 +  numero_2;

        return(valor);

   }

    public static double subtracao (int numero_1, int numero_2){

        int valor = numero_1 -  numero_2;

        return(valor);


   }

    public static double divisao (int numero_1, int numero_2){

        int valor = numero_1 /  numero_2;

        return(valor);

   }

    public static double multiplicacao (int numero_1, int numero_2){

        int valor = numero_1 *  numero_2;

        return(valor);
   }

    public static void verificarPropriedades (double valor ){

       

        if(valor % 2 == 0){

         System.out.println("Par");

        }

        else{

         System.out.println("Par");

        }


        if (valor > 0) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }


         if (valor % 1 == 0) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }



    }



}
