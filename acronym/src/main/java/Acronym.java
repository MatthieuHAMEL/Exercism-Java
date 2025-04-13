class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        // split around unicode whitespace or dash or underscore
        String[] words = this.phrase.split("\\p{Zs}|\\-|_"); 
        StringBuilder acronym = new StringBuilder();
        for (String word: words) {
            if (!word.isEmpty()) {
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return acronym.toString();
    }

}
