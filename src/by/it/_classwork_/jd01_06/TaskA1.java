package by.it._classwork_.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder modifyText = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(modifyText);
        while (matcher.find()) {
            int startWordPosition = matcher.start();
            int nextSymbolPosition = matcher.end();
            int length = nextSymbolPosition - startWordPosition;
            modifyText.setCharAt(startWordPosition + 3, '#');
            if (length >= 7) {
                modifyText.setCharAt(startWordPosition + 6, '#');
            }
        }
        System.out.println(modifyText);
    }
}
