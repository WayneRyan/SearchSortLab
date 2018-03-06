
public class RationalNumber implements Comparable<RationalNumber> {
	
	private long numerator,denominator;
	
	public RationalNumber(){
		numerator = (long)(Math.random()*10000);
		denominator = (long)(Math.random()*10000);
		while(denominator == 0)denominator = (long)(100);
		reduce();
	}
	
	public RationalNumber(long num, long den){
		numerator = num;
		denominator = den;
		reduce();
	}
	
	public RationalNumber(RationalNumber other){
		this.numerator = other.numerator;
		this.denominator = other.denominator;
	}
	
	private void reduce(){
		if(denominator<0){
			numerator *= -1;
			denominator *= -1;
		}
		long gcd = egcd();
		numerator/=gcd;
		denominator/=gcd;
		if(numerator == 0 && denominator != 0) denominator = 1;
		if(denominator == 0) numerator = 0;
	}
	
	
	public long egcd() {
		long a = Math.abs(numerator);
		long b = denominator;
	    if (a == 0)return b;
	    while (b != 0) {
	        if (a > b) a = a - b;
	        else b = b - a;
	    }
	    return a;
	}	
	
	public String toString(){
		return "" + (((double)numerator)/denominator);
		//return "" + numerator + "/" + denominator;
	}
	
	// reciprocal
	public void reciprocal(){
		if(numerator == 0)return;
		long temp = numerator;
		numerator = denominator;
		denominator = temp;
		reduce();
	}
	// negate
	public void negate(){
		numerator *= -1;
		reduce();
	}
	// add 
	public void add(RationalNumber other){
		long den = this.denominator * other.denominator;
		long num = this.numerator*other.denominator + other.numerator * this.denominator;
		numerator = num;
		denominator = den;
		reduce();
	}
	// subtract
	public void subtract(RationalNumber other){
		other.negate();
		this.add(other);
		other.negate();
	}
	// multiply
	public void multiply(RationalNumber other){
		numerator *= other.numerator;
		denominator *= other.denominator;
		reduce();
	}
	// divide
	public void divide(RationalNumber other){
		other.reciprocal();
		multiply(other);
		other.reciprocal();
	}
	
	public boolean equals(RationalNumber other){
		return this.numerator == other.numerator && this.denominator == other.denominator;
	}

	@Override
	public int compareTo(RationalNumber other) {
		long thisValue = this.numerator * other.denominator;
		long otherValue = other.numerator * this.denominator;
		return (int)(thisValue - otherValue);
	}

}
