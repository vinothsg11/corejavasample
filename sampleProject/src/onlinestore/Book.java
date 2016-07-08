package onlinestore;

public class Book extends NameClass {
  int id;
  String description;
  // Later change with Enum
  BookCategory category;
  Author[] authors;
  float price;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BookCategory getCategory() {
    return category;
  }

  public void setCategory(BookCategory category) {
    this.category = category;
  }

  public Author[] getAuthors() {
    return authors;
  }

  public void setAuthors(Author[] authors) {
    this.authors = authors;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

}
