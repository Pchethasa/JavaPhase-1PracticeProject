package p1;

public class AccessDemo {
	public void publicMethod() {
		System.out.println("This is public method");
	}
	
	private void privateMethod() {
		System.out.println("This is private method");
	}
	
	protected void protectedMethod() {
		 System.out.println("This is protected method");
	}
	
	void defaultMethod() {
		System.out.println("This is default method");
	}
	
	public static void main(String[] args) {
		AccessDemo accessmod=new AccessDemo();
		accessmod.publicMethod();
		accessmod.privateMethod();
		accessmod.protectedMethod();
		accessmod.defaultMethod();
		
	}
	 
}


