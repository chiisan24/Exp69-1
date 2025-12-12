import java.util.ArrayList; 

public class Exp69_2 {
	public static void main(String[] args) { 
	ArrayList<Integer> listNum= new ArrayList<>();{



		for(int i = 1; i <= 15; i++){  
		    listNum.add(i); 
		}
	//listNum.add(18, 16); 
	
	
		
		for(int i: listNum) { 
			if(i % 3 == 0) {  
			listNum.remove( listNum.indexOf(i) ); 
			} 
			} 
	}
}
}
