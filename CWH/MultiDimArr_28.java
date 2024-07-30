public class MultiDimArr_28 {
    public static void main(String[] args) {
        // 2D array
        int[][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("Printing 2D array: ");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        // 3D array
        int[][][] arr = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        System.out.println("Printing 3D array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }


        String[][] str = {
            {"Virat", "Ronaldo", "Dhyan Chand"},
            {"cricket", "football", "hockey"}
        };

        System.out.println("Printing 2D string array: ");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        str[1][1] = "soccer";
        System.out.println("Printing 2D string array after changing: ");
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]);
                System.out.print(" ");
            }

            System.out.println("");
        }



        //sum of 2D array
        

        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{5, 6}, {7, 8}};

        int[][] result = new int[2][2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Printing sum of 2D array: ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }



        //multiplication of 2D array

        int[][] arr3 = {{1, 2}, {3, 4}};
        int[][] arr4 = {{5, 6}, {7, 8}};

        int[][] result2 = new int[2][2];
    
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                result2[i][j] = 0;
                for (int k = 0; k < arr3.length; k++) {
                    result2[i][j] += arr3[i][k] * arr4[k][j];
                }
            }
        }

        System.out.println("Printing multiplication of 2D array: ");
        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {
                System.out.print(result2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
