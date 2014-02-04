package StringExample;

/**
 * Применение intern()
 *
 * В  данной  ситуации  ссылка  s1  инициализируется  литералом,  обладающим
 * всеми свойствами объекта  вплоть до вызова методов.  Вызов метода intern()
 * организует поиск соответствующего значению объекта s2 литерала и при поло-
 * жительном результате  возвращает ссылку  на  найденный литерал, а  при отрица-
 * тельном – заносит значение в пул и возвращает ссылку на него.
 */
public class DemoIntern {
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = new String ("Java");
        System.out.println(s1 == s2);//false
        s2 = s2.intern();
        System.out.println(s1 == s2);//true
    }
}
