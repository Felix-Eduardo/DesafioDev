import java.util.Scanner;

class exercicio9 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        float valorTotal, idade;
        int contador;
        System.out.print("Digite a quantidade de dependentes: ");
        contador = entrada.nextInt();
        valorTotal = 300;

        for (int x = 1; x <= contador; x ++){
            System.out.print("Digite a idade do dependente " + x + ": ");
            idade = entrada.nextFloat();

            if(idade <= 10){
                valorTotal += 100;
                System.out.println(valorTotal);
            } else if(idade > 10 && idade <= 30){
                valorTotal += 220;
            } else if(idade > 31 && idade <= 60){
                valorTotal += 395;
            } else if(idade > 60){
                valorTotal += 480;
            }
        }

            System.out.println("O valor total eh de : " + valorTotal);


    
    entrada.close();
  }
}