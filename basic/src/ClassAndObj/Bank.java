package ClassAndObj;

public class Bank extends CustDet{
	
		public void gender() {
			System.out.println("Gender");
		}
		
	
	public static void main(String[] args) {
	
		Bank obj= new Bank();
		obj.name();
		obj.number();
		obj.gender();
		
	}

}
