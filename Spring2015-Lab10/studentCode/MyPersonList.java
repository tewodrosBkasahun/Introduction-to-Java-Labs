package studentCode;

import java.util.ArrayList;


/*
 * This class is what you need to implement for this lab.
 * 
 * The Person interface has been written as have some classes that
 *   implement the interface.
 */


public class MyPersonList {
	ArrayList<Person> people;

	
	
	/**
	 * Instantiates the "people" variable as a new ArrayList of
	 * references to Person objects.
	 */
	public MyPersonList(){
		 people = new ArrayList<Person>();
	
	}
	
	/**
	 * A copy constructor which makes a deep copy considering the fact that
	 * a Person object is mutable.
	 */
	public MyPersonList(MyPersonList other) {
		ArrayList<Person>pepo = new  ArrayList<Person>();
		for(Person n :other.people ) {
			pepo.add(n.copyMe()); 
			}
		this.people=pepo;
		 
	}
	
	
	/** Adds the object referenced by the parameter to the end of the list.  
	 *  With ArrayList this will be much shorter in terms of code than last 
	 *  time.  
	 *  
	 *  Note that you want to make sure that you don't just do a reference 
	 *  copy of the newMember Person since it is mutable.
	 */
	public void addItem(Person newMember){	
		
		people.add(newMember.copyMe());
	}
	
	/** Gives each person in the list a raise of $1000.  
	 * 
	 *  Note that the objects are mutable, which means you can use a 
	 *  for-each style loop as you update.
	 */
	public void giveRaises(){
		 for (int i=0;i<people.size();i++) {
		 people.get(i).acceptRaise(1000);
		 }
	}
	
	/** Returns the sum of the salaries of all people in the list.
	 */
	public int getTotalOfSalaries(){
		int total =0;
		for(int i=0; i<this.people.size(); i++) {
			total= total + this.people.get(i).getSalary();
			
		}
		return total;
	}

	/** Returns the number of people in the list with a name
	 *  that matches the parameter (possibly 0 people).
	 */
	public int count(String searchName){
		int num =0;
		for(int i=0; i<this.people.size(); i++) {
			if(people.get(i).getName().equalsIgnoreCase(searchName)){
				num++;
			}
			
		}
		return num;
	}
	
	/** Removes ALL people from the list whose names match the parameter
	 *  (possibly more than one person).  
	 *  
	 *  Consider that a for-each style loop cannot be used unless you 
	 *  create a shadow.  There are code examples in the posted slides 
	 *  that will be useful here.
	 */
	public void remove(String removeName){
	
		for(int i=0; i<this.people.size(); i++) {
			if(people.get(i).getName().equals(removeName)){
				people.remove(i);

			}
	    }
	}
	
}




