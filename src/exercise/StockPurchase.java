package exercise;

public class StockPurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int savings = 25000;
		int stock = 989;
		int shares = savings / stock;
		int cd = savings - (shares * stock);
		
		System.out.println("Buy " + shares + " shares of stock");
		System.out.println("Invest $" + cd + " in CD account");
		

	}

}
