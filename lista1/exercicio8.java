import java.util.Scanner;

class exercicio8 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
  
    double preco, precoFinal;

    System.out.print("Qual o preço do produto:");
    preco = entrada.nextDouble();

    precoFinal = preco * 0.85;
    System.out.print("O preço final do produto é " + precoFinal + "reais");
   
    entrada.close();
  }
}