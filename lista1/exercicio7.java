import java.util.Scanner;

class exercicio7 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double minutos, segundos;
    
    System.out.print("Insira quantos minutos você quer converter para segundos: ");
    minutos = entrada.nextDouble();

    segundos = minutos * 60;
    System.out.print("Isso é igual a " + segundos + " segundos");

    entrada.close();
  }
}