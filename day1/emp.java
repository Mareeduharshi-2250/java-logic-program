import java.util.Scanner;
class Emp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int empno;
String empname;
float empsal;
System.out.println("enter employee number :");
empno=sc.nextInt();
System.out.println("enter employee name :");
empname=sc.next();
System.out.println("enter employee salary :");
empsal=sc.nextFloat();
System.out.println("the given employee number is:"+empno);
System.out.println("the given employee name is :"+empname);
System.out.println("the given employee salary is:"+empsal);
}
}
