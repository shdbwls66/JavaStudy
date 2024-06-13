package day11;

public class Student extends Person {
    int studentNo;

    public Student(String name, String ssn, int studentNo){
        super(name, ssn); // 부모의 생성자 호출
        this.studentNo = studentNo;
    }
}
