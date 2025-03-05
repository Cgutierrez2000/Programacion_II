package Practica_3.java;

public class Pila {
    private long arreglo[];
    private int top;
    private int n;

    public Pila(int n) {
        this.n = n;
        arreglo = new long[n];
        top = -1;
    }
    public void push(int e) {
        if (isFull()) {
            System.out.println("Pila llena");
        } else {
            top++;
            arreglo[top] = e;
            
        }
    }
    public long pop(){
        if (isEmpty()) {
            System.out.println("Pila vacia");
            return -1;
        } else {
            long e = arreglo[top];
            top--;
            return e;
        }
    }
    public long peek() {
        return arreglo[top];
        }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (n-1 == top);
    }

}
