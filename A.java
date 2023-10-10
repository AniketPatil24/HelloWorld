public class A
{
  public void sum()
  {
   int a=9,b=8,c;
   c=a+b;
   System.out.println("Addition is  = "+c);
  
   }
public void sub()
{ 
  int a=10,b=6,c;
  c=a-b;
  System.out.println("Substraction ="+c);
}
public void mul()
{int a=10,b=6,c;
 c=a*b;
  System.out.println("Multiplication ="+c);
}
public void div()
{ int a=10,b=2,c;
c=a/b;
  System.out.println("Division ="+c);
}
public static void main(String args[])
{
  System.out.println("Main ");
  A a=new A();
  a.sum();
  a.sub();
  a.mul();
  a.div();
 B b=new B();
 b.m2();
  System.out.println("End");
}

}
