import java.util.Scanner;
/*
Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
- para homens: (72.7 * h) - 58;
- para mulheres: (62.1 * h) - 44.7.
*/

class exercicio8 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
    float altura, p1, p2;
    char sexo;

    System.out.print("Digite sua altura em metros: ");
    altura = entrada.nextFloat();

    System.out.print("Digite seu sexo(m/f):");
    sexo = entrada.next().charAt(0);

      if (sexo == 'm'){
      p1 = (altura * 72.7f) - 58;
      System.out.print("O seu peso ideal é " + p1);
    }
      else{
      p2 = (62.1f * altura) - 44.7f;
      System.out.print("O seu peso ideal é " + p2);
    }

    //Programe até aqui.
    entrada.close();
  }
}