import java.util.Scanner;

public class exercicio8 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int linhas, contador;
    char caractere;

    System.out.print("Digite o número de linhas: ");
    linhas = entrada.nextInt();

    System.out.print("Digite o caractere: ");
    caractere = entrada.next().charAt(0);

    for(int n = 0; n < linhas; n++ ){
        contador = n;
        while(contador >= 0){
            System.out.print(caractere);
                contador = contador - 1;
        }
        System.out.println();
    }

    entrada.close();
  }
}