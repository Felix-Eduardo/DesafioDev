import java.util.Scanner;

class exercico3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
    double broas, pauFrances, total;

    System.out.print("Insira o número de pães franceses comprados: ");
    pauFrances = entrada.nextDouble();

    System.out.print("Insira o número de broas compradas: ");
    broas = entrada.nextDouble();

    total = ((broas * 2) + (pauFrances * 0.5));

    System.out.print("O total da compra é de:" + total + " reais");

    
    entrada.close();
  }
}
