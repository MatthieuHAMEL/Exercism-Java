class ReverseString {

    // There are a lot of possible solutions ; here I use StringBuilder ...
    String reverse(String inputString) {
        var sb = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            sb.append(inputString.charAt(i));
        }
        return sb.toString();
    }
  
}
