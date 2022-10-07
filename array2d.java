public class array2d {
    public static void main(String[] args) {
        int[][] TwoDArray = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        toConsole(TwoDArray);
        System.out.println("------------------");
        toConsole(switchMatrix(TwoDArray));
    }
    public static int[][] switchMatrix(int[][] array2d){
        int[][] reversedArray2d = new int[array2d[0].length][array2d.length];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                reversedArray2d[j][i] = array2d[i][j];
            }
        }
        return reversedArray2d;
    }
    public static void toConsole(int[][] array2d){
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
