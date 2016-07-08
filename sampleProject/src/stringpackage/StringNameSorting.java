package stringpackage;

public class StringNameSorting {

  public static void main(String[] args) {
    String studenttNameList[] = new String[] { "Xavier", "daniel", "jeremy" };
    sortByName(studenttNameList);
  }

  static void sortByName(String[] nameList) {
    for (int i = 0; i < nameList.length; i++) {
      for (int j = i + 1; j < nameList.length; j++) {
        if (nameList[j].compareTo(nameList[i]) > 0) {
          String temp = nameList[j];
          nameList[j] = nameList[i];
          nameList[i] = temp;

        }
      }
      System.out.println(nameList[i]);
    }
  }
}
