import java.util.Scanner;

public class TestApp
{
  public static void main(String[] args)
  {
    System.out.println("Shane == Harambe");

    int num1 = 5;
    double num2 = 3.5;
    String world = "This is a string literal";
    char x = 'x';

    Scanner imput = new Scanner(System.in);
    System.out.println("Enter in 3 numbers: ");
    double num3 = imput.nextDouble();
    double num4 = imput.nextDouble();
    double num5 = imput.nextDouble();

    System.out.println("HO HO mickmouse says hello" 
                       + num3 + " " + num4 + num5);
    double sum = num3 + num4 + num5;
    double average = sum /3;
    System.out.println("The average is " + average);
  }
}