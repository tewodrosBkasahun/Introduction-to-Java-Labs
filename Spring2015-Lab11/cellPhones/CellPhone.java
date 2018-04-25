package cellPhones;

public class CellPhone {

	//REMINDER: protected fields can be accessed directly by any
	//          class which extends this one
	protected String ownerName;




	public CellPhone(String ownerNameIn) {
		//initialize ownerName as ownerNameIn
		this.ownerName =ownerNameIn;
		
		
	}

	public String receiveCall(CellPhone sender) {
			
		
		//return a String of the form:
		//    owner's name " is receiving a call from " sender's name
		String recive = this.ownerName + " is receiving a call from " + sender.ownerName;
		return recive;
		
		
		
	}

	public String call(CellPhone receiver) {
		//return a String by using the receiver to invoke receiveCall 
		//  while passing in the current phone
		

		 String Call = receiver.receiveCall(this);        
		    return Call;
		
		
	}
}
