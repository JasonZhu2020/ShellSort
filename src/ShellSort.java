import java.util.Arrays;

public class ShellSort {

    private ShellSort(){}

    public static<E extends Comparable<E>> void sort(E[] data){

        int h = data.length / 2;
        while (h >= 1) {
            // 对data[h,n), 进行插入排序
            for (int i =  h; i < data.length; i ++) {
                E t = data[i];
                int j;
                for (j = i; j >= h; j -= h) {
                    if (t.compareTo(data[j - h]) < 0)
                        data[j] = data[j - h];
                    else break;
                }
                data[j] = t;
            }
            h /= 2;
        }
    }

    public static<E extends Comparable<E>> void sort2(E[] data){

        int h = 1;
        while(h < data.length)
            h = h * 3 + 1;
        while (h >= 1) {
            // 对data[h,n), 进行插入排序
            for (int i =  h; i < data.length; i ++) {
                E t = data[i];
                int j;
                for (j = i; j >= h; j -= h) {
                    if (t.compareTo(data[j - h]) < 0)
                        data[j] = data[j - h];
                    else break;
                }
                data[j] = t;
            }
            h /= 3;
        }
    }

    public static void main(String[] args) {

        int n = 2000000;
        Integer[] arr = ArrayGeneratetor.generateRandomArray(n,n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Integer[] arr3 = Arrays.copyOf(arr, arr.length);

        SortingHelper.sortTest("ShellSort", arr);
        SortingHelper.sortTest("ShellSort2", arr2);
        SortingHelper.sortTest("MergeSort", arr3);

    }

}
