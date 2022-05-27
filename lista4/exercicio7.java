/*
Faça um programa gere a letra da música: “1 elefante incomoda muita gente, 2 elefantes incomodam, incomodam muito mais, 3 elefantes incomodam muita gente, 4 elefantes incomodam, incomodam, incomodam, incomodam muito mais...”, com o número de final de elefantes fornecido pelo usuário. 
*/

import java.util.Scanner;

public class exercicio7 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

  int elefantes, qtd;
    
  System.out.print("Digite o número de elefantes: ");
    elefantes = entrada.nextInt();
    for(int n = 1; n <= elefantes; n++){
        qtd=n;
        if(n %2 == 1){
            System.out.print(n + " elefantes incomodam muita gente, ");
    }else{
        System.out.print(n);
        while(qtd >= 0)
        if(qtd == 0){
            System.out.print(" incomodam muito mais, ");
            qtd = qtd - 1;
        }else{
            System.out.print(" incomodam,");
                qtd = qtd -1;
        }
     }
      
    }
    entrada.close();
  }
}


