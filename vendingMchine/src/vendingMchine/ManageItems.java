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

	// �݌Ɏ擾
//	public Integer stock() {
//		return stock;
//	}
//	
//	//���i�w��
//	public Item buy() {
//		
//	}
//	
//	//���i��[
//	public Item addItem() {
//		
//	}
}
