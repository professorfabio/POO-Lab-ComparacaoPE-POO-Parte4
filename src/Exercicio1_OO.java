import java.util.Scanner;

public class Exercicio1_OO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* cria objeto para leitura */
        int numi = 0, numf = 0;
        System.out.println("Entre o primeiro número:");
        numi = sc.nextInt();
        System.out.println("Entre o segundo número:");
        numf = sc.nextInt();
        Intervalo num = new Intervalo(numi,numf);

        System.out.println("Soma : " + num.soma() + " Média : " + num.media() + " 		Qtde Pares : " + num.qtdePares() + " Qtde Ímpares : " + num.qtdeImpares());
    }

}