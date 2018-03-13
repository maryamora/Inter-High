import java.util.Scanner;

public class Solve {


    public Solve(){
        //nothing
    }

    public void solveOne(int k){
        //create fibonacci sequence and check if the number is k
        int a = 0;
        int b = 1;
        int sum = 0;
        int flag = 0;
        if (k == a || k == b){
            System.out.println("TRUE");
            flag =1;
        }else{

            while (sum <= k){
                sum = a + b;
                a = b;
                b = sum;
                if (sum == k){
                    System.out.println("TRUE");
                    flag = 1;
                    break;
                }
            }

        }
        if (flag == 0){
            System.out.println("FALSE");
        }
    }

    public void solveTwo(){
        String yes = "";
        int numberOfInputs = 0;
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

        int temp = 0, temp2 = 0;
        for (int i = 0; i < k; i++){
            for (int j = 0; j < numberOfInputs; j++){
                if (j == 0){
                    temp = array[j];
                    array[j] = array[numberOfInputs-1];
                }else{
                    temp2 = array[j];
                    array[j] = temp;
                    temp = temp2;
                }
            }
        }

        System.out.print("Elements: ");
        for (int i = 0; i < numberOfInputs; i++){
            System.out.print(array[i]+", ");

        }


    }

    public void solveThree(){
        int a = 0, b = 0, x = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter x: ");
        x = sc.nextInt();

        int checkThisMinus = 0, checkThisPlus = 0;
        checkThisMinus = (int) Math.pow((double)a,(double)b);
        checkThisPlus = checkThisMinus;
        while (true){
            if (checkThisMinus % x == 0){
                System.out.println(checkThisMinus);
                break;
            }else if (checkThisPlus % x == 0){
                System.out.println(checkThisPlus);
            }
            checkThisMinus--;
            checkThisPlus++;
        }

    }

    public void solveFive(){
        //dance class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = sc.nextInt();
        int pattern = 1;
        boolean present = false;
        int numberOfStudents = 0;

        for (int i = 0; i < day; i++, pattern++){
            for (int j = 0, counter = 1; j < day; j++, counter++){
                if (counter == pattern){
                    if (present == false){
                        present = true;
                    }else{
                        present = false;
                    }
                    counter = 0;
                }
            }
            if (present){
                System.out.println("DAY "+i+": TRUE");
                numberOfStudents++;
            }else{
                System.out.println("DAY "+i+": FALSE");
            }
            present = false;
        }

        System.out.println("Number of Students: "+numberOfStudents);

        if (numberOfStudents % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }

}
