import java.util.Scanner;

public class FindUnique {
    public static int getUnique(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        for (int i = 0; i <arr.length ; i++) {
            int j;
            for (j = 0; j <arr.length ; j++) {

                if(i!=j&&arr[i]==arr[j]){
                    break;
                }
            }
            if(j==arr.length){
                return arr[i];
                }
        }
        return Integer.MIN_VALUE;
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
        System.out.println(getUnique(arr));

    }

}
