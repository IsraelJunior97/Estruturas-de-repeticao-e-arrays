package arrays;

import java.util.Random;
import java.util.Scanner;

public class numerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random();

        Scanner scan = new Scanner(System.in);

        int[] numerosAletorios = new int[20];

        for(int i = 0; i < numerosAletorios.length;i++){
            int numero = random.nextInt(100);

            numerosAletorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for ( int numero : numerosAletorios ) {
            System.out.print(numero+ " ");
        }

        System.out.print("Sucessores dos Numeros Aleatorios: ");
        for ( int numero : numerosAletorios ) {
            System.out.print((numero+1) + " ");
        }

        System.out.print("Antecessores dos Numeros Aleatorios: ");
        for ( int numero : numerosAletorios ) {
            System.out.print((numero-1) + " ");
        }
    }
}
