
public class Rational {

	//DATA FIELDS SHOULD GO UP HERE
	private int number,denom;
	
	//Constructor
	public Rational(int numerIn, int denomIn) {
		
		this.number= numerIn;
		this.denom= denomIn ;
	}
	
	//Getters
	public int getNumer() {
		return number;
	}
	
	public int getDenom() {
		return denom;
	}
	
	public String toString() {
	return number+"/"+denom;
	}
	
	public static Rational multiply(Rational a, Rational b) {
	
	int numerator = a.getNumer()*b.getNumer();
	
	int denominator =a.getDenom() *b.getDenom();
		
	return new Rational(numerator,denominator);
	}
	public Rational reciprocal() {
		
		return new Rational(this.denom,this.number)  ;
	}
	
	public Rational divide(Rational a) {
		int numerator  = this.getNumer()*a.getDenom();
		int denominator = this.getDenom()*a.getNumer();
		
		return new Rational(numerator,denominator);
	}
	
	public Rational add(Rational a) {
		int numerator= (this.getNumer()*a.getDenom())+(this.getDenom()*a.getNumer());
		int denominator= (this.getDenom()*a.getDenom());
		return new Rational (numerator,denominator);
	}
	
	
	//NOTE: We are not writing an equals method for this class at this time.
	//      For this reason, do not use assertEquals to try to test whether
	//      two Rational objects are equal in value.
	
}
