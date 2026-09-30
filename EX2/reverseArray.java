public class reverseArray {
    public static void reverse(int[] arr){
        System.out.print("The array before reversing is : [");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println(" ]");
        int k=arr.length-1;
        
        for(int i=0;i<arr.length/2;i++){
            int tmp = arr[i];
            arr[i]=arr[k-i];
            arr[k-i] = tmp;
            
        }
        System.out.print("The array after reversing is : [");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println("]");
        
    }
    public static void main(String[] args) {
        int[] numbers = {106, 26,81, 5, 15};

        reverse(numbers);
        System.out.println("");
        int[] ar = {106, 26, 5, 15};

        reverse(ar);
    }
}
