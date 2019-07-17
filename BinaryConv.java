
public class BinaryConv 

{

 static int binary(String n) 
 { 
     String num = n; 
     int decvalue = 0; 

    
     int base = 1; 

     int len = num.length(); 
     for (int i = len - 1; i >= 0; i--) { 
         if (num.charAt(i) == '1') 
             decvalue += base; 
         base = base * 2; 
     } 

     return decvalue; 
 } 

 
 public static void main(String[] args) 
 { 
     String num = new String("10101001"); 
     System.out.println(binary(num)); 
 } 

 }

