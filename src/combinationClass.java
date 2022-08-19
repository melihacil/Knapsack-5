package knapsack;

public class combinationClass {


	item[] itemArr = new item[5];
	
	public item[] getItemArr() {
		return itemArr;
	}

	combinations[] combineArray = new combinations[31];

	public combinationClass() { //Constructor
		//itemAssign();		
	}
	public void itemAssign(int[] agirlik, int [] deger) {
		String[] stringArr = {"A","B","C","D","E"};
		for (int i = 0;i < 5;i++)
			itemArr[i] = new item(stringArr[i]);
		//int j = 4;
		//int  x[] = {1,2,3,4,5};
		for (int i= 0;i < 5;i++) {
			itemArr[i].setValue(deger[i]);
			itemArr[i].setWeight(agirlik[i]);
			//j--;
		}
		System.out.print(itemArr[2].getItemName() + " " +  itemArr[2].getValue() +" " + itemArr[2].getWeight() + "\n");
		getCombination();
		x = 0;
		printCombines();
	}
	
	public boolean capControl (int index, int k) { //Kapasiteyi asip asmadigini kontrol eden fonksiyon
		if (combineArray[index].getWeight() > k)
			return false;
		return true;
	}
	
	//Function to print combinations of knapsack to console
	void printCombines() {
		for (int i = 0; i < 31;i++) {
			for (int j= 0; j < 5; j++) {
				if (combineArray[i].itemArr[j] != null ) {
					System.out.print(combineArray[i].itemArr[j].getItemName()+" ");
				}
			}
			System.out.print("\n");
		}
	}
	
	//Kombinasyonu [A,B] gibi ifade seklinde dondurmeye yarayan fonk
	public String returnCombination(int r) {
		String a = "[";
		if (combineArray[r] != null)
			for(int i = 0; i < 5; i++) {
				if (combineArray[r].itemArr[i] == null)
					break;
				if(i != 4 && combineArray[r].itemArr[i+1] == null) {
					a += combineArray[r].itemArr[i].getItemName();
					break;
				}
				a += combineArray[r].itemArr[i].getItemName() + ",";
			}
		a +="]";
		return a;
	}
	public String returnValues(int index) {
		if (combineArray[index] == null)
		return "V: 0 W: 0";
		return combineArray[index].getValues();
	}

	//KombinSayisi kadar tekrar etmeyecek sekilde kombinasyonlarini bulan fonksiyon
	int x = 0;
	public void combinationFunc(item itemArray[], int start,int end, int index, int kombinSayisi) {
		if (index == kombinSayisi){ //Kombinayonlarin atandigi kisim
			combineArray[x] = new combinations();
			for (int j=0; j<kombinSayisi; j++) {
				System.out.print(itemArray[j].getItemName()+" ");
				combineArray[x].itemArr[j] = new item(itemArray[j].getItemName());
				combineArray[x].itemArr[j] = itemArray[j];
			}
			combineArray[x].calculate(); //Kombinasyon degerlerinin atandigi fonk
			System.out.println("");
			x++;
			return;
		}
		for (int i=start; i<=end && end-i+1 >= kombinSayisi-index; i++) {
			itemArray[index] = itemArr[i];
			combinationFunc(itemArray, i+1, end, index+1, kombinSayisi);
		}
	}
	public void getCombination(){
		for(int i = 1; i <= 5; i++) {
			item[] newarr = new item[i];
			combinationFunc(newarr, 0, 4, 0, i);
		}
	}

	public int returnBestSolution(int cap) {	//En iyi degere sahip olan kombinasyonun lineer olarak arandigi fonksiyon
		int index=0;
		int val = 0;
		for (int i = 0; i < 31;i++) {
			if (combineArray[i] == null) //Eger olusturulmamissa es gecer
				continue;
			if(combineArray[i].getWeight() > cap)	//Kapasiteden buyuk ise sonrakine gecer
				continue;
			if(combineArray[i].getVal() > val) {
				val = combineArray[i].getVal();
				index = i;
			}	
		}
		return index;
	}
	
	public combinations[] getCombineArray() {
		return combineArray;
	}

	public void setCombineArray(combinations[] combineArray) {
		this.combineArray = combineArray;
	}

}
