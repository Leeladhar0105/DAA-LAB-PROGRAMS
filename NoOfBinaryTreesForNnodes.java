import java.util.Scanner;

public class NoOfBinaryTreesForNnodes {

    public static int fact(int n){
        int res=1;
        while(n>1){
            res*=n;
            n--;
        }
        return res;
    }
    public static void main(String[] args) {
        int n,r;
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        n=sc.nextInt();
        r=n;
        n=2*n;
        System.out.println("No.of Binary Trees for N nodes(unlabelled)="+((fact(n)/(fact(n-r)*fact(r)))/(r+1)));
        System.out.println("No.of Binary Trees for N nodes(labelled)="+((fact(n)/(fact(n-r)*fact(r))/(n+1)))*fact(r));
        sc.close();
        
        
    }
    
}
