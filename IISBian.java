import java.util.*;
public class IISBian {

	private static String num;
   static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("eneter string");
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		num = new String();
		
         num=s.nextLine();
         int n=Integer.parseInt(num);
         
         while(n>0) {
         int a=n%10;
            n=n/100;
          sum=sum+a;
         
	}
         System.out.println(sum);
	}
}
