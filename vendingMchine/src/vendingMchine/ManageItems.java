package vendingMchine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageItems {

//	private int stock = 10;

	List<Item> drinks = new ArrayList<Item>();

	public ManageItems() {
		for (int i = 0; i < 6; i++) {
			Item item = new Item(i, i);
			drinks.add(item);
		}
	}

	// ÝŒÉŽæ“¾
//	public Integer stock() {
//		return stock;
//	}
//	
//	//¤•iw“ü
//	public Item buy() {
//		
//	}
//	
//	//¤•i•â[
//	public Item addItem() {
//		
//	}
}
