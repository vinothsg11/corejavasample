package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
  public static void main(String[] args) {
    List<Double> temperatureList = new ArrayList<Double>();
    temperatureList.add(40.5);
    temperatureList.add(140.5);
    temperatureList.add(50.5);
    temperatureList.add(30.5);

    System.out.println(temperatureList);

    Collections.sort(temperatureList);
    System.out.println("Sorted List: " + temperatureList);

    int searchIndex = Collections.binarySearch(temperatureList, 40.5);
    if (searchIndex >= 0) {
      System.out.println("Temperature found.");
    } else {
      System.out.println("Temperature not found.");
    }

    Collections.shuffle(temperatureList);
    Collections.fill(temperatureList, 0.0);
    System.out.println("Filled List: " + temperatureList);

  }
}
