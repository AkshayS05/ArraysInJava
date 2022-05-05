import java.util.Scanner;

public class PrintSpiral {
    public static void printSpiral(int[][] arr) {
        int rows = arr.length;
        if(rows==0){
            return;
        }
        int cols = arr[0].length;
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = rows - 1;
        int colEnd = cols - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");

            }
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(arr[rowEnd][i] + " ");
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(arr[i][colStart]+" ");
            }
            colStart++;

        }
        System.out.println();
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
        printSpiral(arr);
    }
}
