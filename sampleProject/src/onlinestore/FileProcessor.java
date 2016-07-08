package onlinestore;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
public class FileProcessor
{
FileReader		reader;
BufferedReader	bufferedReader;
String			inboundFile	= "C:\\vinoth\\course\\samplecode\\sampleProject\\src\\data\\inbound\\author.txt";
String			splitter	= "|";

public FileReader getFileReader(String filePath) throws FileNotFoundException {
FileReader reader = new FileReader(inboundFile);
return reader;
}

public BufferedReader getBufferReader(FileReader fileReader) {
BufferedReader in = new BufferedReader(reader);
return in;
}

private HashMap<String, String> converToHashMap(String stringToSplit) {
String authorColumnHeader[] = new String[]{"ID", "NAME"};
StringTokenizer tokenizer = new StringTokenizer(stringToSplit, "|");
HashMap<String, String> fileData =  new HashMap();
int columnHeaderIndex = 0;
while (tokenizer.hasMoreTokens())
{
	fileData.put(authorColumnHeader[columnHeaderIndex], tokenizer.nextToken());
	columnHeaderIndex++;
	
}
return fileData;
}

public List<Author> createListOfHashMapFromFile() throws IOException {
List<Author>  authorListCreated =  new ArrayList<Author>();
OnlineStoreService service = new OnlineStoreService();
reader = getFileReader(inboundFile);
bufferedReader = getBufferReader(reader);
String line = bufferedReader.readLine();
while (line != null)
{
	System.out.println(line);
	line = bufferedReader.readLine();
	if (line != null)
	{
		HashMap<String, String> authorMap = converToHashMap(line);
		Author author = service.createAuthor(authorMap.get("NAME"),
						Integer.parseInt(authorMap.get("ID")));	
		authorListCreated.add(author);
		
	}
}

return authorListCreated;
}


private String[] splitStringByToken(String stringToSplit) {
StringTokenizer tokenizer = new StringTokenizer(stringToSplit, "|");
String[] stringAfterSplit = new String[tokenizer.countTokens()];
int counter = 0;
while (counter <= tokenizer.countTokens())
{
	stringAfterSplit[counter] = tokenizer.nextToken();
	counter++;
	
}
return stringAfterSplit;
}





private List<Author> createAuthoFromArrayList(List<HashMap<String, String>> authorList) {
OnlineStoreService service = new OnlineStoreService();
List<Author>  authorListCreated =  new ArrayList<Author>();
for(HashMap<String, String> authorMap : authorList){
	Author author = service.createAuthor(authorMap.get("NAME"),
					Integer.parseInt(authorMap.get("ID")));	
	authorListCreated.add(author);
}

return authorListCreated;
}


private Author createAuthorFromString(String[] authorDataString) {
OnlineStoreService service = new OnlineStoreService();
Author author = service.createAuthor(authorDataString[1],
				Integer.parseInt(authorDataString[0]));
return author;

}



public Author[] createAuthorFromInputFile() throws IOException {
Author[] authorList = new Author[10];
int authCounter = 0;
try
{
	reader = getFileReader(inboundFile);
	bufferedReader = getBufferReader(reader);
	String line = bufferedReader.readLine();
	String[] authorDataString = splitStringByToken(line);
	authorList[authCounter] = createAuthorFromString(authorDataString);
	while (line != null)
	{
		authCounter++;
		System.out.println(line);
		line = bufferedReader.readLine();
		if (line != null)
		{
			authorDataString = splitStringByToken(line);
			authorList[authCounter] = createAuthorFromString(authorDataString);
		}
	}
} catch (IOException ioe)
{
	System.out.println("error ");
} finally
{
	reader.close();
	bufferedReader.close();
}
// Read file using Bufferreaderr
// call create Author and store it in the Author array
// return the author arraylist
return authorList;
}


public void printAuthorData(Author[] authorList) {
for (Author author : authorList)
{
	if (author != null)
		System.out.println("Author name ->" + author.getName());
}
}


public void printAuthorFileContent() throws IOException {
Author[] authorList = new Author[10];
int authCounter = 0;
try
{
	reader = getFileReader(inboundFile);
	bufferedReader = getBufferReader(reader);
	String line = bufferedReader.readLine();
	while (line != null)
	{
		line = bufferedReader.readLine();
		System.out.println(line);
	}
} catch (IOException ioe)
{
	System.out.println("error ");
} finally
{
	reader.close();
	bufferedReader.close();
}
}


public Book[] createBookFromInputFile() {
return null;
}
}