import java.util.*;
class jc1
{ 
public static void main(String args[])
{
int roll,m,i;
String name;
Scanner obj=new Scanner(System.in);
System.out.println("Enter Name of Student");
name=obj.nextLine();
System.out.println("Enter Roll no. of Student"); 
roll=obj.nextInt();
System.out.println("Enter Marks of Student");
m=obj.nextInt();
System.out.println("Name of Student is "+name);
System.out.println("Roll no. of Student "+roll);
System.out.println("Marks of Student "+m);

}
} 