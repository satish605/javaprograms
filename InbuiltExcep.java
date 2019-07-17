


class InbuiltExcep 
{ 
public static void main(String args[]) 
    { 
        try { 
            int a = 30, b = 0; 
            int c = a / b; 
            System.out.println("ans=" + c); 
        } 
        catch (ArithmeticException e) { 
            System.out.println("division not possible "); 
        } 
    } 
} 