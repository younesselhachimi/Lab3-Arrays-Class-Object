public class two_dimensional_array {
    public static void main(String[] args) {
        int[][] arr_2D = new int[5][];
        int k=1;
        for(int i=0;i<5;i++){
            arr_2D[i] = new int[i+1];
            for(int j=0;j<i+1;j++){
                arr_2D[i][j]=k;
                System.out.print(arr_2D[i][j]+" ");
                k++;
            }
            System.out.println("");
        }
    }
    
}
