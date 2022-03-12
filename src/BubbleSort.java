import java.util.Arrays;

public class BubbleSort<E extends Comparable<E>> {

    private BubbleSort(){}

    public static<E extends Comparable<E>> void sort(E[] data){

        for(int i = data.length - 1; i > 0; i --){
            //对第data[i]的位置放置合适的元素，从最后一个位置开始
            for(int j = 0; j < i; j ++){
                if(data[j].compareTo(data[j + 1]) > 0)
                    swap(data, j, j + 1);
            }

        }

    }

    public static<E extends Comparable<E>> void sort2(E[] data){

        for(int i = data.length - 1; i > 0; i --){
            //对第data[i]的位置放置合适的元素，从最后一个位置开始
            boolean isSwapped = false;
            for(int j = 0; j < i; j ++){
                if(data[j].compareTo(data[j + 1]) > 0){
                    swap(data, j, j + 1);
                    isSwapped = true;
                }
            }
            if(!isSwapped)
                break;

        }

    }
    //冒泡排序的最终版本
    public static<E extends Comparable<E>> void sort3(E[] data){

        for(int i = data.length - 1; i > 0;){
            //对第data[i]的位置放置合适的元素，从最后一个位置开始
            //lastSwappedIndex记录最后交换的索引，这个索引后面的所有元素已经有序
            int lastSwappedIndex = 0;
            for(int j = 0; j < i; j ++){
                if(data[j].compareTo(data[j + 1]) > 0){
                    swap(data, j, j + 1);
                    lastSwappedIndex = j;
                }
            }
            i = lastSwappedIndex;

        }

    }

    private static<E> void swap(E[] data, int i, int j){
        E t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

}
