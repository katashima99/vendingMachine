package vendingMchine;

public class Item {

	private int name;
	private int price;

	public Item(int name, int price) {
		this.name = name;
		this.price = price;
	}

	// 商品名
	public String getName() {
		String str;
		switch (name) {
		case 0:
			str = "水";
			break;
		case 1:
			str = "コーラ";
			break;
		case 2:
			str = "サイダー";
			break;
		case 3:
			str = "オレンジ";
			break;
		case 4:
			str = "お茶";
			break;
		case 5:
			str = "コーヒー";
			break;
		default:
			str = "商品がありません。";
			break;
		}
		return str;
	}

	// 値段
	public String getPrice() {
		String str;
		switch (price) {
		case 0:
			str = "￥100";
			break;
		case 1:
			str = "￥120";
			break;
		case 2:
			str = "￥130";
			break;
		case 3:
			str = "￥150";
			break;
		case 4:
			str = "￥120";
			break;
		case 5:
			str = "￥100";
			break;
		default:
			str = "商品がありません。";
			break;
		}
		return str;
	}

}
