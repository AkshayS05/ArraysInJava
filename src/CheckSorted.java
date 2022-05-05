import java.util.Scanner;

public class CheckSorted {
    public static boolean checkIfSorted(int[] arr) {
        boolean isAscending=true;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1]>arr[i]){
                isAscending= false;
            }
        }
        return isAscending;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Input the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(checkIfSorted(arr));
    }


}
