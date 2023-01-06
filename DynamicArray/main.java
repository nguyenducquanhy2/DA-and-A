package DynamicArray;

import java.util.Random;
import java.util.Stack;

public class main {
    public static void main(String[] args) {

        Random r=new Random();

        dynamicArrayImp arr=new <Integer>dynamicArrayImp();

        for (int i = 0; i < 100; i++) {
            arr.push(r.nextInt(100));
        }

        for (int i = 0; i <arr.size() ; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.clear();
        if (arr.isEmpty())
            System.out.println("empty");



    }
}
