package StringExample;
/**
 * Передача строки по ссылке
 *
 * Так как объект был передан по ссылке, то любое изменение объекта в методе
 * должно сохраняться и для исходного объекта, так как обе ссылки равноправны.
 * Этого  не  происходит  по  той  причине,  что  вызов  метода  concat(String  s)
 * приводит к созданию нового объекта.
*/

public class RefString {
    public static void changeStr(String s) {
        s.concat(" Microsystems");
    }
    public static void main(String[] args){
        String str = new String("Sun");
        changeStr(str);
        System.out.println(str);
    }
}
