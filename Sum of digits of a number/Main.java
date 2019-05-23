import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
	  int a=0;
      int sum=0;
      while(n!=0)
      {
        a=n%10;
        n=n/10;
        sum=sum+a;
      }
      System.out.println(sum);
	}
}