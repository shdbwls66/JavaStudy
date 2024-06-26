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

  public void addBook(int index, Book<T> book) {
    books.add(index, book);
  }

  @Override
  public void removeBook(Book<T> book) {
    books.remove(book);
  }

  public void removeBook(int index){
    books.remove(index);
  }

  public void BookShelfList() {
    for (Book<T> list : books) {
      System.out.println(List.of(list));
    }
  }

  @Override
  public List<Book<T>> searchByTitle(String title) {
    return books.stream()
        .filter(book -> book.getTitle().contains(title.toLowerCase()) || book.getTitle().contains(title.toUpperCase()))
        .collect(Collectors.toList());
  }

  @Override
  public List<Book<T>> searchByAuthor(String author) {
    return books.stream()
        .filter(book -> book.getAuthor().contains(author.toLowerCase()) || book.getAuthor().contains(author.toUpperCase()))
        .collect(Collectors.toList());
  }
}
