
public class factorialList {

	public static void main(String[] args) { //main method
		long factorial = 1; //declare variable "factorial" a long with the value of 1
		System.out.println("Factorial List:"); //Title for output

		//Loop for the math
		for(long number=1; number<13; number++){ //Change middle number in order to get more or less answers
			factorial = factorial*number; //Stores previous number into "factorial" then multiplies it by the next number++
			System.out.println(number+"!=" + factorial); //Prints the factorial and its answer
		}
		}

}
