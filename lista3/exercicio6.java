import java.util.Scanner;
/*
Maçãs custam R$ 0,50 cada se forem compradas menos do que uma dúzia, e R$ 0,45 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.

*/


class exercicio6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui

    float macas, precoBaixo, precoAlto;

    System.out.print("Quantas maças foram compradas: ");
    macas = entrada.nextFloat();

    if (macas < 12){
      precoAlto = macas*0.5f;
      System.out.print("O valor das maças é de " + precoAlto);
    }
    else{
      precoBaixo = macas*0.45f;
      System.out.print("O valor das maças é de " + precoBaixo);
    }
    

    //Programe até aqui.
    entrada.close();
  }
}