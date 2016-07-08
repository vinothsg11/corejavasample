package onlinestore;

public enum BookCategory {
  FICTION("Fiction"), TECHNOLOGY("Technology"), NETWORKING("Network");
  String description;

  BookCategory(String description) {
    this.description = description;
  }
}
