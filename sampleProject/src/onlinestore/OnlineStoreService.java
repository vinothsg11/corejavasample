package onlinestore;

/**
 * Class to create data required for online store and adding methods specific to online store
 * functionality.
 * 
 * @author user
 *
 */
public class OnlineStoreService {

  /**
   * Method to create master data author.
   * 
   * @return
   */
  public Author[] createAuthors() {
    Author[] authorList = new Author[10];
    authorList[0] = createAuthor("Daniel", 1);
    authorList[1] = createAuthor("Jeremy", 2);
    return authorList;
  }

  /**
   * Method to create master data - Books.
   * 
   * @param authorList
   * @return
   */
  public Book[] createBooks(Author[] authorList) {
    Book[] bookList = new Book[10];
    bookList[0] = createBook(BookCategory.FICTION, "True story based on the haunted boat", 150.00f,
        "Lonely Boat", 1, findAuthorByName(authorList, "Daniel"));
    bookList[1] = createBook(BookCategory.FICTION, "Comedy", 150.00f, "Lonely Boat", 2,
        findAuthorByName(authorList, "Daniel"));
    bookList[2] = createBook(BookCategory.TECHNOLOGY, "Java best practices", 150.00f, "Java", 3,
        findAuthorByName(authorList, "Jeremy"));
    bookList[3] = createBook(BookCategory.NETWORKING, "Unix Server Mnagement", 150.00f,
        "Networking", 4, findAuthorByName(authorList, "Jeremy"));
    return bookList;
  }

  private Author findAuthorByName(Author[] author, String authorName) {
    Author authorByName = null;
    for (int i = 0; i < author.length; i++) {
      if (author[i] != null && author[i].getName().equalsIgnoreCase(authorName)) {
        authorByName = author[i];
      }
    }
    return authorByName;
  }

  public Book createBook(BookCategory category, String description, float price, String title,
      int id, Author author) {
    Book book = new Book();
    book.setCategory(category);
    book.setDescription(description);
    book.setId(id);
    book.setPrice(price);
    book.setName(title);
    book.getAuthors()[0] = author;
    return book;
  }

  public Author createAuthor(String name, int id) {
    Author author = new Author();
    author.setName(name);
    ;
    author.setId(id);
    return author;
  }

  /**
   * Generic method to search for author and book by name;
   * 
   * @param elementList
   * @param name
   * @return
   */
  public <T extends NameClass> T getObject(T[] elementList, String name) {
    for (T singleElement : elementList) {
      if (singleElement.getName().equalsIgnoreCase(name)) {
        return singleElement;
      }
    }
    return null;
  }

}