//+ is addition
//- is subtraction
//* is multiplication
//% is remainder (modulus)
//== is equal to
//!= is not equal to
//< is less than
//> is greater than
//<= is less than or equal to
//>= is greater than or equal to
//&& is and
//|| is or
//! is not

public class Operators {
	public static void main(String[] args) {

System.out.println(10 / 3);
System.out.println(10 % 3);
System.out.println(10.0 / 3);
System.out.println(2 + 3 * 4);
System.out.println((2 + 3) * 4);
System.out.println(5 / 2 * 2.0);

int score = 10;
score += 5;    // same as score = score + 5  -> 15
score -= 3;    // 12
score *= 2;    // 24
score++;       // add 1 -> 25   (Python has no ++)
score--;       // subtract 1 -> 24

//exercise 2
int score1 = 15;
int score2 = 21;
int score3 = 25;
int total = score1 + score2 + score3;

System.out.println(total); 
System.out.println(total / 3);
System.out.println((double) total / 3);  
System.out.println("Average (int division): " + total / 3);
System.out.println("Average (decimal): " + (double) total / 3);
System.out.println("Average (decimal cut to int): " + (int) ((double) total / 3));

//exercise 3
boolean passMark = total >= 50;
boolean totalCheck = total == 100;
boolean passRange = total >= 40 && total <= 70;
boolean nullCheck = total != 0;

System.out.println(passMark);
System.out.println(totalCheck);
System.out.println(passRange);
System.out.println(nullCheck);   

//exercise 4
int time = 5000;
int hours = time / 3600;          // 1
int remaining = time % 3600;      // (what's left after whole hours)
int minutes = remaining / 60;      // minutes
int secs = remaining % 60;         // seconds
System.out.println(hours + "h " + minutes + "m " + secs + "s");

	}
}