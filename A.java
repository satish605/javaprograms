
abstract class A 
{

    int prod;
    abstract void m1(int p,int q);
    void m2()
    {
        System.out.println(prod);
    }
}

class B extends A
{
void m1(int p,int q) {
prod=p*q;

}
}