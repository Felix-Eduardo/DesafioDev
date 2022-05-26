import java.util.Scanner;

class exercicio2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    float horas, valorhora, imposto, salariobruto, desconto, salarioLiquido;

    System.out.print("Qual a quantidade de horas trabalhadas no mês? ");
    horas = entrada.nextFloat();

    System.out.print("Qual o valor da hora trabalhada? ");
    valorhora = entrada.nextFloat();

    System.out.print("Qual o percentual do imposto? ");
    imposto = entrada.nextFloat();

    salariobruto = horas * valorhora;
    desconto = salariobruto * (imposto/100.0f);
    salarioLiquido = salariobruto - desconto;

    System.out.print("O valor do salário bruto é " + salariobruto + ". O valor do desconto é " + desconto + ". O valor final do salário é " + salarioLiquido);

    entrada.close();
  }
}
