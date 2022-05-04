package day4.GlobalVariables;

public class StaticGlobalVariable2 {


			static int age=25;
			public static void main(String[] args) {
				System.out.println("Program Starts....");
				System.out.println("SGV : "+age);//25
				System.out.println("SGV with standard: "+StaticGlobalVariable2.age);//25
				System.out.println("**********************************");
				age=30;	
				System.out.println("SGV : "+age);//30
				System.out.println("SGV with standard: "+StaticGlobalVariable2.age);//25
				System.out.println("Program Ends...");
			}
		}