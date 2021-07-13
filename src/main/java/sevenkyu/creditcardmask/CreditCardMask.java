package sevenkyu.creditcardmask;

public class CreditCardMask {
    static final String MASKING_CHARACTER = "#";

    public String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        }
        String charsToMask = str.substring(0, str.length() - 5);
        String charsToKeep = str.substring(str.length() - 5);
        String mask = charsToMask.replaceAll(".", MASKING_CHARACTER);
        return mask + charsToKeep;
    }
}
