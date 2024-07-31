public class RotateArray {

     public static void main(String[] args) {
        int[] arr={1,4,5,2,7,9,8,6,4};
        int key=3;

        rotate(arr,key);
     }

     public static void rotate(int[] arr,int key){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[(i+key)%(arr.length)]+" ");
        }
     }
}