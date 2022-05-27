/*
Escrever um programa que calcule todos os números divisíveis por certo valor indicado pelo usuário (o resto da divisão por este número deve ser igual a zero), compreendidos em um intervalo também especificado pelo usuário. O usuário deve entrar com um primeiro valor correspondente ao divisor e após ele vai fornecer o valor inicial do intervalo, seguido do valor final deste intervalo.
Exemplo de tela de saída:
Entre com o valor do divisor: 3
Início do intervalo: 17
Final do intervalo: 29
Números divisíveis por 3 no intervalo de 17 a 29:
18 21 24 27
*/
import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

  int divisor, valorInicial, valorFinal;
  
  System.out.print("Informe o divisor: ");
    divisor = entrada.nextInt();
  System.out.print("Informe o número inicial: ");
    valorInicial = entrada.nextInt();
  System.out.print("Informe o número final: ");
    valorFinal = entrada.nextInt();
    
    System.out.println("Os números divisiveis por "+divisor+" no intervalo de "+valorInicial+" e "+valorFinal+" são: ");
    for(int n = valorInicial; n <= valorFinal; n++){
      if(n % divisor == 0){
      System.out.print(n+" ");
        }

     
    
 entrada.close();
      }
  }
  
}