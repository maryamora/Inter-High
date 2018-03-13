import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        String yes;
        int numberOfInputs = 0;
        System.out.println("Write a function that rotates a list by k elements. For example [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2]. <Using arrays> \n" +
                "\tInput: \n" +
                "\t2 [1,2,3,4,5,6]\n" +
                "\tOutput:\n" +
                "\t[3,4,5,6,1,2]\n");

        System.out.println("Ready?");
        Scanner sc = new Scanner(System.in);
        yes = sc.next();
        if (yes.equalsIgnoreCase("yes")){
            System.out.println("How many inputs?");
            do{
                numberOfInputs = sc.nextInt();
            }while(numberOfInputs < 1);
        }
        int array[] = new int[numberOfInputs];

        for (int i = 0; i < numberOfInputs; i++){
            System.out.print("Enter element "+(i+1)+": ");
            array[i] = sc.nextInt();
            System.out.println();
        }

        System.out.print("Elements: ");
        for (int i = 0; i < numberOfInputs; i++){
            System.out.print(array[i]+", ");

        }

        System.out.println();
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Solve solver = new Solve(array, numberOfInputs,k);

    }

}
