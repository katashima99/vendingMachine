package vendingMchine;

public class Item {

	private int name;
	private int price;

	public Item(int name, int price) {
		this.name = name;
		this.price = price;
	}

	// ���i��
	public String getName() {
		String str;
		switch (name) {
		case 0:
			str = "��";
			break;
		case 1:
			str = "�R�[��";
			break;
		case 2:
			str = "�T�C�_�[";
			break;
		case 3:
			str = "�I�����W";
			break;
		case 4:
			str = "����";
			break;
		case 5:
			str = "�R�[�q�[";
			break;
		default:
			str = "���i������܂���B";
			break;
		}
		return str;
	}

	// �l�i
	public String getPrice() {
		String str;
		switch (price) {
		case 0:
			str = "��100";
			break;
		case 1:
			str = "��120";
			break;
		case 2:
			str = "��130";
			break;
		case 3:
			str = "��150";
			break;
		case 4:
			str = "��120";
			break;
		case 5:
			str = "��100";
			break;
		default:
			str = "���i������܂���B";
			break;
		}
		return str;
	}

}
