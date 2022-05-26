import java.util.Scanner;

class exercicio3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
    float n1, n2, n3, media;

    System.out.print("Digite a primeira nota: ");
    n1 = entrada.nextFloat();
    System.out.print("Digite a segunda nota: ");
    n2 = entrada.nextFloat();
    System.out.print("Digite a terceira nota: ");
    n3 = entrada.nextFloat();

    media = (((n1 * 2) + (n2 * 3) + (n3 * 5))/10);
    System.out.print("A média final é " + media);

    entrada.close();
  }
}