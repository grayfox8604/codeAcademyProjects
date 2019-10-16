/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droid;

/**
 *
 * @author bserrato
 */
public class Droid{

  int batteryLevel;
  String name;
  
  //constructor
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  
  //new method
  public void performTask(String task){
    System.out.println(name +" is performing " + task);
  }
  //battery drain method
  public void drainBattery(){
    batteryLevel = batteryLevel - 10;
  }
  //energy report
  public void energyReport(){
    System.out.println("The battery level is " + batteryLevel);
  }
  //transfer energy into another instance
  public int energyTransfer(int newBatteryLevel){
   batteryLevel = newBatteryLevel;
    return newBatteryLevel;
  }
  //battery recharger
  public int recharge(int rechargedBatt){
    rechargedBatt = 100;
    batteryLevel = rechargedBatt;
    return rechargedBatt;
  }
  //to string method for reasons
  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
  public static void main(String[]args){
    Droid droid1 = new Droid("R2D2");
    System.out.println(droid1);
    System.out.println(droid1.name);
    System.out.println(droid1.batteryLevel);
    droid1.performTask("sleeping");
    droid1.drainBattery();
    System.out.println(droid1.batteryLevel);
    droid1.energyReport();
    
    Droid droid2 = new Droid("Nero");
    System.out.println(droid2.name);
    droid2.energyTransfer(droid1.batteryLevel);
    droid2.energyReport();
    droid1.recharge(droid1.batteryLevel);
    droid1.energyReport();
  }
}
