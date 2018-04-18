package demos;

public class PriceComparison {
	
	public static void main(String[] args){
		//variables
		String item = "laptop";
		int ourPrice = 499;
		int price1 = 579;
		String store1 = "Best Buy";
		int price2 = 529;
		String store2 = "Amozon";
		int saving1 = price1 - ourPrice;
		int saving2 = price2 - ourPrice;
		
		//Price comparison
		System.out.println("Comparing price for " + item);
		System.out.println("Our Store: $" + ourPrice);
		System.out.println(store1 + ": $" + price1);
		System.out.println("Save $" + saving1);
		System.out.println(store2 + ": $" + price2);
		System.out.println("Save $" + saving2);
	}

}
