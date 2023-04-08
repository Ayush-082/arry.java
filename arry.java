//Write a Java program to insert an element (specific position) into an array.
import java.util.Scanner;
public class arry
{
	public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          int n,m;
          System.out.println("enter the position");
          n=in.nextInt();
          System.out.println("enter the element");
          m=in.nextInt();
         int[]arr={1,2,3,4,5,6,7};
           int temp=arr[n];
           arr[n-1]=m;
          for(int i=0;i<7;i++)
         {
          System.out.println(arr[i]);   
         }
	}
}
