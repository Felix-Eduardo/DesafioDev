import java.util.Scanner;
/*
  Crie uma calculadora que faça as seguintes operações: soma(+), subtração(-), multiplicação(*), divisão(/) e potenciação (^).
O programa deve requisitar a operação matemática da seguinte forma
Informe o cálculo a ser realizado: X OP Y
O resultado é ZZZZZZ
Por exemplo, 
Informe o cálculo a ser realizado: 3 - 4
O resultado é -1

Informe o cálculo a ser realizado: 5 ^ 2
O resultado é 25
*/

class exercicio4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui

    float n1, n2, resultado;
    String operacao;

    System.out.print("Insira o cálculo:");
    n1 = entrada.nextFloat();
    operacao = entrada.next();
    n2 = entrada.nextFloat();

    switch(operacao){
      case "+": resultado = n1 + n2;
          System.out.print("O resultado é " + resultado);
          break;
      case "-": resultado = n1 - n2;
        System.out.print("O resultado é " + resultado);
        break;
      case "x":
      case "*":
      case "X": resultado = n1 * n2;
        System.out.print("O resultado é " + resultado);
          break;
      case "÷":
      case "/": resultado = n1/n2;
        System.out.print("O resultado é " + resultado);
          break;
      case "^": resultado = (float)Math.pow(n1,n2);
        System.out.print("O resultado é " + resultado);
          break;
    }
	  //Programe até aqui.
    entrada.close();
  }
}
