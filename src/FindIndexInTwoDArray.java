import java.util.Scanner;

public class FindIndexInTwoDArray {
    public static void findIndex(int[][] arr, int x) {
        int rows= arr.length;
        int cols= arr[0].length;
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if(arr[i][j]==x){
                    System.out.println("The index of your number is :"+ i +","+ j);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows= s.nextInt();
        System.out.println("Enter the number of columns");
        int cols= s.nextInt();

        int arr[][]= new int [rows][cols];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                arr[i][j]= s.nextInt();
            }
        }
        System.out.println("Enter the number you want to find");
        int x= s.nextInt();
        findIndex(arr,x);
    }


}
