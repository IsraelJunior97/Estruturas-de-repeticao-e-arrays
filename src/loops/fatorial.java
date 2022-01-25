package loops;

import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial de: ");
        int fatorial= scan.nextInt();

        int multiplicacao = 1;

        for(int i= fatorial; i >= 1;i--){

            multiplicacao = multiplicacao*i;
        }

        System.out.println("Fatorial != " +multiplicacao);
    }
}
