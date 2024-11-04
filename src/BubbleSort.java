import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < integerArray.length; i++) {
            int count = 0;
            for (int j = 0;j<integerArray.length-i-1;j++){
                if(integerArray[j]>integerArray[j+1]){
                    int temp = integerArray[j];
                    integerArray[j] = integerArray[j+1];
                    integerArray[j+1] = temp;
                    count++;
                }
            }
            if(count == 0){
                break;
            }
        }
        System.out.println(Arrays.toString(integerArray));
    }
}
