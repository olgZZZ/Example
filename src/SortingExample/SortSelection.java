package SortingExample;

/**
 * Sorting an array of random numbers "Selection method"
 */
public class SortSelection {
    public static void main(String[] args){
        double[] random = new double[10];
        int[] a = new int[10];
        for (int i = 0; i < random.length; i++){
            random[i] = Math.floor(Math.random() * 10);
            a[i] = (int)random[i];
            System.out.print(a[i] + "  ");
        }

    for (int i = 0; i < a.length; i++){
/**
 * Предполагаем, что начальный элемент рассматриваемого
 * фрагмента и будет минимальным.
 */
        int min = a[i];// Предполагаемый минимальный элемент
        int imin = i;// Индекс минимального элемента
/**
 * Просматриваем оставшийся фрагмент массива и ищем там
 * элемент, меньший предположенного минимума.
 */
        for (int j = i+1; j < a.length; j++) {

/**
 * Если находим новый минимум, то запоминаем его индекс.
 * И обновляем значение минимума.
 */
            if (a[j] < min) {
                min = a[j];
                imin = j;
            }
        }
/**
 * Проверяем, нашёлся ли элемент меньше, чем стоит на
 * текущей позиции. Если нашёлся, то меняем элементы местами.
 */

        if (i != imin) {
            int temp = a[i];
            a[i] = a[imin];
            a[imin] = temp;
        }
    }
//      Выводим значения
        System.out.println(" ");
        for (int i = 0; i < a.length; i++){
             System.out.print(a[i] + "  ");
        }


    }


}
