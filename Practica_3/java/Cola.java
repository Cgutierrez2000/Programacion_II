package Practica_3.java;

public class Cola {
    private long arreglo[];
    private int inicio;
    private int fin;
    private int n;

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n+1];
        this.inicio = 0;
        this.fin = -1;
    }
    public void insert(long e) {
        if (this.fin==this.n) {
            System.out.println("Cola llena");
        } else {
            this.arreglo[this.fin] = e;
            this.fin++;
        }
    }
    public long remove(){
        if(this.inicio==0 && this.fin ==0)
        {
            System.out.println("Cola vacía");
            return -1;
        }else{
            this.inicio += 1;
            long dato= this.arreglo[this.inicio];
            if(this.inicio==this.fin){
                this.inicio = 0;
                this.fin = 0;
            }return dato;
        }
    }
    public  long peek(){
        return this.arreglo[this.inicio+1];

    }
    public boolean isEmpty(){
        return this.inicio==this.fin;
    }
    public boolean isFull(){
        return this.fin==this.n;
    }
    public int size(){
        return this.fin-this.inicio;
    }
    
}
