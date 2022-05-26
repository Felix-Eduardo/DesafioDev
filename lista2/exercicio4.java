import java.util.Scanner;

class exercicio4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
    float entradaH, saidaH, saidaM, valor, entradaM, totalH, totalM;

    System.out.print("Qual o horário de entrada?");
    entradaH = entrada.nextInt();
    entradaM = entrada.nextInt();

    System.out.print("Qual o horário de saída?");
    saidaH = entrada.nextInt();
    saidaM = entrada.nextInt();
    
    totalH = (saidaH - entradaH);
    totalM = saidaM - entradaM + (totalH * 60);
    valor = totalM * 0.1f;

    System.out.println("O valor do estacionamento é " + valor + " reais");

    entrada.close();
  }
}