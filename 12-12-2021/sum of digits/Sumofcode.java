package test;

public class Sumofcode {
	//Wirte a program Sum of digits n using java

		public static void main(String[] args) 
		{
			System.out.println("*Sum of digits**");
			int n=437,temp,sum=0;
			while(n>0) //iterate the loop
			{
				temp=n%10; //get the remainder value
				sum=sum+temp; //sum of the value
				n=n/10;//get the division value
			}
			System.out.println(sum);//Print the statement
		}

	}


