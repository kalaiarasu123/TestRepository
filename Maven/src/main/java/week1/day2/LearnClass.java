package week1.day2;

public class LearnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SavingAccount acct = new SavingAccount();
		//Acct(acct.getTotalAmount());
		
		

	}
	class Account{
		void getTotalAmount(){
			System.out.println("Amount value Total");
		}
		void getDebictAmount(){
			System.out.println("Amount value Debict");
		}
		void getCreditAmount(){
			System.out.println("Amount value Credit");
		}
	}
	
	class SavingAccount extends Account{
		void getTotalAmount(){
			System.out.println("Amount value Total");
		}
		void getLastTransaction(){
			System.out.println("Amount value Transaction");
		}
	}

}
