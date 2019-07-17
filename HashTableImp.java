
import java.util.*; 

public class HashTableImp { 


	public static void main(String[] args) 
	{ 

		
		Map<String, Integer> table = new Hashtable<>(); 
		table.put("Pencil", 10); 
		table.put("mannuals", 500); 
		table.put("apron", 400); 
		table.put("edp lab equpiment", 2500); 

		System.out.println("hashTable: "+ table.toString()); 

	} 
} 
