package Dang_Ba_Hau;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int[][] array ;
        System.out.println("Enter row");
        int row = input.nextInt();
        System.out.println("Enter column");
        int col = input.nextInt();
        array = new int[row][col] ;
        for (int i = 0 ; i< row ; i++){
            for (int j = 0 ; j < col ; j++){
                System.out.print("Enter element array[" + i + "]" + "["+ j + "]");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("The matrix");
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j < col ; j ++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int max = array[0][0];
        for (int h = 0 ; h< row ; h++){
            for(int k = 0 ; k< col ; k++){
                if(max < array[h][k]){
                    max = array[h][k];
                }
            }
        }
        System.out.println("Max in array :" + max);

    }
}
