public class Customerrr {

		public int customerId;
		public String fullName;
		
		public Customerrr(int customerId, String fullName) {
			this.customerId = customerId;
			this.fullName = fullName;
		}
		public void makeTransaction(Transaction t) {
			
		}
		public String identifyRole () {
			return "I am the customer, I perform transactions.\n";
		}
}
