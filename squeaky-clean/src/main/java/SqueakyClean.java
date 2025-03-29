import java.util.Map;

class SqueakyClean {
  private static final Map<Character, Character> LEETSPEAK_TO_NORMAL = Map.of(
    '4', 'a',
    '3', 'e',
    '0', 'o',
    '1', 'l',
    '7', 't'
  );

  static String clean(String identifier) {
    var sb = new StringBuilder();
    boolean toUpper = false;
    for (int i = 0; i < identifier.length(); i++) {
      char c = identifier.charAt(i);
      if (c == ' ') {
        sb.append('_');
      }
      else if (c == '-') {
        toUpper = true;
      }
      else if (LEETSPEAK_TO_NORMAL.containsKey(c)) {
        sb.append(LEETSPEAK_TO_NORMAL.get(c));
      }
      else if (Character.isLetter(c)) {
        sb.append(toUpper ? Character.toUpperCase(c) : c);
        toUpper = false;
      }
    }
    return sb.toString();
  }
}
