package day14;

public class Course<T> {
  private String name;
  private T[] students;

  public Course(String name, int capacity) {
    this.name = name;
    students = (T[]) (new Object[capacity]);
  }

  public String getName() {
    return this.name;
  }

  public T[] getStudents() {
    return students;
  }

  // 배열에 비어있는 부분을 찾아서 추가
  public void add(T t) {
    for (int i = 0; i < students.length; i++) {
      if (students[i] == null) {
        students[i] = t;
        break;
      }
    }
  }
}
