import java.util.Scanner;

class exercicio1 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
   
    float originalPrice, mediumPrice, endPrice;
    
    System.out.print("Qual o preço original? ");
    originalPrice = entrada.nextFloat();
    
    mediumPrice = originalPrice * 0.65f;
    endPrice = mediumPrice * 1.5f;

    System.out.print("O preço intermediario é " + mediumPrice + " e o preço final é " + endPrice);
    
      
    entrada.close();
  }
}