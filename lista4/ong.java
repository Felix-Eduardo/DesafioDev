/*
A ONG Roda Viva resolveu fazer um levantamento em cinco cidades que possuem os maiores índices de acidentes de trânsito. Para isso foram coletados a cidade, o mês do acidente, o número de pessoas feridas em cada acidente, a idade e o sexo do motorista.
Faça um programa que leia esses dados até que o mês informado seja igual a FIM. 
Ao terminar a execução do programa informe:
a) o número total de pessoas feridas nos acidentes
b) o mês com mais acidentes de trânsito
c) O percentual de motoristas de cada sexo envolvidos em acidentes
d) a cidade com menos acidentes
e) a idade do motorista mais jovem, do mais idoso e a média de idade dos motoristas envolvidos em acidentes.

Observação: utilizar apenas comandos de seleção e de repetição, SEM o uso de vetores.
*/
// Professor, cuidado ao enviar atividades tão tarde dos sábados, seria melhor se fossem enviadas na sexta.

import java.util.Scanner;

public class ong {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

  char sexo;
  String mes;
  int acidentes1 = 0, acidentes2 = 0, acidentes3 = 0, acidentes4 = 0, acidentes5 = 0, janeiro = 0, fevereiro = 0, marco = 0, abril = 0, maio = 0, junho = 0, julho = 0, agosto = 0, setembro = 0, outubro = 0, novembro = 0, dezembro =0;
  int cidade, feridos, idade, totalFeridos = 0, maiorMes = 0, menorCidade = 0, idoso = 0, novinho = 0;
  float percentualM = 0.0f, percentualF = 0.0f, acidentesM = 0.0f, acidentesF = 0.0f, totalAcidentes = 0.0f, idadeTotal = 0.0f, idadeMaior = 0.0f, idadeMenor = 0.0f, mediaIdade = 0.0f;
  Boolean condition = true;

    
    while (condition = true) {    
    System.out.print("Digite a cidade do acidente (1-5):");
        cidade = entrada.nextInt();
    System.out.print("Digite o mês do acidente: ");
        mes = entrada.next();
        if ("FIM".equals(mes)) {
            condition = false;
            break;
        }
    System.out.print("Digite o número de pessoas feridas: ");
        feridos = entrada.nextInt();

    System.out.print("Digite a idade do motorista: ");
        idade = entrada.nextInt();

    System.out.print("Digite o sexo do motorista: ");
        sexo = entrada.next().charAt(0);
    System.out.print("\033[H\033[2J");  
    System.out.flush();  

    totalFeridos = feridos + totalFeridos; // a) o número total de pessoas feridas nos acidentes
    totalAcidentes = totalAcidentes + 1;
    
    switch(mes){
        case "janeiro":
            janeiro = janeiro + 1;
            break;
        case "fevereiro":
            fevereiro = fevereiro + 1;
            break;
        case "março":
            marco = marco + 1;
            break;
        case "abril":
            abril = abril + 1;
            break;
        case "maio":
            maio = maio + 1;
            break;
        case "junho":
            junho = junho + 1;
            break;
        case "julho":
            julho = julho + 1;
            break;
        case "agosto":
            agosto = agosto + 1;
            break;
        case "setembro":
            setembro = setembro + 1;
            break;
        case "novembro":
            novembro = novembro + 1;
            break;
        case "dezembro":
            dezembro = dezembro + 1;
            break;

    }
    maiorMes = janeiro;
     if(maiorMes < fevereiro){
        maiorMes = fevereiro;
     } if(maiorMes < marco){
        maiorMes = marco;
     } if(maiorMes < abril){
        maiorMes = abril;
     } if(maiorMes < maio){
        maiorMes = maio;
     } if(maiorMes < junho){
        maiorMes = junho;
     } if(maiorMes < julho){
        maiorMes = julho;
     } if(maiorMes < agosto){
        maiorMes = agosto;
     } if(maiorMes < setembro){
        maiorMes = setembro;
     } if(maiorMes < novembro){
        maiorMes = novembro;
     } if(maiorMes < dezembro){
        maiorMes = dezembro;
     } // final questão b) o mês com mais acidentes de trânsito

    

    
     
    if(sexo == 'm'){
        acidentesM = acidentesM + 1;
    }else if(sexo == 'f'){
        acidentesF = acidentesF + 1;
    }
    percentualF = (acidentesF / totalAcidentes) * 100;
    percentualM = (acidentesM / totalAcidentes) * 100;
    // final questão c) O percentual de motoristas de cada sexo envolvidos em acidentes

    menorCidade = acidentes1;
    if(menorCidade > acidentes2){
        menorCidade = acidentes2;
    } if(menorCidade > acidentes3){
        menorCidade = acidentes3;
    } if(menorCidade > acidentes4){
        menorCidade = acidentes4;
    } if(menorCidade > acidentes5){
        menorCidade = acidentes5;
    } // final questão d) a cidade com menos acidentes
    
    if(novinho > idade){
        novinho = idade;
    } if(idoso < idade){
        idoso = idade;
    }
    idadeTotal = idadeTotal + idade;
    mediaIdade = idadeTotal/totalAcidentes;


    
    }
    
    System.out.print("O número total de pessoas feridas nos acidentes é: " + totalFeridos + "\n");

    
    if(maiorMes == janeiro){
        System.out.print("O mês com mais acidentes é janeiro.\n");
    } if(maiorMes == fevereiro){
        System.out.print("O mês com mais acidentes é fevereiro.\n");
    } if(maiorMes == marco){
        System.out.print("O mês com mais acidentes é março.\n");
    } if(maiorMes == abril){
        System.out.print("O mês com mais acidentes é abril.\n");
    } if(maiorMes == maio){
        System.out.print("o mês com mais acidentes é maio.\n");
    } if(maiorMes == junho){
        System.out.print("O mês com mais acidentes é junho.\n");
    } if(maiorMes == julho){
        System.out.print("O mês com mais acidentes é julho.\n");
    } if(maiorMes == agosto){
        System.out.print("O mês com mais acidentes é agosto.\n");
    } if(maiorMes == setembro){
        System.out.print("O mês com mais acidentes é setembro.\n");
    } if(maiorMes == novembro){
        System.out.print("O mês com mais acidentes é novembro.\n");
    } if(maiorMes == dezembro){
        System.out.print("O mês com mais acidentes é dezembro.\n");
    } // final questão b) o mês com mais acidentes de trânsito  

    System.out.print("O percentual de motoristas de cada sexo envolvidos em acidentes é: " + percentualM + "% do total de acidentes e " + percentualF + "% do total de acidentes\n");
    if(menorCidade == acidentes1){
        System.out.println("A cidade com menos acidentes é a de 1");
    } else if(menorCidade == acidentes2){
        System.out.println("A cidade com menos acidentes é a de 2");
    } else if(menorCidade == acidentes3){
        System.out.println("A cidade com menos acidentes é a de 3");
    } else if(menorCidade == acidentes4){
        System.out.println("A cidade com menos acidentes é a de 4");
    } else if(menorCidade == acidentes5){
        System.out.println("A cidade com menos acidentes é a de 5");
    } // final questão d) a cidade com menos acidentes
    System.out.print("O motorista mais novo tem " + novinho + " anos e o mais velho tem " + idoso + " anos\n");
    System.out.print("A média de idade dos motoristas é " + mediaIdade + "\n");
    
    
    
  entrada.close();
  }
}