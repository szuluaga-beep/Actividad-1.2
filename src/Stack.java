import java.util.ArrayList;

public class Stack {
    // Implementación de pila dinámica usando ArrayList

    private final ArrayList<Integer> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }

    public void push(int value) {

        stackList.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Retorna -1 para indicar que la pila está vacía

        } else {
            int value = stackList.get(stackList.size() - 1);
            stackList.removeLast();
            return value;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackList.getLast();
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Retorna -1 para indicar que la pila está vacía
        }
    }

    public boolean isEmpty() {

        return stackList.isEmpty();
    }

    public int size() {
        return stackList.size();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = stackList.size() - 1; i >= 0; i--) {
            sb.append(stackList.get(i));
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("] <- cima");
        return sb.toString();
    }

}
