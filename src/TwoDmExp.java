public class TwoDmExp {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = {{2,2,2},{2,2,2},{2,2,2}};

        // Printing Array1 in matrix format
        System.out.println("Array1 -");
        for(int i=0;i<=arr1.length-1;i++) {    // for-loop for number of rows
            for(int j=0;j<=arr1.length-1;j++) {    // for-loop for number of columns
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }



    }
}
