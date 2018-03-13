public class Solve {

    int numberOfInputs;
    int k;

    public Solve(int array[], int numberOfInputs, int k){
        this.numberOfInputs = numberOfInputs;
        this.k = k;
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

}
