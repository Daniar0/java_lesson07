public class Main {
    public static void main(String[] args) {
        
    
    ComplexNumber number1=new ComplexNumber(1, 2);
    ComplexNumber number2=new ComplexNumber(10, 20);
    System.out.println("Complex number: ");
    System.out.println(number1.getAlgebraicView());
		
		System.out.println("");
		
		System.out.println(number2.getAlgebraicView());
		
		System.out.println("");
		
		number1.add(number2);
		
		System.out.println("a + b: ");
		System.out.println(number1.getAlgebraicView());
		
		System.out.println("");
		
	     number1.multiply(number2);
		
		System.out.println("a * b: ");
		System.out.println(number1.getAlgebraicView());
		
		System.out.println("");
		
		number1.divide(number2);
		
		System.out.println("a / b: ");
		System.out.println(number1.getAlgebraicView());
		
	}
}
