import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = input.nextLine();
        
        if (validacaoData(data)) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }
        
        input.close();
    }
    
    public static boolean validacaoData(String data) {
        try {
            
            String[] partes = data.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);
            
          
            if (ano < 1 || ano > 9999) {
                return false;
            }
            
            
            if (mes < 1 || mes > 12) {
                return false;
            }
            
            
            int maxDias = 31;
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
            } else if (mes == 2) {
                if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
            }
            
            if (dia < 1 || dia > maxDias) {
                return false;
            }

            return true;
            
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
}

