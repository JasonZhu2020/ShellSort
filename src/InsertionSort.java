import java.util.Arrays;

public class InsertionSort<E extends Comparable<E>> {

    public InsertionSort(){}

    public static<E extends Comparable<E>> void sort(E[] data){
        //插入排序每次将一个元素插入到他应该在的那个位置，例如第三次插入则前三个元素是顺序对
        for(int i = 1; i < data.length; i++){

            for(int j = i; j >= 1; j --){
                if(data[j].compareTo(data[j - 1]) < 0)
                    swap(data, j, j - 1);
                else break;
            }
        }
    }

    public static<E extends Comparable<E>> void sort2(E[] data){

        for(int i = 1; i < data.length; i++){
            E res = data[i];
            int j;
            for(j = i; j >= 1; j --){
                if(res.compareTo(data[j - 1]) < 0)
                    data[j] = data[j - 1];
                else break;
            }
            data[j] = res;
        }
    }

    private static<E> void swap(E[] data, int i, int j){
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

}
