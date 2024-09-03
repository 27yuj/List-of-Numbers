import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many numbers do you want to print?");
    int numberOfNumbers = scanner.nextInt();

    for (int i = 0; i < numberOfNumbers; i++) {
      int randomNumber = (int) (Math.random() * 20) + 1;
      numbers.add(randomNumber);
      System.out.println(randomNumber);
    }

    findLowest fl = new findLowest();
    findHighest fh = new findHighest();
    mostFrequent mf = new mostFrequent();
    frequency fr = new frequency();
    
    System.out.println("\nLowest number in the list is " + fl.findLowestInt(numbers));
    System.out.println("Highest number in the list is " + fh.findHighestInt(numbers));
    System.out.println("Most frequent number is \"" + mf.findMostFrequent(numbers) + "\" and it occurs " + fr.findMostFrequent(numbers) + " times");
    
    scanner.close();
  }
}
