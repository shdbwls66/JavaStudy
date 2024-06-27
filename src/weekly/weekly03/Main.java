package weekly.weekly03;

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      // booShelf 인스턴스 생성
      BookShelf<String> bookShelf = new BookShelf<>();
      BookStack<Integer> bookStack = new BookStack<>();
      while (true) {
        System.out.println("원하시는 기능을 선택해주세요.");
        System.out.println("0. 종료, 1. bookShelf 추가, 2. bookShelf 제거, 3. 검색, 4. bookShelf 리스트 조회");
        System.out.println("5. bookStack 추가, 6. pop() 메서드, 7. peek() 메서드, 8. bookStack 상태 확인");
        int chooseNum = scanner.nextInt();
        scanner.nextLine();

        // 0 선택시 종료
        if (chooseNum == 0) {
          System.out.println("종료합니다.");
          break;
        }

        switch (chooseNum) {
          case 1: // 도서 정보 입력 받고 bookShelf 추가
            System.out.println("bookShelf 요소를 입력해주세요 (책 제목, 저자, 식별자)");
            System.out.println("책 제목: ");
            String title = scanner.nextLine();

            System.out.println("저자: ");
            String author = scanner.nextLine();

            System.out.println("식별자: ");
            String identifyStr = scanner.nextLine(); // String

            Book<String> book = new Book<>(title, author, identifyStr);
            bookShelf.addBook(book);
            break;

          case 2: // 인덱스로 제거
            bookShelf.BookShelfList();
            System.out.println("제거할 도서를 선택하세요");
            bookShelf.removeBook(scanner.nextInt());
            break;

          case 3: // 검색
            System.out.println("검색 조건 선택(제목 / 저자)");
            String option = scanner.nextLine();
            System.out.println("검색명을 입력하세요");
            if (option.equals("제목")) {
              System.out.println(bookShelf.searchByTitle(scanner.nextLine()));
            } else {
              System.out.println(bookShelf.searchByAuthor(scanner.nextLine()));
            }
            break;

          case 4: // 리스트 조회
            System.out.println("BookShelf list");
            bookShelf.BookShelfList();
            break;

          case 5: // bookStack 에 도서정보 추가
            System.out.println("bookStack 요소를 입력해주세요");
            System.out.println("책 제목: ");
            String stackTitle = scanner.nextLine();

            System.out.println("저자: ");
            String stackAuthor = scanner.nextLine();

            System.out.println("식별자: ");
            int identifyInt = scanner.nextInt(); // Integer

            Book<Integer> stack = new Book<>(stackTitle, stackAuthor, identifyInt);
            bookStack.pushBook(stack);
            break;

          case 6: // pop() 메서드
            System.out.println(bookStack.popBook());
            break;

          case 7: // peek() 메서드
            System.out.println(bookStack.peekBook());
            break;

          case 8: // bookStack 이 비어있는지 여부
            System.out.println(bookStack.isEmpty());
            break;

          default:
            System.out.println("목록에 없는 번호 입니다!");
            break;
        }
      }

    } catch (EmptyStackException e) { // EmptyStackException 예외 처리
      System.out.println("===========================");
      System.out.println("Stack이 비어있습니다");

    } catch (InputMismatchException e) { // InputMismatchException 예외 처리
      System.out.println("올바른 입력이 아닙니다.");

    } finally {
      System.out.println("===========================");
      System.out.println("정상적으로 종료되었습니다!");
    }
  }
}
