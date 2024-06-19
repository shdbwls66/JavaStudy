package day15;

import java.util.*;
import java.util.Map.Entry;

public class Test {
  public static void main(String[] args) {

//    Queue<Message> messageQueue = new LinkedList<>();
//
//    messageQueue.offer(new Message("sendMail", "홍길동"));
//    messageQueue.offer(new Message("sendSms", "자바"));
//    messageQueue.offer(new Message("sendKakaoTalk", "파이썬"));
//    messageQueue.offer(new Message("sendWeeklyQuiz", "노션"));
//
//    while(!messageQueue.isEmpty()){
//      Message message = messageQueue.poll();
//      switch (message.getCommand()){
//        case "sendMail":
//          System.out.println(message.getTo() + " 에게 메일을 보냅니다.");
//          break;
//        case "sendSms":
//          System.out.println(message.getTo() + " 에게 Sms를 보냅니다.");
//          break;
//        case "sendKakaoTalk":
//          System.out.println(message.getTo() + " 에게 카카오톡을 보냅니다.");
//          break;
//        default:
//          System.out.println(message.getTo() + " 에게 아무거나 보냅니다.");
//      }
//    }
//
//    Stack<Coin> coinStack = new Stack<>();
//
//    coinStack.push(new Coin(100));
//    coinStack.push(new Coin(500));
//    coinStack.push(new Coin(10));
//    coinStack.push(new Coin(50));
//
//    while(!coinStack.isEmpty()){
//      Coin pop = coinStack.pop();
//      System.out.println(pop.getValue());
//    }

//    Map<String, String> map = new Hashtable<>();
//    Scanner scanner = new Scanner(System.in);
//
//    map.put("spring", "qwer");
//    map.put("summer", "qwer1234");
//    map.put("fall", "qwer123");
//    map.put("winter", "qwer123");
//
//    while(true){
//      System.out.println("아이디와 비밀번호를 입력해주세요");
//      System.out.println("아이디: ");
//      String id = scanner.nextLine();
//
//      System.out.println("비밀번호: ");
//      String pw = scanner.nextLine();
//
//      System.out.println("===================");
//
//      if (map.containsKey(id)){
//        String mapPassword = map.get(id);
//        if (mapPassword.equals(pw)){
//          System.out.println("로그인에 성공했습니다.");
//          scanner.close();
//          break;
//        } else {
//          System.out.println("비밀번호가 틀렸습니다.");
//        }
//
//      } else {
//        System.out.println("입력하신 아이디가 존재하지 않습니다.");
//      }
//    }

//    Map<Student, Integer> map = new HashMap<>();
//    map.put(new Student(1, "김기역"), 50);
//    map.put(new Student(2, "김니은"), 64);
//    map.put(new Student(3, "김삿갓"), 88);
//
//    Set<Entry<Student, Integer>> entries = map.entrySet();
//
//    for (Entry<Student, Integer> entry:entries){
//      String student = entry.getKey().getName();
//      int no = entry.getKey().getNo();
//      Integer score = entry.getValue();
//      System.out.println("번호: " + no + " 이름: " + student + " 점수: " + score);
//    }

//    Map<String, List<String>> map = new HashMap<>();
//    List<String> stringList = new ArrayList<>();
//    map.put("홍길동", stringList);
//    stringList.add("홍길동");
//    stringList.add("홍길동");
//    stringList.add("홍길동");
//    map.put("홍길동", stringList); // 같은 키에 값을 넣으면 덮어쓰기 됨
//
//    Set<Entry<String, List<String>>> entries = map.entrySet();
//
//    for(Entry<String,List<String>> entry:entries){
//      String key = entry.getKey();
//      List<String> value = entry.getValue();
//      System.out.println(key);
//      System.out.println("=====");
//      System.out.println(value);
//    }

//    Map<String, List<String>> map = new HashMap<>();
//    Set<String> strings = map.keySet();
//    Iterator<String> iterator = strings.iterator();
//
//    while(iterator.hasNext()){
//      String next = iterator.next();
//      List<String> stringList1 = map.get(next);
//      System.out.println(stringList1);
//    }
//
//    System.out.println(map.get("홍길동")); // 값 반환
//    System.out.println(map.remove("홍길동")); // 키값 쌍 삭제, 값 반환


//    Set<Member> set = new HashSet<>();
//
//    set.add(new Member("홍길동", 30));
//    set.add(new Member("홍길동", 30));
//
//    System.out.println("총 객체 수 : " + set.size());

//    Set<String> stringSet = new HashSet<>();
//
//    stringSet.add("Java");
//    stringSet.add("Spring");
//    stringSet.add("JSP");
//    stringSet.add("Java");
//    stringSet.add("DBMS");
//
//    System.out.println(stringSet.size());
//
//    System.out.println("==================");
//
//    Iterator<String> iterator = stringSet.iterator();
//    while(iterator.hasNext()){
//      System.out.println(iterator.next());
//    }
//
//    System.out.println("==================");
//
//    stringSet.remove("Java");
//
//    iterator = stringSet.iterator();
//    while(iterator.hasNext()){
//      System.out.println(iterator.next());
//    }
//
//    System.out.println("==================");
//
//    if (stringSet.isEmpty()){
//      System.out.println("비었습니다.");
//    }else{
//      System.out.println("비지 않았습니다.");
//    }

// HashSet 생성
    Set<Integer> integerSet = new HashSet<>();

// 객체 추가
    integerSet.add(1);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(4);
    integerSet.add(5);

// 검색을 위한 반복자 얻기
    Iterator<Integer> iterator = integerSet.iterator();

// 저장되어있는 객체 출력
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

    System.out.println("===================");

// 저장된 객체 수 출력
    System.out.println(integerSet.size());

    System.out.println("===================");

// 객체 삭제
    integerSet.remove(2); // 삭제
//    iterator = integerSet.iterator(); // iterator 다시 선언하기!!
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

  }
}
