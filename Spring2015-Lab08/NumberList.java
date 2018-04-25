
public class NumberList {

	public int[] values;  
	
	//Constructor for an empty list (provided for you)
	public NumberList() {
		values = new int[0];
	}
	
	//Constructor passed in an array - don't just copy the reference!
	public NumberList(int[] a) {
		values = new int [a.length];
		for (int i=0;i<a.length;i++) {
			values[i]=a[i];
		}	
	}
	
	//Copy constructor
	//  (code provided for you but uses your array-based constructor)
		public NumberList(NumberList original) {
			values=new int[(original.values.length)];
			for (int i=0;i<original.values.length;i++) {
				values[i]=(original.values)[i];
			}
	}
	
	//Size getter
	public int getSize() {
			
		//YOUR CODE HERE
		return values.length;
		
		
	}
	
	//Single-value getter
	public int getAt(int index) {

		//YOUR CODE HERE
		return values[index];
		
	}
	
	//Process the values to get the sum
	public long getSum() {
		long sum =0l;
		for (int i=0;i<getSize();i++) {
			sum=sum+values[i];
		}
		return sum;
	}
	
	//See if the given value is anywhere within the array
	public boolean contains(int searchVal) {
		boolean found = false; //HINT PART 1!!!
		
		for (int i=0;i<getSize();i++) {
			if ((values[i]==searchVal)) {
				
				found =true;
				return found ;
			}
		}

		//YOUR CODE HERE
		
		return found; //HINT PART 2!!!
	}
	
	//Add a new element at the end of the list - the array must "grow" somehow first!
	public void add(int newValue) {
		int[] newBiggerArray = new int[values.length + 1];
		//YOUR CODE HERE - THINK ABOUT HOW TO USE THE ARRAY CREATED ABOVE
		for (int i=0;i<values.length;i++) {
			newBiggerArray[i]=values[i];
		}	
		newBiggerArray[values.length]=newValue;
		values= new int [newBiggerArray.length];

	}
	
}
