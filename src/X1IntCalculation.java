
public class X1IntCalculation
{
public static void add(int a,int b,int c)
{
int d=a+b+c;
System.out.println("add ans"+d);
}
public static void sub(int a,int b)
{
int c=a-b;
System.out.println("sub ans"+c);
}
public static void mul(int a,int b,int c)
{
int d=a*b*c;
System.out.println("mul ans"+d);
}
public static void div(int a,int b)
{
int c=a/b;
System.out.println("div ans"+c);
}
public static void main(String []args)
{
add(10,20,30);
sub(10,20);
mul(10,20,30);
div(10,20);
}
}
