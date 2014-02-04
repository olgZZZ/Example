package StringExample;

import java.util.Formatter;

/**
 * Форматирование текста по формату %S, %c
 */
public class SimpleFormatString {
    public static void main(String[] args){
        Formatter f = new Formatter();
f.format("This %s is about %n%S %c", "book", "java", '6');
        System.out.print(f);

    }
}
