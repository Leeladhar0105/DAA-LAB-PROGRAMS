import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Encryption.encryption(s);
        sc.close();
        


    }
    public static void encryption(String s) {
        // Write your code here
       String str=s.replaceAll("//s", "");
       int n=str.length();
      // int rowlen=(int) Math.floor(Math.sqrt(n));
       int collen=(int) Math.ceil(Math.sqrt(n));
       for(int i=0;i<collen;i=i+1){
        for(int j=0;j<n;j=j+collen){
            if((i+j)<n){
            System.out.print(str.charAt(i+j));
            }
            
        }
        System.out.print(" ");
        
       }
    
    
       
    
        }
    
}
