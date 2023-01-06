package Stack;

public class main {

    public static void main(String[] args) {
        stack stack=new stack();

        stack.push(7);
        stack.push(2);
        stack.push(8);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println("--------------------");
        System.out.println(stack.pop());
        stack.clear();
        System.out.println(stack.pop());



    }
}
