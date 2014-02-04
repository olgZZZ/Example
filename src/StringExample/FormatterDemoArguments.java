package StringExample;

import java.util.Formatter;

/**
 * Применение порядкового номера аргумента
 */
public class FormatterDemoArguments {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        Number n[] = { 4, 2.2, 3, 1.1 };
        f.format("%4$.1f %2$.1f %3$d %1$d", n[0], n[1],
                n[2], n[3]);
        System.out.println(f);
        System.out.printf("%4$.1f %2$.1f %3$d %1$d", n[0], n[1],
                n[2], n[3]);

    }
}
