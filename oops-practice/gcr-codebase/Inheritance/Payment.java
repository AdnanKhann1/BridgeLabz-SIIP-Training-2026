
public class Payment{
	public void pay(){
		System.out.println("pay process");
	}
}
class Upi extends Payment{
	//System.out.print("Enter your valid UPI ID");
	public void scanner(){
		System.out.println("scanning QR");
	}
}

class MainPayment{
	public static void main(String[] args){
	Payment p=new Upi();
	Upi u=(Upi)p;
	u.pay();
	u.scanner();
	
	//upi u=new upi();
	//u.scan();
	//u.pay();
	
	}
}
