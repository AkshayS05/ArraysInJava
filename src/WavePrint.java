import java.util.Scanner;

public class WavePrint {
    public static void printWave(int[][] arr) {
        int rows= arr.length;
        if (rows==0){
            return;
        }
        int cols= arr[0].length;

        for (int j= 0; j <cols ; j++) {
        if(j%2!=0){
            for (int i = rows-1; i >=0 ; i--) {
                System.out.print(arr[i][j]+" ");
            }
        }else{
            for (int i = 0; i <rows ; i++) {
                System.out.print(arr[i][j]+ " ");
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
        printWave(arr);
    }


}
