import java.util.Scanner;
/*
Faça um programa que leia os nomes de dois times de futebol.
Após ler os nomes, peça o número de gols que cada um time fez durante a partida. Ao final do programa informe o resultado da seguinte forma:
O TIMEXXX ganhou por X a Y do TIMEYYY.
Se for empate:
TIMEXXX e TIMEYYY empataram com X gols cada.

*/


class exercicio3 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    
    //Programe a partir daqui

  String time1, time2;
  int gols1, gols2;
    
	System.out.print("Qual o nome do time 1: ");
  time1 = entrada.next();
  System.out.print("Qual o nome do time 2: ");
  time2 = entrada.next();
  System.out.print("Quantos gols o time 1 fez? ");
  gols1 = entrada.nextInt();
  System.out.print("Quantos gols o time 2 fez? ");
  gols2 = entrada.nextInt();
  
  if(gols1>gols2){
    System.out.print("O " + time1 + " ganhou por " + gols1 + " a " + gols2 + " do " + time2);
  }else if(gols1 == gols2){
    System.out.print(time1 + " e " + time2 + " empataram com " + gols1 + " gols cada");
  }else{
    System.out.print("O " + time2 + " ganhou por " + gols2 + " a " + gols1 + " do " + time1);
  }
    
    //Programe até aqui.
    entrada.close();
  }
}