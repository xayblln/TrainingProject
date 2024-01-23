import org.apache.commons.text.WordUtils;
public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        StringBuilder sbJadenPhrase = new StringBuilder(phrase);
        for (int counter = 0; counter < sbJadenPhrase.length() - 1; counter++) {
            if (counter == 0 || Character.isSpaceChar(sbJadenPhrase.charAt(counter - 1))) {
                sbJadenPhrase.charAt(counter);
                sbJadenPhrase.setCharAt(counter, sbJadenPhrase.substring(counter, counter + 1).toUpperCase().charAt(0));
            }
        }
        return sbJadenPhrase.toString();
    }
    public static String toJadenCaseOtherWay(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        return WordUtils.capitalize(phrase);
    }
}
