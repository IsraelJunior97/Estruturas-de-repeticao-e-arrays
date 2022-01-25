package exercicios;
import java.io.IOException;


import java.util.Scanner;

public class main {

    	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if ((  C % 2 ==1   )&& L % 2    ==0)
            System.out.println(" 0 ");
        else                                               //complete o código nos espaços em branco
            System.out.println(" 1 ");
        sc.close();
    }
}
