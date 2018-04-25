package studentCode;


/*
 * This class is what you need to implement for this lab.
 * 
 * The Person interface has been written as have some classes that
 *   implement the interface.
 */


public class MyPersonList {
	Person[] people;

	
	
	/**
	 * Instantiates the "people" variable as a new (0-length) array of
	 * references to Person objects.
	 */
	public MyPersonList(){
		people = new Person[0];
	}
	
	/**
	 * A copy constructor which makes a deep copy considering that fact that
	 * a Person object is mutable.  
	 * 
	 * Also, since you don't know which of the classes that might implement 
	 * the Person interface is the type of the object being referenced in 
	 * each position, you'll want to think about how to use the copyMe() 
	 * method that the interface requires.
	 */
	public MyPersonList(MyPersonList other) {
		 
		 people = new Person[other.people.length];
		 for (int i=0;i<people.length;i++) {
			 people[i] = other.people[i].copyMe();
		 }
		
	}
	
	
	/** Adds the object referenced by the parameter to the end of the list.  
	 *  You'll need to create a new array that's one space longer.  
	 *  
	 *  Note that you want to make sure that you don't just do a reference 
	 *  copy of the new-to-add Person object since it is mutable but you 
	 *  also don't want to make unnecessary copies of objects that have
	 *  already been copied into the internal list previously.
	 */
	public void addItem(Person newMember){	
		
	Person[] people1 = new Person[ this.people.length+1];
		
		 for (int i=0;i<people1.length;i++) {
			 if (i==people1.length-1) {
				 people1[i]= newMember;
			 }else {
			 people1[i] = people[i].copyMe();	}
		 }
		 
		this.people = people1; 
	}


	/** Gives each person in the list a raise of $1000
	 */
	public void giveRaises(){
		int n=1000;
		for(int i=0; i<this.people.length; i++) {
			this.people[i].acceptRaise(n);
		
		}
		
	}
	
	
	/** Returns the sum of the salaries of all people in the list.
	 */
	public int getTotalOfSalaries(){
		int total =0;
		for(int i=0; i<this.people.length; i++) {
			total= total + this.people[i].getSalary();
			
		}
		return total;
	}

	
	/** Returns the number of people in the list with a name
	 *  that matches the parameter (possibly 0 people).
	 */
	public int count(String searchName){
		int num =0;
		for(int i=0; i<this.people.length; i++) {
			if(people[i].getName().equalsIgnoreCase(searchName)){
				num++;
			}
			
		}
		return num;
	}
	
	
	/** Removes ALL of the people from the list whose names match the 
	 *  value referenced by the parameter (possibly more than one person).  
	 *  This should also "shrink" the array if anyone is removed but do 
	 *  so in a way that doesn't create new objects if existing ones are 
	 *  fine to use.
	 */
	public void remove(String removeName){
		int l=0;
		int c=0;
		int d=0;
		
		int remaing = this.people.length-count(removeName);
		Person[] people2 = new Person[ count(removeName)];
		Person[] people3 = new Person[remaing];
		for(int i=0; i<this.people.length; i++) {
			if(people[i].getName().equals(removeName)){
				people2[c]=people[i];
				c++;
			}else {
				people3[d]=this.people[i];
				d++;
			}
			
		}
	
	people=people3;
	
	}
}




