import java.text.Format;
import java.util.Formatter;

public class ComplexNumber {
    
    private int realPart;
    private int imaginaryPart;
    
    private static ComplexArithmeticable arithmetic=new ComplexArithmetic();
    private static ComplexFormatterable formatter=new ComplexFormatter();
    public ComplexNumber(int realPart, int imaginaryPart) {
        super();
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public int getRealPart() {
        return realPart;
    }
    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }
    public int getImaginaryPart() {
        return imaginaryPart;
    }
    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public static ComplexArithmeticable getArithmetic(){
        return arithmetic;
    }
    public static void setArithmetic(ComplexArithmeticable arithmetic) {
		ComplexNumber.arithmetic = arithmetic;
	}
    public void add(ComplexNumber number){
        ComplexNumber result=arithmetic.add(this, number);
        realPart=result.getRealPart();
        imaginaryPart=result.getImaginaryPart();
    }
    public void multiply(ComplexNumber number){
        ComplexNumber result=arithmetic.multiply(this, number);
        realPart=result.getRealPart();
        imaginaryPart=result.getImaginaryPart();
    }
    public void divide(ComplexNumber number){
        ComplexNumber result=arithmetic.divide(this, number);
        realPart=result.getRealPart();
        imaginaryPart=result.getImaginaryPart();
    }
    public String getAlgebraicView(){


        
        return formatter.getAlgebraicView(this);
    }
}
