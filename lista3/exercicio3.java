import java.util.Scanner;
/*
Criar um algoritmo para ler dois números e verificar se eles são iguais.
*/


class exercicio3 {
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
    else{
      System.out.print("Os números são diferentes.");
      }
    //Programe até aqui.
    entrada.close();
  }
}