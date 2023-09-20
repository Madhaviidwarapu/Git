package model;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int evensum=0,oddsum=0;
		int evencount=0,oddcount=0;
		int avgeven,avgodd=0;
		int a,b,c,d,e,f	;
		System.out.println(" enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		for(int i=a;i<=f;i++)
		{
			if(i%2==0)
			{
				System.out.println("||||||||||");
				System.out.println("the even number is  "+i);
				evensum=evensum+i;
				evencount++;
			}
			else
			{
				System.out.println("The odd number is  "+i);
				oddsum=oddsum+i;
				oddcount++;
			}	
		}
		System.out.println("..................");
		System.out.println("the sum of evenumbers are "+evensum);
		System.out.println("the sum of oddnumbers are "+oddsum);
	
   avgeven=evensum/evencount ;
    avgodd=oddsum/oddcount;
   {
	System.out.println("------------");
	System.out.println(avgeven);
	System.out.println(avgodd);
}
}
}
