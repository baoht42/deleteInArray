import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int[] array = {10,4,6,7,8,6,0,0,0,0};
        System.out.println("Enter X to delete: ");
        int x = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i]== x){
                for (int j = i; j < array.length-1 ; j++) {
                    array[j]= array[j+1];
                }
            }
        }
        System.out.println("New array is: "+ Arrays.toString(array));
    }
}