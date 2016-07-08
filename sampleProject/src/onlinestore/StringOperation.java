package onlinestore;

public class StringOperation {
  // Throws null pointer for uppercase conversion method
  // throws ArrayIndexOutofBoundsException in sortByName
  public String[] sortByName(String[] stingToSort) throws ArrayIndexOutOfBoundsException {
    return null;
  }

  public int getIndexByName(String name[], String stringToSearch) throws OnlineAppStoreException {
    int index = 0;
    for (int i = 0; i < name.length; i++) {
      if (name[i].equalsIgnoreCase(stringToSearch)) {
        index = i;
      }
    }
    if (index == 0) {
      throw new OnlineAppStoreException(ErrorConstants.ERROR_NUMBER_001,
          ErrorConstants.ERROR_TYPE_HIGH, "No Data Found");
    }
    return index;
  }
}
