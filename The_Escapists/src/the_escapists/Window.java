/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_escapists;

public class Window {

    static final int XBORDER = 20;
    static final int YBORDER = 20;
    static final int YTITLE = 30;
    static final int WINDOW_BORDER = 8;
    static int WINDOW_WIDTH = 2*(WINDOW_BORDER + XBORDER) + Map.numColumns*50;
    static int WINDOW_HEIGHT = YTITLE + WINDOW_BORDER + 2 * YBORDER + Map.numRows*50;
    static int xsize = -1;
    static int ysize = -1;
/////////////////////////////////////////////////////////////////////////
    static public int getX(int x) {
        return (x + XBORDER + WINDOW_BORDER);
    }

    static public int getY(int y) {
        return (y + YBORDER + YTITLE );
    }

    static public int getYNormal(int y) {
        return (-y + YBORDER + YTITLE + Window.getHeight2());
    }
    
    static public int getWidth2() {
        return (xsize - 2 * (XBORDER + WINDOW_BORDER));
    }

    static public int getHeight2() {
        return (ysize - 2 * YBORDER - WINDOW_BORDER - YTITLE);
    }
}
   

