import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
           Scanner input = new Scanner(System.in);

        System.out.println("Hipermercado Tabajara - Promoção de Carnes");
        System.out.println("Escolha o tipo de carne:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Opção: ");
        int tipoCarne = input.nextInt();

        System.out.print("Digite a quantidade em Kg: ");
        double quantidade = input.nextDouble();

        System.out.print("Pagamento com cartão Tabajara? (S/N): ");
        String respostaCartao = input.next();

        double precoKg = 0;
        if (tipoCarne == 1) {
            precoKg = quantidade <= 5 ? 4.90 : 5.80;
        } else if (tipoCarne == 2) {
            precoKg = quantidade <= 5 ? 5.90 : 6.80;
        } else if (tipoCarne == 3) {
            precoKg = quantidade <= 5 ? 6.90 : 7.80;
        } else {
            System.out.println("Opção inválida.");
            input.close();
            return;
        }

        double precoTotal = precoKg * quantidade;

        double desconto = 0;
        if (respostaCartao.equalsIgnoreCase("S")) {
            desconto = precoTotal * 0.05;
        }

        double valorFinal = precoTotal - desconto;

        System.out.println("\nCupom Fiscal");
        System.out.println("Tipo de carne: " + obterDescricaoCarne(tipoCarne));
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preço total: R$ " + precoTotal);
        System.out.println("Tipo de pagamento: " + (respostaCartao.equalsIgnoreCase("S") ? "Cartão Tabajara" : "Outro"));
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor a pagar: R$ " + valorFinal);

        input.close();
    }

    public static String obterDescricaoCarne(int tipoCarne) {
        switch (tipoCarne) {
            case 1:
                return "File Duplo";
            case 2:
                return "Alcatra";
            case 3:
                return "Picanha";
            default:
                return "Desconhecido";
        }
    }
}
