package StringExample;

/**
 * Сравнение ссылок и объектов
 *
 * Т.к. в Java все ссылки хранятся в стеке, а объекты – в куче, то при создании
 * объекта s2 сначала создается ссылка, а затем этой ссылке устанавливается в со-
 * ответствие  объект.  В  данной  ситуации  s2  ассоциируется  с  уже  существующим
 * литералом, так как объект s1 уже сделал ссылку на этот литерал. При создании
 * s3 происходит вызов конструктора, то есть выделение памяти происходит рань-
 * ше инициализации, и в этом случае в куче создается новый объект.
 */
public class EqualStrings {
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 + "==" + s2 + " : " + (s1 == s2)); //true
        System.out.println(s1 + "==" + s3 + " : " + (s1 == s3)); //false
        System.out.println(s1 + " equals " + s2 + " : "
                            + s1.equals(s2));//true
        System.out.println(s1 + " equals " + s3 + " : "
                + s1.equals(s3));//true

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
