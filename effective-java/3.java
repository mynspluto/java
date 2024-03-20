// private 생성자나 열거 타입으로 싱글턴임을 보증하라

// public static final 필드 방식의 싱글턴
public class Elvis {

  public static final Elvis INSTANCE = new Elvis();
  private Elvis() {}

  public void leaveTheBuilding() { ... }
}

// 정적 팩터리 방식의 싱글턴
public class Elvis {

  private static final Elvis INSTANCE = new Elvis();
  private Elvis() {}
  public static Elvis getInstance() {
    return INSTANCE;
  }

  public void leaveTheBuilding() { ... }
}

// 열거 타입 방식의 싱글턴
public enum Elvis {
  INSTANCE;

  public void leaveTheBuilding() { ... }
}
