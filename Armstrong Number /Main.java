import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      int original,remainder,result=0;
      original=number;
      while(original!=0)
      {
        remainder=original%10;
        result += Math.pow(remainder,3);
        original /=10;
      }
      if(result==number)
      {
        System.out.println("Armstrong Number");
      }
      else{
        System.out.println("Not a Armstrong Number");
      }
	}
}