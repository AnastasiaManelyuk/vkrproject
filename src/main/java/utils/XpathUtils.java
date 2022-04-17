package utils;

public class XpathUtils {

    public static String or(String... strings) {
        String finalXpath = "";
        if (strings.length == 1)
            return strings[0];
        else
            for (String string : strings) {
                finalXpath = string + " || ";
            }
        return finalXpath;
    }
}
