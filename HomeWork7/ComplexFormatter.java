public class ComplexFormatter implements ComplexFormatterable {
    public String getAlgebraicView(ComplexNumber number) {	
		int x = number.getRealPart();
		int y = number.getImaginaryPart();
		
		return String.format("z = %d + i * %d", x, y);	
    }

}
