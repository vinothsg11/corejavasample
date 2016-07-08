package onlinestore;

public class StartOnlineStore {
/**
 * Java doc to process input file.
 * @param args
 * @throws Exception
 */
  public static void main(String[] args) throws Exception {
    FileProcessor fileProcessor = new FileProcessor();
    Author[] authorList = fileProcessor.createAuthorFromInputFile();
    fileProcessor.printAuthorData(authorList);
  }
}
