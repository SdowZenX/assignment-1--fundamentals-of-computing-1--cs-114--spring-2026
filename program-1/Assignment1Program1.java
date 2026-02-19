import java.util.Scanner;
import java.util.Random;
public class Assignment1Program1 {
  public static void main(String[] args) {
System.out.println("ZZZZZZZ   SSSSS");
System.out.println("     ZZ  SS    ");
System.out.println("    ZZ    SSS  ");
System.out.println("   ZZ        SS");
System.out.println("  ZZ         SS");
System.out.println(" ZZ      SS   S");
System.out.println("ZZZZZZZ   SSSSS");
System.out.println();

Scanner input = new Scanner(System.in);
System.out.print("Please enter a 5-character string:");
String str = input.nextLine();
String trimmed = str.substring(1,4);
String reversed = new StringBuilder(trimmed).reverse().toString();
System.out.println();

System.out.print("Please enter a number in Fahrenheit:");
double fahrenheit = input.nextDouble();
double celsius = (fahrenheit - 32) * 5 / 9;
System.out.println();

Random rand = new Random();
System.out.println("Random number generated. Continuing   ");
int randomNum = rand.nextInt(16353) + 32;
System.out.println();

String result = String.format("%.1f", celsius) + "." + reversed + randomNum;
System.out.println("Your new string is " + result);
input.close();
  }
}
