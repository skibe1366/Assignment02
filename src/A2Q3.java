
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skibe1366
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         City kw = new City();

        Robot karel = new Robot(kw, 0, 10, Direction.EAST);

        if (karel.getStreet() >0) {
            
            while(karel.getDirection() !=Direction.NORTH) {
                karel.turnLeft();
            }
        
    }
        if(karel.getAvenue() > 0) {
            
            while (karel.getDirection() !=Direction.WEST) {
                karel.turnLeft();
            }
            
        while (karel.getAvenue() > 0) {
            karel.move();
        }    
            
            
        }
            
        }
}
