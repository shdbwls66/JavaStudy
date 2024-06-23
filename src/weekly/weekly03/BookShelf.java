package weekly.weekly03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookShelf<T> implements BookManager<T> {
  private List<Book<T>> books;

  public BookShelf() {
    books = new ArrayList<>();
  }

  @Override
  public void addBook(Book<T> book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book<T> book) {
    books.remove(book);
  }

  public void lookUp() {
    for (Book<T> list : books) {
      System.out.println(List.of(list));
    }
  }

  @Override
  public List<Book<T>> searchByTitle(String title) {
    return books.stream()
        .filter(book -> book.getTitle().contains(title))
        .collect(Collectors.toList());
  }

  @Override
  public List<Book<T>> searchByAuthor(String author) {
    return books.stream()
        .filter(book -> book.getAuthor().contains(author))
        .collect(Collectors.toList());
  }
}
