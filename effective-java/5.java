// 자원을 직접 명시하지 말고 의존 객체 주입을 사용하라
public class SpellChecker {
    private static final Lexicon directory = ...;

    private SpellChecker() {}

    public static boolean isValid(String word) {}
    public static List<String> suggestions(String type) {}
}

