/** 
wap to get the age category
Given:int age=20;
output:print one of the following result
"child age"if age between 0-17 
"Teen age"if age between10-22
"Adult age"if age between 23-60
"old age" if age between 60-110
if not between 0-110 then print invalid age
*/
public class Age
{
 public static void main(String[]args)
 {
  int age=20;
  if(age>=0 && age<=17)
  {  
       System.out.println("you are a child");
  }
   else if(age>=18 && age<=22)
   {
     System.out.println("you are  Teenager"); 
   }
   else if(age>=23 && age<=60)
   {
      System.out.println("you are  Adult");

   }
  else if (age>=60 && age<=110)
  {
    System.out.println("you are old");
  }
  else
  {
      System.out.println("Invalid age");
   }
  
 }
}