import java.util.Scanner;
import java.io.*;
import java.lang.reflect.*;
class MobileUser {
	public static void main(String[] args) throws InvalidSimException, 
													ClassNotFoundException,
														IllegalAccessException,
															NoSuchMethodException,
																IOException,
																	InstantiationException,
																		InvocationTargetException{
		Mobile iphone = new Mobile();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String option = "";
		System.out.print("Insert Sim ::");
		String simName = br.readLine();
		if(simName.isEmpty()){
			throw new ClassNotFoundException("Please insert sim.....!!");
		}
		else{
			iphone.insertSim(simName);
			System.out.println("Choose one option ::");
			System.out.println("1. make a call");
			System.out.println("2. send a sms");
			option = br.readLine();
			switch(option){
				case "1":
				{
					Scanner scn = new Scanner(System.in);
					System.out.print("Dial a Number ::");
					long mobNo = scn.nextLong();
					iphone.makeCall(mobNo);
					break;
				}
				case "2":
				{
					Scanner scn = new Scanner(System.in);
					System.out.print("Write a Message ::");
					String msg = br.readLine();
					System.out.print("Enter mobile Number ::");
					long mobNo = scn.nextLong();
					iphone.sendSms(msg,mobNo);
					break;
				}
				default:
				{
					System.out.println("Please choose correct choice.....!!!");
				}
			}
		}
	}
}