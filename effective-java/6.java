// 불필요한 객체 생성을 피하라

import java.util.regex.Pattern;

// 성능을 훨씬 더 끌어올릴 수 있다!
static boolean isRomanNumeral(String s) {
  return s.matches("^(?=.)M*(C[MD] !D?C{0,3})"
    + "(X[CL]L?X{0,3})(I[XV]V?I{0,3})$");
}

// 값비싼 객체를 재사용해 성능을 개선한다
public class RomanNumerals {
  private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD] !D?C{0,3})"
    + "(X[CL]L?X{0,3})(I[XV]V?I{0,3})$");
  
  static boolean isRomanNumeral(String s) {
    return ROMAN.matcher(s).matches();
  }
}

private static long sum() {
  Long sum = 0L; // for문 마다 Long 인스턴스 생성 long으로 바꾸면 훨씬 빨라짐
  for (long i = 0; i <= Integer.MAX_VALUE; i++)
    sum += i;
  
  return sum;
}




