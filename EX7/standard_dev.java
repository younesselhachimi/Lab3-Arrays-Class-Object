public class standard_dev {
    public static double stdev(int[] arr){
        double std =0;
        double sum = 0;
        double avg =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg = sum/arr.length;
        sum =0;
        for(int i=0;i<arr.length;i++){
            double x =arr[i]-avg;
            sum+=Math.pow(x, 2);
        }
        std = Math.sqrt(sum/(arr.length-1));


        return std;
    }

    public static void main(String[] args) {
        int[] arr =  {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(stdev(arr));
    }
}
