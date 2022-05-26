import java.util.Scanner;
/*
Criar um programa para calcular o valor da multa a ser paga de anuidade de uma associação. A anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de juros (com juros sobre juros). Por exemplo, uma associação de R$ 100 paga em janeiro, custa R$ 100; em fevereiro, custa R$ 105; em março, custa R$ 110.25; e, em dezembro, R$171.03.
*/

/*class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
	  float multa, juros, vfinal;
    int mes;
    System.out.print("Insira o valor da multa: ");
    multa = entrada.nextFloat();
    System.out.print("Insira o juros da multa em decimal: ");
    juros = entrada.nextFloat();
    System.out.print("Insira o mês que ocorreu a multa(1-12): ");
    mes = entrada.nextInt();

    vfinal = multa * (float)(Math.pow((1 + juros), (12-mes)));
    System.out.print(+ vfinal);
	
    //Programe até aqui.
    entrada.close();
  }
}
*/

class exercicio2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    float mes, juros, vfinal, mensalidade;
    System.out.print("Em qual mês a multa vai ser paga (1-12): ");
    mes = entrada.nextFloat();
    System.out.print("Qual o valor da mensalidade: ");
    mensalidade = entrada.nextFloat();
    System.out.print("Qual a taxa de juros; em decimal: ");
    juros = entrada.nextFloat();

  vfinal = mensalidade * (float)(Math.pow((1 + juros), (mes-1)));
    System.out.print(+ vfinal);
    //Programe até aqui.
    entrada.close();
  }
}