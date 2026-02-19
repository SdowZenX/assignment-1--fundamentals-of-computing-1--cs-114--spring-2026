import java.util.Scanner;
public class Assignment1Program2 {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Base Conversion Program");
System.out.println();

System.out.print("Please enter a base (2-9):");
int base = input.nextInt();
int maxNumber = (base - 1) * base * base * base + (base - 1) * base * base + (base - 1) * base +(base - 1);

System.out.println("The maximum, 4 digit, base 10 number in base" + base + " is "+ maxNumber + ".");
System.out.print("Now, enter a base 10 number in the range 0 to " + maxNumber + " to convert: ");
int num = input.nextInt();
System.out.println();

int digit1 = num / (base * base * base);
int remainder1 = num % (base * base * base);
int digit2 = remainder1 / (base * base);
int remainder2 = remainder1 % (base * base);
int digit3 = remainder2 / base;
int digit4 = remainder2 % base;
System.out.println(num + " (base 10) = " + digit1 + digit2 + digit3 + digit4 + " (base " + base + ")");
input.close();
  }
}
