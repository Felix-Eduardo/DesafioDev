import java.util.Scanner;

class exercicio9 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double camisetas, calcas, cintos, precoFinal, desconto, precoDesconto;
   
    System.out.print("Quantas camisetas foram compradas? ");
    camisetas = entrada.nextDouble();

    System.out.print("Quantas calças foram compradas? ");
    calcas = entrada.nextDouble();

    System.out.print("Quantos cintos foram comprados? ");
    cintos = entrada.nextDouble();

    precoFinal = (camisetas * 25) + (calcas * 100) + (cintos * 40);
    System.out.println("O valor total da compra sem desconto é de " + precoFinal + " reais");

    desconto = (((camisetas * 25) + (calcas * 100) + (cintos * 40)) * 0.1);
    System.out.println("O valor total do desconto é de " + desconto + " reais");

    precoDesconto = (((camisetas * 25) + (calcas * 100) + (cintos * 40)) * 0.9);
    System.out.println("O valor final da compra é de " + precoDesconto + " reais");

    entrada.close();
  }
}
