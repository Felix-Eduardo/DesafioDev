import java.util.Scanner;
/*
Faça um conversor de câmbio de reais/dólar/euro. 

O usuário deve informar inicialmente a cotação de cada moeda em relação ao real. Depois apresente o seguinte menu:

pegar as relações entre as moedas

Conversor de moedas:
a) Converter de Real para Euro
b) Converter de Real para Dólar
c) Converter de Euro para Dólar
d) Converter de Euro para Real
e) Converter de Dólar para Euro
f) Converter de Dólar para Real

Informe qual conversão você deseja fazer: 
Qual o valor a ser convertido (Euro->Dólar):

Valor em Dólar: US$ xxxxx

Leia o valor a ser convertido na moeda de origem e imprima na tela a quantidade na moeda destino.
*/


class exercicio1 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
	float dolar, euro, quantia, valorFinal;
    char escolha;

    System.out.print("Qual a cotação atual do dolár? ");
    dolar = entrada.nextFloat();
    System.out.print("Qual a cotação do euro");
    euro = entrada.nextFloat();
    System.out.println("Escolha uma operação: ");
    System.out.println("a) Converter de Real para Euro ");
    System.out.println("b) Converter de Real para Dólar ");
    System.out.println("c) Converter de Euro para Dólar ");
    System.out.println("d) Converter de Euro para Real ");
    System.out.println("e) Converter de Dólar para Euro ");
    System.out.println("f) Converter de Dólar para Real ");
    System.out.println("Escolha uma dessas opçoes: ");
    escolha = entrada.next().charAt(0);
    System.out.print("Fale a quantia a ser convertida: ");
    quantia = entrada.nextFloat();
    
    switch(escolha){
      case 'a': valorFinal = (quantia / euro);
            System.out.print("Você converteu " + quantia + " Reais em " + valorFinal + " Euros.");
            break;
      case 'b': valorFinal = (quantia / dolar);
          System.out.print("Você converteu " + quantia + " Reais em " + valorFinal + " Dólares.");
            break;
      case 'c': valorFinal = ((quantia / dolar) * euro);
          System.out.print("Você converteu " + quantia + " Euros em " + valorFinal + " Dólares.");
            break;
      case 'd': valorFinal = (quantia * euro);
          System.out.print("Você converteu " + quantia + " Euros em " + valorFinal + " Reais.");
            break;
      case 'e': valorFinal = ((quantia / euro) * dolar);
          System.out.print("Você converteu " + quantia + " Dólares em " + valorFinal + " Euros.");
             break;
      case 'f': valorFinal = (quantia * dolar);
           System.out.print("Você converteu " + quantia + " Dólares em " + valorFinal + " Reais.");
             break;
      }
          //Programe até aqui.
    entrada.close();
    }
}