package condicional;

/*ALGORITMO
Objetivo: Fazer um programa que recebe o número de um Mês e exibir o número de dias correspondentes a este mês
INICIO
declare mes - inteiro

escreva Qual numero do mês que você deseja saber os dias?
leia mes
se mes = 01 ou 1
então INICIO
escreva O mês escolhido é Janeiro. Há 31 dias neste mês.
FIM
se mes = 02 ou 2
então INICIO
escreva O mês escolhido é Fevereiro. Há 28 dias neste mês.
FIM
se mes = 03 ou 3
então INICIO
escreva O mês escolhido é Março. Há 31 dias neste mês.
FIM
se mes = 04 ou 4
então INICIO
escreva O mês escolhido é Abril. Há 30 dias neste mês.
FIM
se mes = 05 ou 5
então INICIO
escreva O mês escolhido é Maio. Há 31 dias neste mês.
FIM
se mes = 06 ou 6
então INICIO
escreva O mês escolhido é Junho. Há 30 dias neste mês.
FIM
se mes = 07 ou 7
então INICIO
escreva O mês escolhido é Julho. Há 31 dias neste mês.
FIM
se mes = 08 ou 8
então INICIO
escreva O mês escolhido é Agosto. Há 31 dias neste mês.
FIM
se mes = 09 ou 9
então INICIO
escreva O mês escolhido é Setembro. Há 30 dias neste mês.
FIM
se mes = 10
então INICIO
escreva O mês escolhido é Outubro. Há 31 dias neste mês.
FIM
se mes = 11
então INICIO
escreva O mês escolhido é Novembro. Há 30 dias neste mês.
FIM
se mes = 12
então INICIO
escreva O mês escolhido é Dezembro. Há 31 dias neste mês.
FIM
FIM_ALGORITMO*/
import java.util.Scanner;

class teste {
    public static void main(String args[]) {
        int mes;
        Scanner dado;
        System.out.print("\nDigite o número de um mês:  ");
        dado = new Scanner(System.in);
        mes = dado.nextInt();
        switch (mes) {
        case 1:
            System.out.println("\nO mês escolhido é Janeiro. Há 31 dias neste mês.");
            break;
        case 2:
            System.out.println("\nO mês escolhido é Fevereiro. Há 28 dias neste mês.");
            break;
        case 3:
            System.out.println("\nO mês escolhido é Março. Há 31 dias neste mês.");
            break;
        case 4:
            System.out.println("\nO mês escolhido é Abril. Há 30 dias neste mês.");
            break;
        case 5:
            System.out.println("\nO mês escolhido é Maio. Há 31 dias neste mês.");
            break;
        case 6:
            System.out.println("\nO mês escolhido é Junho. Há 30 dias neste mês.");
            break;
        case 7:
            System.out.println("\nO mês escolhido é Julho. Há 31 dias neste mês.");
            break;
        case 8:
            System.out.println("\nO mês escolhido é Agosto. Há 31 dias neste mês.");
            break;
        case 9:
            System.out.println("\nO mês escolhido é Setembro. Há 30 dias neste mês.");
            break;
        case 10:
            System.out.println("\nO mês escolhido é Outubro. Há 31 dias neste mês.");
            break;
        case 11:
            System.out.println("\nO mês escolhido é Novembro. Há 30 dias neste mês.");
            break;
        case 12:
            System.out.println("\nO mês escolhido é Dezembro. Há 31 dias neste mês.");
            break;
        default:
            System.out.println("\nNão existe mês com este número.");
        }
    }

    public teste() {
    }
}
