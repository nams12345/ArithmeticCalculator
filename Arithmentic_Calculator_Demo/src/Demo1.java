import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		int ans;
		int n1;
		int n2;
		
		do 
		{
			System.out.println("\nChoose one of the following operations:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			Scanner sc=new Scanner(System.in);
			 choice=sc.nextInt();
			System.out.println("Enter 1st number");
			Scanner sc1=new Scanner(System.in);
			 n1=sc1.nextInt();
			System.out.println("Enter 2nd number");
			Scanner sc2=new Scanner(System.in);
			 n2=sc2.nextInt();
			
			sc.close();
			sc1.close();
			sc2.close();
			if(choice==1) 
			{
				Operations o=new Operations();
				ans=o.add(n1,n2);
				System.out.println("Answer:"+ans);
			}
			if(choice==2) 
			{
				Operations o=new Operations();
				ans=o.sub(n1,n2);
				System.out.println("Answer:"+ans);
			}
			if(choice==3) 
			{
				Operations o=new Operations();
				ans=o.multi(n1,n2);
				System.out.println("Answer:"+ans);
			}
			if(choice==4) 
			{
				Operations o=new Operations();
				if (n2!=0) 
				{
					ans=o.div(n1,n2);
					System.out.println("Answer:"+ans);
					}
				else 
				{
					System.out.println("We cannot divide by 0");
				}
				
			}
			
			
		}while(choice<4);
		
	}
	
	
}
