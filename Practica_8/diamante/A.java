package Diamante;

public interface A {
    default void incrementarZ() {
        System.out.println("A: incrementando Z");
    }

    void incrementarXZ(); 
}


