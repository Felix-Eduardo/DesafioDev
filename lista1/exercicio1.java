import java.util.Scanner;

class exercicio1{
  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
    float largura, altura, area;
    
    System.out.print("Informe o lado: ");
    largura = entrada.nextFloat();
    
    System.out.print("Informe a altura: ");
    altura = entrada.nextFloat();

    area = largura * altura;
    
    System.out.print("a área é " + area + "m²" );

    entrada.close();
  }
}