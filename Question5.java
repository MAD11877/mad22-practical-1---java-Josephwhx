import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int noAttempt = in.nextInt();
    List<Integer> noList = new ArrayList<Integer>();
    int mode = 0;
    int highestCount = 0;
  
    //create loop for user to input values
    for(int i = 0; i != noAttempt; i++){
      int number = in.nextInt();
      //add to list
      noList.add(number);
    }

    //create loop to run through numbers in list
    for(int numberInList : noList){
      int count = 0;

      //create loop to check for duplicates 
      for(int n = 0; n < noAttempt; n++){
        //Count number of times the same number appear in list
        if(noList.get(n) == numberInList){
          count++;
        }
      }
      //check if count is greater than previous
      if(count > highestCount){
        highestCount = count;
        mode = numberInList;
      }
    }

    //Display mode
    System.out.println(mode);

  }
}
