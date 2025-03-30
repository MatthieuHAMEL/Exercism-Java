public class Twofer {
    public String twofer(String name) {
        return String.format("One for %s, one for me.", name == null ? "you" : name);
        // NB : exercism feedback is that "format is slow" compared to string concatenation. 
        // So the following is probably better : 
        // return "One for " + ((name == null) ? "you" : name) + ", one for me."
    }
}
