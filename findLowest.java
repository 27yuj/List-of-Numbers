import java.util.ArrayList;

public class findLowest {
  public int findLowestInt(ArrayList<Integer> numbers) {
    if (numbers.isEmpty()) {
      return 0; 
    }
    
    int lowest = numbers.get(0);
    
    for (int i = 1; i < numbers.size(); i++) {
      if (numbers.get(i) < lowest) {
        lowest = numbers.get(i);
      }
    }
    return lowest;
  }
}
