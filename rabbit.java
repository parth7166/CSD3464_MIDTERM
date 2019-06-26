/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd3464;

import com.sun.javafx.scene.traversal.Direction;

/**
 *
 * @author parth
 */
public class rabbit {
    public int x = 0;
    public int y = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /**
     *
     * @return
     */
    public Direction getMove() {
        int moves = 0;
		moves++;
		if (moves > 2 * getJumpHeight() + 2) {
			moves = 1;   // start over
		}
		
		if (moves <= getJumpHeight()) {   // 1st or 2nd move
			return Direction.NORTH;
		} else if (moves <= 2 * getJumpHeight()) {   // 3rd or 4th
			return Direction.SOUTH;
		} else {  // 5th or 6th
			return Direction.EAST;
		}
	}


    private int getJumpHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString() {
		return "V";

    private static class To {

        public To() {
        }
    }
    }
    
    
}

