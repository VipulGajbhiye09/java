class A
{
    B obj;

    A(B obj)
    {
        this.obj = obj;
        obj.display();
    }
     
}
class B
{
    int x = 5;

    B()
    {
        A obj = new A (this);
    }
