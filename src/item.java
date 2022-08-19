package knapsack;

public class item {
	private String itemName; //A,B,C,D,E esyalarinin tutuldugu class
	private int weight;//Esyanin agirligi ve degeri
	private int value;

	public item(String a) {
		setItemName(a);	
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
