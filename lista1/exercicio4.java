import java.util.Scanner;

class exercicio4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    double nota1, nota2, nota3, nota4, mediaFinal;

    System.out.print("Qual sua nota no primeiro bimestre: ");
    nota1 = entrada.nextDouble();
    
    System.out.print("Qual sua nota no segundo bimestre: ");
    nota2 = entrada.nextDouble();
    
    System.out.print("Qual sua nota no terceiro bimestre: ");
    nota3 = entrada.nextDouble();
    
    System.out.print("Qual sua nota no quarto bimestre: ");
    nota4 = entrada.nextDouble();

    mediaFinal = (((nota1 * 1) + (nota2 * 2) + (nota3 * 3) + (nota4 * 4))/10);
    System.out.print("A média final é " + mediaFinal);
    
    entrada.close();
  }
}
