package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        char[] symbols = name.toCharArray();
        if (!name.isEmpty() && Character.isLowerCase(symbols[0])) {
            for (int i = 1; i < symbols.length; i++) {
                if (!(isSpecialSymbol(symbols[i]) || isUpperLatinLetter(symbols[i])
                        || isLowerLatinLetter(symbols[i]) || Character.isDigit(symbols[i]))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
