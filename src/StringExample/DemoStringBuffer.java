package StringExample;

/**
 * Свойства объекта StringBuffer
 *
 * При создании объекта StringBuffer конструктор по умолчанию автомати-
 * чески резервирует некоторый объем памяти (16 символов), что в дальнейшем поз-
 * воляет быстро менять содержимое объекта, оставаясь в границах участка памяти,
 * выделенного под объект. Размер резервируемой памяти при необходимости мож-
 * но указывать в конструкторе. Если длина строки StringBuffer после измене-
 * ния  превышает  его  размер,  то  ёмкость  объекта  автоматически  увеличивается,
 * оставляя  при  этом  резерв  для  дальнейших  изменений.  С  помощью  метода  re-
 * verse() можно быстро изменить порядок символов в объекте.
 *
 */
public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("длина ->" + sb.length());
        System.out.println("размер ->" + sb.capacity());
//      sb = "Java"; ошибка, только для класса String
        sb.append("Java");
        System.out.println("строка ->" + sb);
        System.out.println("длина ->" + sb.length());
        System.out.println("размер ->" + sb.capacity());
        System.out.println("реверс ->" + sb.reverse());
    }
}
