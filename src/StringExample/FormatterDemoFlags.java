package StringExample;

import java.util.Formatter;

/**
 * Применение флагов форматирования
 */
public class FormatterDemoFlags {
    public static void main(String[] args) {
        Formatter f = new Formatter();
//      выравнивание вправо
        f.format("|%10.2f|", 123.123);
        System.out.println(f);
//      выравнивание влево, применение флага '-'
        f = new Formatter();
        f.format("|%-10.2f|", 123.123);
        System.out.println(f);
//      применение флага '' и '('
        f = new Formatter();
        f.format("% (d", -100);
        System.out.println(f);
//      применение флага ','
        f = new Formatter();
        f.format("%,.2f", 123456789.34);
        System.out.println(f);
//      задание точности представления чисел
        f = new Formatter();
        f.format("%.4f", 1111.1111111);
        System.out.println(f);
//      задание точности представления для строк
        f = new Formatter();
        f.format("%.16s", "Now I know class java.util.Formatter");
        System.out.println(f);

    }
}
