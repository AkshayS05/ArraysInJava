import java.util.Scanner;

public class TransposeOfAMatrix {
    public static void printTranspose(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for(int j=0; j<cols; j++){
            for (int i = 0; i <rows; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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
     printTranspose(arr);
    }
}
