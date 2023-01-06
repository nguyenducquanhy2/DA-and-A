package DynamicArray;


import java.util.HashMap;

public class dynamicArrayImp<T extends Comparable > implements DynamicArray<T> {

    private T[] Arr;
    private int DEFAULT_CAPACITY = 10;
    private int CAPACITY = 0;
    private int size = 0;

    public dynamicArrayImp() {

        Arr = (T[]) (new Comparable[DEFAULT_CAPACITY]);
        CAPACITY = DEFAULT_CAPACITY;
    }

    public dynamicArrayImp(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException();
        else {
            this.CAPACITY = capacity;
            Arr = (T[]) (new Object[CAPACITY]);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) return true;
        return false;
    }

    @Override
    public void push(T elem) {
        if (size == (CAPACITY - 1)) {
            changeSizeArray();
            Arr[size++] = elem;
        } else {
            Arr[size++] = elem;
        }
    }

    @Override
    public void addAt(T elem, int index) {
        if (size == CAPACITY) changeSizeArray();


        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        else if (index == size) push(elem);
        else {
            T[] newArr = (T[]) new Object[size++];

            int j = 0;
            for (int i = 0; i < size; i++) {
                if (j == index) {
                    newArr[i] = elem;
                } else {
                    newArr[i] = Arr[j++];
                }
            }
            Arr = newArr;
        }
    }

    @Override
    public void remove(T elem) {
        int index = indexOf(elem);
        removeAt(index);
    }

    @Override
    public void removeAt(int indexRemove) {
        int count = 0;
        int sizeArr = size;
        T[] newArr = (T[]) new Object[size - 1];
        int j = 0;
        for (int i = 0; i < sizeArr; i++) {
            if (count == indexRemove) {
                j++;
            } else {
                newArr[i] = Arr[j++];
                count++;
            }
        }
        size--;
        Arr = newArr;
    }

    private int indexOf(T elem) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (Arr[i] == elem) return count;
            count++;
        }
        return -1;
    }

    @Override
    public boolean contains(T elem) {
        for (int i = 0; i < size; i++) {
            if (Arr[i] == elem) return true;
        }
        return false;
    }

    @Override
    public T containsIndexOf(T elem) {

        for (int i = 0; i < size; i++) {
            if (Arr[i] == elem) return Arr[i];
        }
        return null;
    }

    @Override
    public T get(int index) {
        return Arr[index];
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            Arr[i] = null;
        }
        size = 0;
    }

    @Override
    public void sortASC() {
        T[]arr=Arr;
        mergeSort(arr,0,size()-1);
        //radix(arr,size());
    }

    @Override
    public T getMax() {
        return getMaxx(Arr);
    }

    private void changeSizeArray() {
        CAPACITY *= 2;
        T[] newArr = (T[]) new Comparable[CAPACITY];
        for (int i = 0; i < size; i++) {
            newArr[i] = Arr[i];
        }
        Arr = newArr;
    }

    private void mergeSort(T[]arr,int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            mergeSort(arr,left, mid);
            mergeSort(arr,mid + 1, right);
            meger(arr,left, mid, right);
        }


    }

    private void meger(T[]Arr,int left, int mid, int right) {

        if (Arr != null) {
            int i = left;
            int j = mid + 1;
            T[] temp = (T[])new Comparable[right - left + 1];
            int p = 0;

            while (!(i > mid && j > right)) {
                    if ((j>right)||((Arr[i].compareTo(Arr[j])) < 0 && (i <= mid) && (j <= right)) ){
                    temp[p++]=Arr[i++];
                }
                else temp[p++]=Arr[j++];
            }

            for (int index = 0; index < p ; index++) {
                Arr[left+index]=temp[index];
            }

        }

    }
//
//    private void sort(T arr[], int n, int place) {
//
//        dynamicArrayImp<Integer> keyName = new dynamicArrayImp<Integer>();
//        HashMap<Integer, dynamicArrayImp<Integer>> hashRadix = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            int lenght=arr[i].toString().length();
//            int key=-1;
//            key = Integer.parseInt(String.valueOf(arr[i].toString().charAt(lenght-place)));
//            if (key >= 0 && key <= 9) {
//                if (hashRadix.get(key) == null) {
//                    keyName.push(key);
//                    hashRadix.put(key, new dynamicArrayImp<Integer>());
//                    hashRadix.get(key).push(arr[i]);
//                } else {
//                    hashRadix.get(key).push(arr[i]);
//                }
//            } else {
//                if (hashRadix.get(key) == null) {
//                    keyName.push(key);
//                    hashRadix.put(key, new dynamicArrayImp<Integer>());
//                    hashRadix.get(key).push(arr[i]);
//                } else {
//                    hashRadix.get(key).push(arr[i]);
//                }
//            }
//        }
//        keyName.sortASC();
//
//        int indexArr = 0;
//        for (int i = 0; i < keyName.size(); i++) {
//
//            dynamicArrayImp<Integer> value = hashRadix.get(keyName.get(i));
//            for (int j = 0; j < value.size(); j++) {
//                arr[indexArr++] = value.get(j);
//            }
//        }
//    }
//
//    private void radix(T[]arr,int n) {
//
//        T maxOfArr = getMaxx(arr);
//        int digit = String.valueOf(maxOfArr).length();
//        int place = 0;
//
//        for (int i = 0; i < digit; i++) {
//            sort(arr, n, place);
//            place ++;
//        }
//    }
    private T getMaxx(T[]arr)
    {
        T max=Arr[0];
        int result;
        for (int i = 1; i < size(); i++) {
            result=max.compareTo(Arr[i]);
            if (result<0) max=Arr[i];
        }
        return max;
    }
}
