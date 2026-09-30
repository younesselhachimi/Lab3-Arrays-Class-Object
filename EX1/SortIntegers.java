public class SortIntegers {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }   
    public static int[] sortIntegers(int[] arr){
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
        return out_arr;
    }
        public static void main(String[] args) {
        int[] numbers = {106, 26, 81, 5, 15};
        int[] sortedNumbers = sortIntegers(numbers);

        printArray(sortedNumbers);
        System.out.println("");
        int[] ar = {16, 26, 1, 5};
        int[] sortedAr = sortIntegers(ar);

        printArray(sortedAr);
    }

}
