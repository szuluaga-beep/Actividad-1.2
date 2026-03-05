

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pila después de hacer push: " + stack);

        int poppedValue = stack.pop();
        System.out.println("Valor removido (pop): " + poppedValue);
        System.out.println("Pila después de hacer pop: " + stack);

        int peekedValue = stack.peek();
        System.out.println("Valor en la cima (peek): " + peekedValue);
        System.out.println("Pila después de hacer peek: " + stack);

    }
}