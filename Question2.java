import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    System.out.print("Enter your height: ");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    
    System.out.print("Enter your weight: ");
    Scanner weightIn = new Scanner(System.in);
    double weight = weightIn.nextDouble();

    double bmi = weight/(height*height);
    System.out.println(bmi);
  }
}
