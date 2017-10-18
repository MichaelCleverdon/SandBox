import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {

	int numberBits = 10;
	int bite = 8; //Spelled wrong to avoid key word "byte"
	int nibble = 4;
	int byteAnswer = 0, byteRemainder = 0;
	
	// test out 10 / 8 want 1 remainder 2
	
	
	byteRemainder = numberBits % bite;
	byteAnswer = numberBits/bite;
	System.out.println("bits = " + numberBits
			+ " bytes = " + byteAnswer + " remainder = " + byteRemainder);
	
	
	/* how to handle mixed case: y, Y, yes, Yes, YES*/
	Scanner kbd = new Scanner(System.in);
	System.out.println("\n\n\nHi, enter your answer (Y/N)");
	String answer = kbd.nextLine().toUpperCase(); 
	System.out.println("You have entered "+ answer);
	
	if(answer.equalsIgnoreCase("y") || answer.equals("YES")){
		System.out.println("Answer is y");
	}
	else if(answer.equals("N")||answer.equals("NO")){
		System.out.println("Answer is n");
	}
	else {
		System.out.println("You're really bad at following directions, try again");
	}
	}
}
