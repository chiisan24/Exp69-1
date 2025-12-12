import java.util.ArrayList;
import java.util.Iterator; 

public class Exp69_2 {
	public static void main(String[] args) { 
	ArrayList<Integer> listNum= new ArrayList<>();{



		for(int i = 1; i <= 15; i++){  
		    listNum.add(i); 
		}
	//listNum.add(18, 16); 
	
	
		Iterator<Integer> it = listNum.iterator(); 
		while (it.hasNext()) { 
		    Integer value= it.next();  
		    if(i % 3 == 0) {  
				listNum.remove( listNum.indexOf(i) ); 
				}
		    } 
		
		for(int i: listNum) { 
			if(i % 3 == 0) {  
			listNum.remove( listNum.indexOf(i) ); 
			} 
			} 
	}
}
}
