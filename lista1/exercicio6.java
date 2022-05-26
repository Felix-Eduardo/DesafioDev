import java.util.Scanner;

class exercicio6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    Double alturaCm, alturaM;
    
    System.out.print("Qual sua altura em centímetros?: ");
    alturaCm = entrada.nextDouble();

    alturaM = alturaCm/100;

    System.out.print("Sua altura em metros é igual a " + alturaM + "m");


    entrada.close();
  }
}

