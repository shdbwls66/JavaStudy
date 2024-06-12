public class Car {
  private int speed = 100;

  private int gear;
  private String wheel;
  private int cc;
  private String logo;
  private String engine;
  private boolean stop;

  public double getSpeed(){
    return this.speed * 1.6;
  }

  public void setSpeed(int speed) {

    // speed 반영
    this.speed = speed < 0 ? 0 : speed;

    // 조건 따라 gear 변경
    if (speed <= 30) {
      this.gear = 1;
      System.out.println("현재 속도는 " + speed +", " + this.gear + "단 입니다.");
    } else if(speed <= 70){
      this.gear = 2;
      System.out.println("현재 속도는 " + speed +", " + this.gear + "단 입니다.");
    } else {
      this.gear = 3;
      System.out.println("현재 속도는 " + speed +", "+ this.gear + "단 입니다.");
    }


  }
  public void checkSpeed() {
    System.out.println(this.speed);
  }
}
