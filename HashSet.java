
import java.util.LinkedHashSet; 
public class HashSet
{ 
	public static void main(String[] args) 
	{ 
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>(); 

		linkedset.add("A"); 
		linkedset.add("B"); 
		linkedset.add("C"); 
		linkedset.add("D"); 
		linkedset.add("A"); 
		linkedset.add("E"); 
         
		System.out.println("Size of LinkedHashSet = " +linkedset.size()); 
		System.out.println("Original LinkedHashSet:" + linkedset); 
		linkedset.remove("D");
		System.out.println("Updated LinkedHashSet: " + linkedset); 
	} 
} 
