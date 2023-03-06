import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 20, 10, 10, 20, 20};
        System.out.println("Array : "+ Arrays.toString(arr));

        int count = 0;
        for(int i =0 ; i<arr.length;i++){
            for(int j= 0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    if(j<i){
                        break;
                    }
                    count++;
                }
            }
            if(count>0){
                System.out.printf("%d number is written %d times.\n", arr[i], count);
                count = 0;
            }
        }


    }
}
