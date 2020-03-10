public class X2FloatCalculation
{
public static void add(float a,float b)
{
float c=a+b;
System.out.println("add ans"+c);
}
public static void sub(float a,float b)
{
float c=a-b;
System.out.println("sub ans"+c);
}
public static void mul(float a,float b)
{
float c=a*b;
System.out.println("mul ans"+c);
}
public static void div(float a,float b)
{
float c=a/b;
System.out.println("div ans"+c);
}
public static void main(String []args)
{
add(1.2f,23);
sub(1,.5f);
mul(2.5f,3);
div(3,2);
}
}