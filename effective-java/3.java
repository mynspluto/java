public class Elvais {

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
