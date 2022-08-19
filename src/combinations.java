package knapsack;

public class combinations {

	int val;
	int weight;
	item[] itemArr = new item[5]; //Kombinasyonun sahip oldugu esyalari tutan sinif
	
	
	public void calculate() {	//Agirlik ve degerlerin toplaminin bulundugu fonksiyon
		val = 0;
		weight = 0;
		for (int i = 0; i < 5; i++) {
			if (itemArr[i] == null)
				break;
			val += itemArr[i].getValue();
			weight += itemArr[i].getWeight();
			
			
		}
	}
	public boolean isnotNull() {	//Null kontrolu
		for (int i = 0; i < 5; i++) {
			if (itemArr[i] != null)
				return true;
		}
		return false;
	}
	public String getValues() { //Degerleri donduren fonksiyon
		if (isnotNull())
		return "V:" + val + " W:" + weight;
		else 
			return "V: 0 W: 0";
	}
	public int getVal() {
		return val;
	}


	public void setVal(int val) {
		this.val = val;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


}
