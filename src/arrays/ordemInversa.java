package arrays;

public class ordemInversa {
    public static void main(String[] args) {

        int[] vetor = {0,-5,15,50,8,4};

        //System.out.println(vetor.length);

        int count = 0;
        System.out.print("Vetor: ");

        while (count <= (vetor.length-1)){
            System.out.println(vetor[count]);
            count++;
        }

        System.out.print("Vetor: ");
        for(int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor[i]+" ");
        }
    }


}
