public class median_array {
    public static double median(int[] arr){
        double med =0;
        int[] out_arr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            out_arr[i]=arr[i];
        }
        for (int i = 0; i < out_arr.length - 1;i++) {
        int mx_idx = i;
        for (int j = i + 1; j < out_arr.length; j++) {
            if (out_arr[j] > out_arr[mx_idx]) {
                mx_idx = j; 
            }
        }
            int tmp = out_arr[mx_idx];
            out_arr[mx_idx] = out_arr[i];
            out_arr[i] = tmp;
        }
        int len =  out_arr.length;
        if(len%2==0){
            med = (out_arr[(len/2)-1]+out_arr[len/2])/2;
        }else{
            med = out_arr[len/2];
        }
        return med;
    }
    public static void main(String[] args) {
        int[] num = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        System.out.println(median(num));
        int ar[] = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println(median(ar));
    }
}
