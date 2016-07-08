package onlinestore;

import java.util.StringTokenizer;

public class StringBuilderBuilder {

  public static void main(String[] args) {
    // Create StringBuilder
    // Add 10 names to this string builder with "|" seperator.

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Name1");
    stringBuilder.append("|");
    stringBuilder.append("Name2");
    stringBuilder.append("|");
    stringBuilder.append("Name3");
    stringBuilder.append("|");
    stringBuilder.append("Name4");
    stringBuilder.append("|");

    // Write a method to split the string builder and
    // and convert to String[]
    String[] output = new String[5];
    try {
      output = splitUsingStringTokenizer(stringBuilder.toString());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
      exception.printStackTrace();
    }

    for (int i = 0; i < output.length; i++) {
      if (output[i] != null) {
        System.out.println("Processed string value ->" + output[i]);
      }
    }
  }

  public static String[] converToStringArray(StringBuilder builder) {
    String[] outputString = new String[10];
    int startIndex = 0;
    int counter = 0;
    while (startIndex < builder.length()) {
      int searchIndex = builder.indexOf("|", startIndex);
      String outputBuilder = builder.substring(startIndex, searchIndex);
      startIndex = searchIndex + 1;
      outputString[counter] = outputBuilder;
      counter++;
    }
    return outputString;
  }

  public static String[] simplifiedStingArrayConversion(StringBuilder builder) {
    String[] outputString = new String[10];
    outputString = builder.toString().split("\\|");
    return outputString;
  }
  // Write program to find the number of occurence of a word in a sentence.

  // This is a test for java programming. Java is a object oriented programming.
  // java is developed from C++. Using Java Spring, Groovy are developed.

  public static String[] splitUsingStringTokenizer(String stringToSplit)
      throws NullPointerException {
    StringTokenizer st = new StringTokenizer(stringToSplit, "|");
    String[] outputString = new String[st.countTokens()];
    int counter = 0;

    st = null;
    while (true) {
      if (st.hasMoreTokens()) {
        outputString[counter] = st.nextToken();
        counter++;
      } else {
        break;
      }
    }

    return outputString;
  }
}