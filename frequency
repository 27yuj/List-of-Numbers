import java.util.ArrayList;

public class frequency {
  public int findMostFrequent(ArrayList<Integer> numbers) {

    ArrayList<Integer> uniqueNumbers = new ArrayList<Integer>();
    ArrayList<Integer> frequencies = new ArrayList<Integer>();

    if (numbers.isEmpty()) {
      return 0;
    }

    for (int number : numbers) {
        if (uniqueNumbers.contains(number)) {
            int index = uniqueNumbers.indexOf(number);
            frequencies.set(index, frequencies.get(index) + 1);
        } else {
            uniqueNumbers.add(number);
            frequencies.add(1);
        }
    }
    int maxIndex = 0;
    for (int i = 1; i < frequencies.size(); i++) {
        if (frequencies.get(i) > frequencies.get(maxIndex)) {
            maxIndex = i;
        }
    }
    return frequencies.get(maxIndex);
  }
}
