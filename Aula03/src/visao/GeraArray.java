package visao;

public class GeraArray {
	
	public String meuArray[] = new String[10];
	
	public GeraArray() {
		
		meuArray[0] = "Musquitu";
		meuArray[1] = "Ze";
		meuArray[2] = "BF";
		meuArray[3] = "LP";
		meuArray[4] = "Silvio";
		meuArray[5] = "Benimaru";
		meuArray[6] = "JV";
		meuArray[7] = "Adilso";
		meuArray[8] = "Juninho";
		meuArray[9] = "Saulo";
		
	}
	
	public void imprimeArray() {
		for(int i=0; i< meuArray.length;i++) {
			System.out.println(meuArray[i]);
		}
	}

}
