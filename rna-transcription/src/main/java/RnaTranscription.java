class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            switch (dnaStrand.charAt(i)) {
                case 'G':
                    sb.append('C');
                    break;
                case 'C':
                    sb.append('G');
                    break;
                case 'T':
                    sb.append('A');
                    break;
                case 'A':
                    sb.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("A/T/G/C expected.");
            }
        }
        return sb.toString();
        
    }

}
