// 인스턴스화를 막으려거든 private 생성자를 사용하라

public class UtilityClass {

  private UtilityClass() {
    throw new AssertionError();
  }
}
