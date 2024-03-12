// private 생성자나 열거 타입으로 싱글턴임을 보증하라
public class Elvis {

  public static final Elvis INSTANCE = new Elvis();

  private Elvis() {}
}

public class Evlis {

  private static final Elvis INSTANCE = new Elvis();

  private Elvis() {}

  public static Elvis getInstance() {
    return INSTANCE;
  }
}

public enum Elvis {
  INSTANCE,
}
