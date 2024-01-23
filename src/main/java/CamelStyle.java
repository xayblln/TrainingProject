
public class CamelStyle {
    public static String camelCase(String input) {
        StringBuilder sbNewStr = new StringBuilder();
        input.chars()
                .mapToObj(el -> (char) el)
                .forEach(el -> {
                    if (sbNewStr.length() != 0 && Character.isUpperCase(el)) {
                        sbNewStr.append(" ");
                    }
                    sbNewStr.append(el);
                });
        return sbNewStr.toString();
    }

    public static String camelCase2(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
