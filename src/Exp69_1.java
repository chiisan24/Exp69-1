import java.util.ArrayList;
public class Exp69_1 {
	public static void main(String[] args) { 
        ArrayList<String> listName = new ArrayList<>();  
        listName.add("佐藤"); 
        listName.add("鈴木"); 
        listName.add("高橋");  
        listName.add("田中");
        listName.add("伊藤");  
        listName.add("渡辺");  
        listName.add("山本");  
        listName.add("佐藤");  
        listName.add("小林");  
        listName.add("加藤"); 
        
       /* String name ="小林";
        boolean flag = false;
        
        for(int i = 0; i<listName.size(); i++) {
	        	if(listName.get(i).equals("")) {
	        		
	        		flag =true;
	        	}else {
	        		flag = false;
	        	}
        }
        
        
        	if(flag ==true) {
        		System.out.println("見つかりました");
        	}else if(flag == false){
        		System.out.println("見つかりませんでした");
        	}
        	String name1= ""; 

        	 

        	if(listName.contains(name1)){ //完全一致だから使いづらい。
        	    System.out.println("リストに含まれています");  
        	} else { 
        	System.out.println("リストに含まれていません"); 
        	} 
        	
        	
        	
        	
        	System.out.println(name1 + "は" + listName.indexOf(name1) +    
        			"番に保存されています"); 
        	*/
      //  String nameTwice = "佐藤";
        //int index = listName.lastIndexOf(nameTwice); 
        String nameTwice = "佐藤";
        int index = listName.indexOf(nameTwice); 

        

		        if(index >=0) {  
		        System.out.println(index+1 + "番に保存されています"); 
		        } else {  
		        System.out.println("リストには含まれていませんでした"); 
		        } 
		        
		        
		        
        	
        
        	

            } 
        }

