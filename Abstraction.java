 public class Abstraction{
  
  public static void main(String[] arr)
  {
      car c=new car();
      c.Start();
     
    Scooter s=new Scooter();
    s.Start();
  }
}

 abstract class Vehicle
{
   abstract void Start();
}

class car extends Vehicle
{
  void Start()
 {
   System.out.println("Start with key");
 }
}
 
class Scooter extends Vehicle
{
  void Start()
  {
   System.out.println("Start with kick");
  }
}