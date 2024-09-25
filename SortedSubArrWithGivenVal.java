public class Main {
	public static void main(String[] args) {
		
		int[] ar={1,3,5,8};
		int n=ar.length;
		int val=5;
		int cnt=0;int sum=0;
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		        System.out.println(i+" "+j);
		        sum=sum+ar[i]+ar[j];
		        if(sum<=val)
		        cnt++;
		        sum=0;
		        
		        
		        }
		}
		System.out.println(cnt);
		
	}
}
