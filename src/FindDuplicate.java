import java.util.Scanner;

public class FindDuplicate {
    public static int getDuplicate(int[] arr) {
        int ans=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(i!=j &&arr[i]==arr[j]){
                    ans= arr[i];
                    return ans;
                }
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
        System.out.println(getDuplicate(arr));
    }


}
