
import java.util.Scanner;
public class Armstrong{

public static void main(String [] args){

 int num;
 int sum;
 int s2;
 int result;
  System.out.println("Enter the number");

Scanner nm=new Scanner(System.in);
num=nm.nextInt();
sum=num;//371;


s2=sum%10;
result=(s2*s2*s2);
sum=sum/10;
s2=sum%10;
result+=(s2*s2*s2);
sum=sum/10;
s2=sum%10;
result+=(s2*s2*s2);
if(num==result){
System.out.println("number is armstrong");
               }
else{
System.out.println("number is not armstrong");
    }
                                      } 
                      }