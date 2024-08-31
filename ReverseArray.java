public class ReverseArray {


    private static void reverseArray(int[] arr,int n){
        int first=0,last=n-1;
        int middle;
        while ((first<last)) {
           middle=arr[first];
           arr[first]=arr[last];
           arr[last]=middle;
           first++;
           last--;
            
        }
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        reverseArray(arr, n);

    }
    
}
