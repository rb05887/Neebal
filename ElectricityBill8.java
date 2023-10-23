package test;

public class ElectricityBill8 {

	public static void main(String[] args) {
		int con = 310;
		double Amount = 100*4+200*5+10*10;
		float surcharge =(float) (Amount*0.05);
		double gst=(Amount+surcharge)*0.18;
		double TotalAmount = Amount+surcharge+gst;
		System.out.println("Name: Arjun");
		System.out.println("Unit: "+con);
		System.out.println("Amount: "+TotalAmount);

	}
}