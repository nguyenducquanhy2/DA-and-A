package BinarySearchTree;

import DynamicArray.dynamicArrayImp;
import myMath.myMath;
public class main {

    public static dynamicArrayImp<Long> data(int n) {

        dynamicArrayImp<Long> arr = new dynamicArrayImp<Long>();
        for (long i = 1; i <= n; i++) {
            arr.push(i);
        }
        return arr;
    }
    public static void addTree(dynamicArrayImp<Long> arr, int index, binarySearchTree<Long> tree) {

        int left = 0;
        int mid = index / 2;
        int right = index;
        tree.add(arr.get(mid));

        addTreeLeft(arr, tree, left, mid);
        addTreeRight(arr, tree, mid + 1, right + 1);

    }

    public static void addTreeLeft(dynamicArrayImp<Long> arr, binarySearchTree<Long> tree, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            tree.add(arr.get(mid));
            addTreeLeft(arr, tree, left, mid);
            addTreeRight(arr, tree, mid + 1, right);
        }
    }

    public static void addTreeRight(dynamicArrayImp<Long> arr, binarySearchTree<Long> tree, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            tree.add(arr.get(mid));
            addTreeLeft(arr, tree, left, mid);
            addTreeRight(arr, tree, mid + 1, right);
        }
    }

    public static void main(String[] args) {

//        int n = 19;
//        binarySearchTree<Long> tree = new binarySearchTree<>();
//        dynamicArrayImp<Long> arr = data(n);
////        for (int i = 0; i < arr.size(); i++) {
////            System.out.println(arr.get(i)+" ");
////        }
////        System.out.println("----------------------------------------");
//        addTree(arr, n - 1, tree);
//        tree.add((long)20);
//        tree.add((long)22);
//        //System.out.println(tree.size());
////        long element=25;
////        if (tree.Contains(element)) System.out.println("Value "+element+" available");
////        for (int i = 0; i <tree.size() ; i++) {
////            if (tree.Contains(arr.get(i))) System.out.println("Value "+arr.get(i)+" available "+i);
////        }
//
//        System.out.println("Tree Size "+tree.size());
//        dynamicArrayImp<Long> traversal=tree.traversal();
//        System.out.println("Size "+traversal.size());
//
//        for (int i = 0; i < traversal.size(); i++) {
//            System.out.print(traversal.get(i)+" ");
//        }
//        System.out.println("----------------------------------------");
//        System.out.println("Tree Height "+tree.height());
        long number1=2;
        long number2=59;

        System.out.println(myMath.pow(number1,number2));

    }
}
