
package introductionpractise;
public abstract class Car{

  public abstract void create();

  public void print(){

      System.out.print("I'm not abstract method.");

  }

}
//other program

package introductionpractise;
   public class Main extends Car{        

       

       public void create(){

          System.out.println("I'm overridden method.");

      }

      public static void main(String[] args){

          Main m = new Main(); 

          m.create();          

          m.print();

      }      
}