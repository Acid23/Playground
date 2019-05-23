import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
	     int sum = 0;  
         // Run for loop until count reaches n
	     for(int count = 1; count <=  n; count = count + 1)
	     {
             // Adding count with sum
	     if(count%2==1)    	     
	     System.out.println(count);
         }
	}
}