package corejava;

public class DataTypeTest {
 
	public static void main(String[] args) {
		
	long x = 5000000000000L;
	float a = 3.45f;
	byte b = 127;
	
	System.out.println("Byte "+Byte.SIZE+" "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
	System.out.println("Short "+Short.SIZE+" "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
	System.out.println("Int "+Integer.SIZE+" "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
	System.out.println("Long "+Long.SIZE+" "+Long.MIN_VALUE+" "+Long.MAX_VALUE);
	
	System.out.println("Float "+Float.SIZE+" "+Float.MIN_VALUE+" "+Float.MAX_VALUE);
	System.out.println("Double "+Double.SIZE+" "+Double.MIN_VALUE+" "+Double.MAX_VALUE);
	System.out.println("Char "+Character.SIZE+" "+Character.MIN_VALUE+" "+Character.MAX_VALUE);
	
	
}
}
