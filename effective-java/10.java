// equals는 일반 규약을 지켜 재정의하라

// 대칭성 위배 x.equals(y) != y.equals(x)
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
    if (o instanceof String) return s.equalsIgnoreCase((String) o);

    return false;
  }
}

// 추이성 위배 null이 아닌 모든 참조 값 x, y에 대해 x.equals(y)가 true고 y.equals(z)도 true면 x.equals(z)도 true다
@Override public boolean equals(Object o) {
  if (!(o instanceof Point))
    return false;
  
  // o가 일반 Point면 색상을 무시하고 비교한다.
  if (!(o instanceof ColorPoint))
    return o.equals(this);

  // o가 ColorPoint면 색상까지 비교한다.
  return super.euqlas(o) && ((ColorPoint) o).color == color;
}