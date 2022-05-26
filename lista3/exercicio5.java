import java.util.Scanner;
/*
Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano.
*/


class exercicio5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
    float anoNascimento, anoAtual, idade;

    System.out.print("Digite o ano que você nasceu: ");
    anoNascimento = entrada.nextFloat();

    System.out.print("Digite o ano atual: ");
    anoAtual = entrada.nextFloat();

    idade = anoAtual - anoNascimento;

    if (idade >= 16){
      System.out.print("Você pode votar");
      }
    else{
      System.out.print("Você não pode votar");
      }
    //Programe até aqui.
    entrada.close();
  }
}
