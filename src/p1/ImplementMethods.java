package p1;

public class ImplementMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementMethods verifier = new ImplementMethods();
        
        // Calling the method with different arguments
        verifier.printMessage("Hello");
        verifier.printMessage("Hi", 3);
        
        // Verifying the return value of the method
        int sum = verifier.calculateSum(5, 7);
        System.out.println("Sum: " + sum);
        
        // Verifying the behavior of the method
        boolean isEven = verifier.isEvenNumber(10);
        System.out.println("Is even: " + isEven);
    }
    
    public void printMessage(String message) {
        System.out.println(message);
    }
    
    public void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
    
    public int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
    
    public boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}



