// E = generics(atributos com qualquer tipo de valor str, int )

public class Pill<E>{
    private Object[] vector;
    private int top;

    public Pilha<E>(int capacty){
        this.vector = new Object[capacty];
        this.top = -1;
    }
    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(top == vector.length -1)
            return true;
        else
            return false;
    }
    public void put(E info){
        top++;
        vector[top] = info;
    }
    public E pop(){
        return (E)vector[top-1];
    }
    public E peek(){
        return (E)vector[top];
    }
}