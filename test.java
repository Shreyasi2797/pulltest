import java.util.*;
public class test{
public static void main(String args[]){
System.out.println("Hello world");
Scanner s = new Scanner(System.in);
System.out.println("Enter first number");
int a = s.nextInt();
System.out.println("Enter second number");
int b = s.nextInt();
System.out.println("Addition: "+(a+b));
System.out.println("Subtraction: "+(a-b));
System.out.println("Product: "+(a*b));
System.out.println("Division: "+(a/b));
for(int i=0;i<5;i++){
System.out.println("Forked");
}
}
}