import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String word = s.nextLine();
		System.out.println(word.charAt(0));
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s2 = new Scanner(System.in);
		System.out.print("In: ");
		Boolean trueFalse = s2.nextBoolean();
		System.out.println(!trueFalse);
		s2.nextLine();
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s3 = new Scanner(System.in);
		System.out.print("In: ");
		int num = s3.nextInt();
		System.out.println(num > 5);
		s3.nextLine();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s4 = new Scanner(System.in);
		System.out.print("In: ");
		double fracNum = s4.nextDouble();
		System.out.println(fracNum >= -2 && fracNum <= 2);
		s4.nextLine();
		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s5 = new Scanner(System.in);
		System.out.print("In: ");
		String word2 = s5.nextLine();
		System.out.println(word2.equals("Hello World"));
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s6 = new Scanner(System.in);
		System.out.print("In: ");
		int num2 = s6.nextInt();
		System.out.print("In: ");
		int num3 = s6.nextInt();
		System.out.println(num2 <= num3);
		s6.nextLine();
		
	}

	public static void q7() {
		//Write question 7 code here
		Scanner s7 = new Scanner(System.in);
		System.out.print("In: ");
		double fracNum2 = s7.nextDouble();
		System.out.print("In: ");
		double fracNum3 = s7.nextDouble();
		System.out.println(fracNum2 > fracNum3);
		s7.nextLine();
		
		
	}

}
