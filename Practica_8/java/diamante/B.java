package Diamante;

public interface B {
    default void incrementarZ() {
        System.out.println("B: incrementando Z");
    }

    void incrementarYZ(); 
}
