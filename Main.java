import java.util.Scanner;
/**
 * This program lets the user know if they can drive or not
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for the user
    Scanner input = new Scanner(System.in);

    // define the minimum driving age 
    final int MIN_DRIVER_AGE = 16; 
    // define the minimun voting age
    final int VOTING_AGE = 18;

    // prompt the user for thier age
    System.out.println("Please enter your age:");
    
    int age = input.nextInt();

    if(age >= VOTING_AGE){
      System.out.println("You can vote");
      System.out.println("You can legally drive");
    } else if(age >= MIN_DRIVER_AGE){
      // tell them they can drive
      System.out.println("You can legally get your license");
    } else {
      // not old enough to drive
      System.out.println("Sorry, you can't drive yet!");
    }
  



    //boolean logical operators
    //between age 18 and 30
    if(age >= 18 && age <= 30){
      System.out.println("Time to go to college");
    }

  }
}
