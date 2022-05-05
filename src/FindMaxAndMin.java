import java.util.Scanner;

public class FindMaxAndMin {

    public static void maxAndMind(int[] arr) {
        int largest= Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest){
                largest= arr[i];
            }
            if(arr[i]<smallest){
                smallest= arr[i];
            }
        }
        System.out.print("Largest element is "+ largest+" ");
        System.out.print("& Smallest element is "+ smallest);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= s.nextInt();
        int arr[]= new int [size];
        System.out.println("Input the elements");
        for(int i=0;i<size; i++){
            arr[i]= s.nextInt();
        }
        maxAndMind(arr);
    }

}
