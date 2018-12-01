class Vodafone implements Sim {
	public void makeCall(long mobNo){
		System.out.println("Calling to ..."+ mobNo);
	}
	public void sendSms(String msg, long mobNo){
		System.out.println("Send sms to..."+ mobNo);
	}
}
