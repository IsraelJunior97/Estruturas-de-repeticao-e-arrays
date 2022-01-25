package loops;

import java.util.Scanner;

public class maiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        float media;

        float soma = 0;

        int maior = 0;

        int count = 0;

        do{
        System.out.println("Digite um numero: ");
        numero = scan.nextInt();

        soma = soma+numero;

        if(numero > maior) maior = numero;

        count++;

        }while(count < 5);

        media = soma/5;
        System.out.println("Maior : "+ maior);
        System.out.println("Media: "+media);
    }
}
