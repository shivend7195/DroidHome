//robot workshop
public class Droid{
  int batteryLevel;
  String name;
  public String toString(){
      return "Hello, I'm the droid: "+name;
    }
 
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
   public void performTask(String task){
    System.out.println("Codey is performing task: "+task);
    batteryLevel -= 10;
  }
  public void energyReport(int batteryLevel){
    System.out.println("Battery Status: "+ batteryLevel+ "%");
  }
  public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    Codey.performTask("Bug Check");
    Codey.energyReport(Codey.batteryLevel);
   ;
  }
}