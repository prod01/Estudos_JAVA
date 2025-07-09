import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
     Scanner input = new Scanner(System.in);
    
    System.out.println("Informe um ano para saber se e bissexto:");
  
    int ano = input.nextInt();

    if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){
      System.out.println("O ano " + ano + " e bissexto:");
    }
    else {
      System.out.println("O ano " + ano + " não bissexto:");
    }
    input.close();
  }
}