public class matrix_add {
    public static int[][] matrixAdd(int[][] arr1,int[][] arr2){
        int[][] out =  new int[arr1.length][];
        for(int i=0;i<arr1.length;i++){
            out[i] =  new int[arr1[i].length];
            for(int j=0;j<arr1[i].length;j++){
                out[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return  out;
    }
    
}
