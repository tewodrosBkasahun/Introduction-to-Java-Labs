package cellPhones;

public class SmartPhone extends TextMessagingPhone {
	
	public SmartPhone(String ownerIn) {
		
		//Invoke the super class' copy constructor and send it owner
		super(ownerIn);
		//NOTE: There's nothing else to do since SmartPhone adds no
		//      new fields.

	}
	public String displayPicture(String pictureSubject) {
		//return a String of the form:
		//    owner's name " now displaying picture of " pictureSubject
		
		
          String pic =   ownerName + " now displaying picture of " + pictureSubject;
		return pic;
	}
	/* 
	 * This method OVERRIDES the inherited receiveCall method.
	 * Smartphones "display" a photo of the caller.
	 */
	@Override
	public String receiveCall(CellPhone sender) {
		//return a String built from:
		//    the result of calling displayPicture with the sender's owner's 
		//    name concatenated with a dash and then concatenated with the
		//    result of invoking the superclass' receiveCall with the sender

		String call = this.displayPicture(sender.ownerName) + "-" + super.receiveCall(sender);
		return call;
		
	}


		
	public String receivePictureAndTextMessage(
			SmartPhone sender, String messageText, String picDescription) {
		//owner receives messageText from sender with picDescription
		
		//return a String built from:
		//    the result of calling displayPicture with the picDescription 
		//    concatenated with a dash and then concatenated with the
		//    result of invoking the receiveText method with the sender
		//    and the messageText

		String call = displayPicture(picDescription) + "-" + receiveText(sender, messageText);
		return call;
	}

	

	public String sendPictureAndTextMessage(
			SmartPhone receiver, String messageText, String picDescription) {
		//owner sends messageText to receiver with picDescription
	return	receiver.receivePictureAndTextMessage( this, messageText, picDescription);
		//return a String built by having the receiver invoke the
		//   receivePictureAndTextMessage method, sending in the 
		//   current phone, the messageText, and the picture description

		
	}
}
