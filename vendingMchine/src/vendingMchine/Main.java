package vendingMchine;

public class Main {

	public static void main(String[] args) {
		ManageItems mi = new ManageItems();
		Item item = new Item(0, 0);
		
		//¤•iˆê——
		for(int x = 0; x < 6 ; x++) {
			item = mi.drinks.get(x);
			System.out.println(item.getName()+ "\t " +item.getPrice());			
		}
	}

}
