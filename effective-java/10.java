public final class CaseInsenstiveString {

  private final String s;

  public CaseInsenstiveString(String s) {
    this.s = Objects.requireNonNull(s);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof CaseInsenstiveString) return s.equalsIgnoreCase(
      ((CaseInsenstiveString) o).s
    );

    return false;
  }
}
