package introductionpractise;
class Student{  
    int id;  
    String name;  
  
    Student4(int i,String n)
{  
    id = i;  
    name = n;  
    }  
    
    void display()
{
System.out.println(id+" "+name);
}  
   
    public static void main(String args[])
{  
  
    Student s1 = new Student4(111,"satish");  
    Student s2 = new Student4(222,"kumar");  
  
    s1.display();  
    s2.display();  
   }  
}  