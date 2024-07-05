public class ComplexArithmetic implements ComplexArithmeticable{
    public ComplexNumber add(ComplexNumber num1,ComplexNumber num2){
        int realPart=num1.getRealPart()+num2.getRealPart();
        int imaginaryPart=num1.getImaginaryPart()+num2.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);

    }
    public ComplexNumber multiply(ComplexNumber num1,ComplexNumber num2){
        int x=num1.getRealPart();
        int y=num1.getImaginaryPart();
        int a=num2.getRealPart();
        int b=num2.getImaginaryPart();

        int realPart=x*a-y*b;
        int imaginaryPart=x*b+y*a;
        return new ComplexNumber(realPart, imaginaryPart);
    }
    public ComplexNumber divide(ComplexNumber num1,ComplexNumber num2){
        int x=num1.getRealPart();
        int y=num1.getImaginaryPart();
        int a=num2.getRealPart();
        int b=num2.getImaginaryPart();

        int realPart=Math.round((x*a+y*b)/(a*a+b*b));
        int imaginaryPart=Math.round((y*a-x*b)/(a*a+b*b));
        return new ComplexNumber(realPart, imaginaryPart);
    }


}
