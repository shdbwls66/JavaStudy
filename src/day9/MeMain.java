package day9;

public class MeMain {
  public static void main(String[] args) {
    Me me = new Me("노유진", 25, "000515");

    Condition condition = new Condition();

    me.eating(condition);

    me.studying(condition);

    me.listenMusic(condition);

    me.playTheBass(condition);
  }
}
