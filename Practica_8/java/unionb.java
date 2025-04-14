public interface A {
    default void incrementarZ() {
        System.out.println("A: incrementando Z");
    }
    void incrementarXZ(); 
}
public interface B {
    default void incrementarZ() {
        System.out.println("B: incrementando Z");
    }
    void incrementarYZ(); 
}
public class D implements A, B {
    public int x;
    public int y;
    public int z;

    public D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void incrementarXYZ() {
        x++;
        y++;
        z++;
    }
    @Override
    public void incrementarXZ() {
        x++;
        z++;
    }
    @Override
    public void incrementarYZ() {
        y++;
        z++;
    }
    @Override
    public void incrementarZ() {
        A.super.incrementarZ();
        B.super.incrementarZ();
        z++;
    }
}