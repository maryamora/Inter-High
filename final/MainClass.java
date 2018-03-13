import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
    int question = 0;
    int fibNum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Question #: ");
        question = sc.nextInt();

        Solve solver = new Solve();

        switch(question){
            case 1:
                System.out.println("Fibonnaci Problem");
                System.out.print("Enter number: ");
                fibNum = sc.nextInt();
                solver.solveOne(fibNum);
                break;

            case 2:
                System.out.println("Rotation Problem");
                solver.solveTwo();
                break;

            case 3:
                System.out.println("Closest Number Problem");
                solver.solveThree();
                break;

            case 4:
                //Magic Square
                break;

            case 5:
                System.out.println("Dancing Lessons");
                solver.solveFive();

        }

    }
}
