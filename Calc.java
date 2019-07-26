package calculator;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
	Operations obj = new Operations();
	Scanner s = new Scanner(System.in);
	double userInput1,userInput2;
	int userChoice;
	System.out.println("please enter the first number:");
    userInput1=s.nextDouble();
	System.out.println("please enter the second number:");
	userInput2=s.nextDouble();
	System.out.println("please enter operation to perform:");
	System.out.println("1.addition");
	System.out.println("2.subtraction");
	System.out.println("3.multiplication");
	System.out.println("4.division");
	userChoice=s.nextInt();
	
	switch(userChoice) {
	case 1:
		obj.addition(userInput1,userInput2);
		break;
	case 2:
		obj.subtraction(userInput1,userInput2);
		break;
	case 3:
		obj.multiplication(userInput1,userInput2);
		break;
	case 4:
		obj.division(userInput1,userInput2);
		break;
	

	}
	
	
}

}
