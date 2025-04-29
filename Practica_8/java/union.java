public interface A {
    void incrementarXZ();
    void incrementarZ();
}
public interface B {
    void incrementarYZ();
    void incrementarZ();
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
	public void incrementarYZ() {
		y++;
		z++;		
	}
	@Override
	public void incrementarXZ() {
		x++;
		z++;
	}
	@Override
	public void incrementarZ() {
		z++;
	}
	
	@Override
	public String toString() {
	    return "D{x=" + x + ", y=" + y + ", z=" + z + "}";
	}
	
}
