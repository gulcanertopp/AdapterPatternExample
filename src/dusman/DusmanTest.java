/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dusman;

/**
 *
 * @author gulcanertop
 */
public class DusmanTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DusmanRobotu robot = new DusmanRobotu();
       DusmanTank tank = new DusmanTank();
       IDusman robotAdpt = new DusmanRobotuAdapter(robot);
       
       String rbtAdi = "RobotXYZ";
       String tnkAdi = "TankYZX";
      
        System.out.println("Düşman Tank; ");
        tank.DusmanAdi(tnkAdi);
        tank.Hizlan();
        tank.SilahKullan();
        
        System.out.println("Düşman Robotu");
        robotAdpt.DusmanAdi(rbtAdi);
        robotAdpt.Hizlan();
        robotAdpt.SilahKullan();
        
    }    
}
