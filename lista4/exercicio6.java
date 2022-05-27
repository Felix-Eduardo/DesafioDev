/*
Em uma pesquisa de campo, uma editora solicitou os seguintes dados para os entrevistados: sexo, idade e quantidade de livros que leu no ano de 2021. Faça um programa que leia os dados digitados pelo usuário, sendo que deverão ser solicitados dados até que a idade digitada seja zero.
Depois, calcule e imprima:

a) A quantidade total de livros lidos pelos entrevistados menores de 15 anos.
b) A quantidade de mulheres que leram 5 livros ou mais.
c) A média de idade dos homens que leram menos que 5 livros.
d) O percentual de pessoas que não leram livros.
*/

import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    char sexo;
    int idade = 0, livros = 0, somaHomem = 0, somaIdade = 0, menor = 0, qtdMulheres = 0, sumLivros = 0, a = 0, livroLido;
    float mediaH = 0, media = 0;

      while (idade != 0){

        System.out.print("Informe a idade: ");
        idade = entrada.nextInt();
        if(idade == 0){
          idade = 0;
        } else{

        System.out.print("Informe seu sexo ('m' ou 'f'): ");
        sexo = entrada.next().charAt(0);

        System.out.print("Informe a quantidade de livros lidos: ");
        livros = entrada.nextInt();

    

      if (idade < 15) {
        a += livroLido;
      }


      if (sexo == 'f' && livros >= 5) {
        qtdMulheres++;
      }


      if (sexo == 'm' && livros < 5) {
        somaHomem++;
        somaIdade = somaIdade + idade;
        mediaH = somaIdade / somaHomem;
      }


      if (livros > 0) {
        sumLivros = (sumLivros + livros);
        media = sumLivros / 100;
      }


    }

    /* a */ System.out.println("a) Os livros lidos por menores de 15 é igual a " + menor + ".");
    /* b */ System.out.println("b) A quantidade de mulheres que leram 5 livros ou mais é " + qtdMulheres + ".");
    /* c */ System.out.println("c) A média de idade dos homens que leram menos que 5 livros é " + mediaH + ".");
    /* d */ System.out.println("d) O percentual de pessoas que não leram livros é " + media + "%.");

    entrada.close();
    }
  }
}