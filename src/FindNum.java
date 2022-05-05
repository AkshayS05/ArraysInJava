import java.util.Scanner;

public class FindNum {
    public static int findNumber(int arr[], int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= s.nextInt();
        int arr[]= new int [size];

        for(int i=0; i<size; i++){
            arr[i]= s.nextInt();
        }
        System.out.println("Enter the number to find");
        int number= s.nextInt();
//        for (int i = 0; i <size ; i++) {
//            System.out.print(arr[i]+ " ");
//        }
       int ans= findNumber(arr,number);
        System.out.println(ans);
    }
}
