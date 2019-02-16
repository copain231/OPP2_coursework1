import java.util.Scanner;

public class ally {

	public static void main(String[] args) {
		Scanner Scn=new Scanner(System.in);

		System.out.println("enter java");
		Double num1=Scn.nextDouble();
		System.out.println("enter networking");
		Double num2=Scn.nextDouble();
		System.out.println("enter computer application");
		Double num3=Scn.nextDouble();
		System.out.println("enter oop2");
		Double num4=Scn.nextDouble();
		System.out.println("enter web design2");
		Double num5=Scn.nextDouble();
		System.out.println("enter maths");
		Double num6=Scn.nextDouble();
		System.out.println("enter communication skills");
		Double num7=Scn.nextDouble();
		Double sum;
		sum=num1+num2+num3+num4+num5+num6+num7;
		System.out.println("sum ="+ sum);
		Double avg;
		avg=sum/7;
		System.out.println("avg ="+ avg);
		
		if(avg>=90 && avg<100)
		{
			System.out.println("GPA="+5.0);
		}
		else if(avg>=75 && avg<90)
		{
			System.out.println("GPA="+4.0);
		}
		else if(avg>=65 && avg<80)
		{
			System.out.println("GPA="+3.0);
		}
		else if(avg>=55 && avg<70)
		{
			System.out.println("GPA="+2.0);
		}
		else {
			System.out.println("fail");
		}
		
	}

}