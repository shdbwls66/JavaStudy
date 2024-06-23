package weekly.weekly03;

import java.util.EmptyStackException;

public class Main {
  public static void main(String[] args) {
    // booShelf 객체 생성
    BookShelf<String> bookShelf = new BookShelf<>();

    // Book 객체 생성
    Book<String> book01 = new Book<>("마법천자문 1: 불어라! 바람 풍(風)", "스튜디오 시리얼", "book01");
    Book<String> book02 = new Book<>("코믹 메이플스토리 1", "송도수", "book02");
    Book<String> book03 = new Book<>("판타지 수학대전 1: 진리의 열쇠", "그림나무", "book03");
    Book<String> book04 = new Book<>("판타지 수학대전 2: 수학의 신전", "그림나무", "book04");
    Book<String> book05 = new Book<>("판타지 수학대전 2: 수학의 신전", "그림나무", "book05");

    // bookShelf 리스트에 book 객체 삽입
    bookShelf.addBook(book01);
    bookShelf.addBook(book02);
    bookShelf.addBook(book03);
    bookShelf.addBook(book04);
    bookShelf.addBook(book05);

    // 리스트 조회
    bookShelf.lookUp();
    System.out.println("=========================");

    // 리스트 검색
    System.out.println(bookShelf.searchByTitle("판타지"));
    System.out.println(bookShelf.searchByTitle("바보"));

    System.out.println("=========================");

    System.out.println(bookShelf.searchByAuthor("송도수"));

    // bookShelf 리스트에서 중복되는 인스턴스 제거
    bookShelf.removeBook(book05);

    // 리스트 조회
    System.out.println("=========================");
    bookShelf.lookUp();

    try {
      // BookStack 인스턴스 생성
      BookStack<Integer> bookStack = new BookStack<>();

      Book<Integer> bookStack01 = new Book<>(book01.getTitle(), book01.getAuthor(), 1);
      Book<Integer> bookStack02 = new Book<>(book02.getTitle(), book02.getAuthor(), 2);

      // bookStack에 인스턴스 추가
      bookStack.pushBook(bookStack01);
      bookStack.pushBook(bookStack02);

      // popBook() 메서드
      System.out.println(bookStack.popBook());
      System.out.println(bookStack.popBook());

      System.out.println("===========================");
      System.out.println(bookStack.isEmpty()); // true

      // peekBook() 메서드
      System.out.println(bookStack.peekBook());
      System.out.println(bookStack.peekBook());

      System.out.println("===========================");
      System.out.println(bookStack.isEmpty()); // false

    } catch (EmptyStackException e) { // 예외 처리
      System.out.println("===========================");
      System.out.println("Stack이 비어있습니다");
    } finally {
      System.out.println("===========================");
      System.out.println("정상적으로 종료되었습니다!");
    }

    //    System.out.println("===========================");

    //    for (Map.Entry<Book<String>, Integer> entry : entries) {
    //      String book = entry.getKey().getTitle();
    //      String author = entry.getKey().getAuthor();
    //      String identify = entry.getKey().getIdentifier();
    //      int a = entry.getValue();
    //      System.out.println(book + " " + author + " " + identify + " " + a);
    //    }
  }
}
