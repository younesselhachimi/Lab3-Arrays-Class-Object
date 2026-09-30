public class copy_column {
    public static void main(String[] args) {
        int[][] arr_2D = new int[6][8];
        for (int i = 0; i < arr_2D.length; i++) {
            for(int j=0;j<arr_2D[i].length;j++){
                arr_2D[i][j]=i+j;
            }
            
        }
        for (int i = 0; i < arr_2D.length; i++) {
            for(int j=0;j<arr_2D[i].length;j++){
                System.out.print(arr_2D[i][j]+" | ");
            }
            System.out.println("");
            
        }
        System.out.println(" ");

        for(int i=0;i<arr_2D.length;i++){
            arr_2D[i][4]=arr_2D[i][1];
        }

        for (int i = 0; i < arr_2D.length; i++) {
            for(int j=0;j<arr_2D[i].length;j++){
                System.out.print(arr_2D[i][j]+" | ");
            }
            System.out.println("");
            
        }
    }
}
