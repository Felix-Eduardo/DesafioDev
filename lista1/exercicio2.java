import java.util.Scanner;

class exercicio2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    float horseNumb, ferraduras;

    System.out.print("Insira o número de cavalos: ");
    horseNumb = entrada.nextInt();

    ferraduras = horseNumb * 4;
    System.out.print("O número de ferraduras é " + ferraduras);
    
    entrada.close();
  }
}