import A;
import B;

public class D implements A, B {
    private int x;
    private int y;
    private int z;

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
    public void incrementarXZ() {
        x++;
        z++;
    }
    public void incrementarYZ() {
        y++;
        z++;
    }
    public void incrementarZ() {
        z++;
    }
    public void mostrar() {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }
}
