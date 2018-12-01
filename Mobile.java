import java.io.*;
import java.lang.reflect.*;
class Mobile extends InvalidSimException {
	private Sim sim;
	public void insertSim(String simName) throws InvalidSimException,
													ClassNotFoundException,
														InstantiationException,
															IllegalAccessException,
																NoSuchMethodException,
																	InvocationTargetException {

		Class simclass = Class.forName(simName);
		Object simobject = simclass.newInstance();
		if(simobject instanceof Sim){
			sim  = (Sim)simobject;			
		}
		else{
			System.out.println("Invalid Sim card");
		}
	}
	void makeCall(long mobNo){
		System.out.println("Calling to ..."+ mobNo);
	}
	void sendSms(String msg,long mobNo){
		//System.out.println("Msg ::"+msg);
		System.out.println("Send sms to..."+ mobNo);
	}
}
