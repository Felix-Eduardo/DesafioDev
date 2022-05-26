import java.util.Scanner;

class exercicio2 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
  
      float numero;
  
      System.out.print("Qual número deve ser verificado? ");
      numero = entrada.nextFloat();
  
      if(numero >= 50){
        System.out.print("O número digitado é maior ou igual a 50");
      }
      else{
        System.out.print("O número digitado não é maior ou igual a 50");
      }
  
     
      entrada.close();
    }
  }
