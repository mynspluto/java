public class EnumExample {
  public static void main(String[] args) throws Exception {
   
    for (enum1 v : enum1.values()) {
      System.out.println(v);
      System.out.println(v.getPrioriry());
    }
  }

  public enum enum1 {
    A(1),
    B(2),
    C(5);

    private int priority;

    enum1(int priority) {
      this.priority = priority;
    }

    public int getPrioriry() {
      return priority;
    }
  }
}