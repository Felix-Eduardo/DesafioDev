import java.util.Scanner;
/*
Escreva um algoritmo para ler dois números diferentes e escrever o maior deles. 
*/


class exercicio4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
    float numero1, numero2;

    System.out.print("Digite o primeiro número: ");
    numero1 = entrada.nextFloat();
    
    System.out.print("Digite o segundo número: ");
    numero2 = entrada.nextFloat();

    if (numero1 == numero2){
      System.out.print("Os números são iguais.");
      }
    else if (numero1 > numero2){
      System.out.print("O primeiro número é maior.");
      }
    else{
      System.out.print("O segundo número é maior");
      }
    //Programe até aqui.
    entrada.close();
  }
}