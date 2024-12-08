import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long sum=0;
		long[] ar=new long[(int)n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextLong();
		    sum=sum+ar[i];
		}
		System.out.println("sum:"+sum);
		long min=Long.MAX_VALUE;
		int i=0;
		while(i<(int)n){
		    if(sum<=n*ar[i]){
		        if(min>ar[i])
		        min=ar[i];
		    }
		    i++;   
		}
		System.out.println("min:"+min);
		
		
	}
}