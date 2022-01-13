import java.text.DecimalFormat;

/**
 * ComplexNumber models complex numbers in mathematics.
 * 
 * @author TODO:  Anthony Narlock
 */
public class ComplexNumber {

    // TODO: All the member variables and methods required to implement the ADT.
	private double real, imaginary;

    /* NOTE: Do NOT implement the angle() operation. Either leave it as a stub
     * or leave it out altogether. */

	public void set(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public ComplexNumber add(ComplexNumber other) {
		ComplexNumber addedComplexNumber = new ComplexNumber();
		addedComplexNumber.real = this.real + other.real;
		addedComplexNumber.imaginary = this.imaginary + other.imaginary;
		return addedComplexNumber;
		
	}
	
	public ComplexNumber subtract(ComplexNumber other) {
		ComplexNumber subComplexNumber = new ComplexNumber();
		subComplexNumber.real = this.real - other.real;
		subComplexNumber.imaginary = this.imaginary - other.imaginary;
		return subComplexNumber;
	}
	
	public ComplexNumber mult(ComplexNumber other) {
		ComplexNumber multComplexNumber = new ComplexNumber();
		multComplexNumber.real = (this.real * other.real) - (this.imaginary * other.imaginary);
		multComplexNumber.imaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
		return multComplexNumber;
	}
	
	public ComplexNumber div(ComplexNumber other) {
		ComplexNumber divComplexNumber = new ComplexNumber();
		divComplexNumber.real = (this.real * other.real + this.imaginary * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary);
		divComplexNumber.imaginary = (this.imaginary * other.real - this.real * other.imaginary) / (other.real * other.real + other.imaginary * other.imaginary);
		return divComplexNumber;
	}
	
	public double abs() {
		return Math.sqrt((this.real * this.real) + (this.imaginary * this.imaginary));
	}
	
    // Utilities
    @Override
    public String toString() {
        var df = new DecimalFormat("0.####E0");
        return "" + df.format(real) + " + " + df.format(imaginary) + "i";
    }
}
