import java.util.Scanner;
/*
Um comerciante comprou um produto e quer vendê-lo com lucros diferentes dependendo do valor da compra. Ele quer um lucro de 45% se o valor da compra for menor que R$ 20,00, 35% se o preço for de até 50 reais e lucro de 25% se valor for maior. Entrar com o valor do produto e imprimir na tela o valor de venda.
*/


class exercicio7 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    //Programe a partir daqui
    float desconto1, desconto2, desconto3, preco;

    System.out.print("Digite o valor do produto: ");
    preco = entrada.nextFloat();

    if (preco < 20){
      desconto1 = preco * 1.45f;
      System.out.print("O valor final do produto é de " + desconto1);
    }
    else if (preco > 50){
      desconto2 = preco * 1.25f;
      System.out.print("O valor final do produto é de " + desconto2);
    }
    else{
      desconto3 = preco * 1.35f;
      System.out.print("O valor final do produto é de " + desconto3);
    }
    //Programe até aqui.
    entrada.close();
  }
}