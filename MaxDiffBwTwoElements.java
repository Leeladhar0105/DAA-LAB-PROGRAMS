public class MaxDiffBwTwoElements {

    static int maxDifference(int[] arr,int n){
        int minEleVisited=arr[0];
        int maxDiff=arr[1]-arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-minEleVisited>maxDiff){
                maxDiff=arr[i]-minEleVisited;
            }
            if(arr[i]<minEleVisited){
                minEleVisited=arr[i];
            }
        }
        return maxDiff;

    }
    public static void main(String[] args) {
        int[] arr=new int[]{7, 9, 5, 6, 3, 2};
        int n=arr.length;
        int res=maxDifference(arr,n);
        System.out.println("Max Difference="+res);
        
            
        }
    }
    

