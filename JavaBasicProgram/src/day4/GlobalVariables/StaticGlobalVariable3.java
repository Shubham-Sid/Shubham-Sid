package day4.GlobalVariables;

public class StaticGlobalVariable3 {

			//static global variable
			static int empId;//default value
			static double salary;//default value
			static char grade;//default value
			static boolean isPrime;//default value
			public static void main(String[] args) {
				System.out.println("Program Starts....");
				System.out.println("EmpId: "+empId);//
				System.out.println("Salary: "+salary);//
				System.out.println("Grade: "+grade);// 
				System.out.println("Prime: "+isPrime);//
				int age=25;//mandatory to initialize
				System.out.println(age);
				System.out.println("Program Ends...");
			}
		}
	