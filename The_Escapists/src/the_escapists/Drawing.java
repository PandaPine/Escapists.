/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_escapists;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Font;

public class Drawing {
    private static Graphics2D g;
    private static The_Escapists mainClassInst;

    public static void setDrawingInfo(Graphics2D _g,The_Escapists _mainClassInst) {
        g = _g;
        mainClassInst = _mainClassInst;
    }
////////////////////////////////////////////////////////////////////////////
    public static void drawCircle(int xpos,int ypos,double rot,double xscale,double yscale,Color color)
    {
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.setColor(color);
        g.fillOval(0,0,20,20);

        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }
////////////////////////////////////////////////////////////////////////////
    public static void drawImage(Image image,int xpos,int ypos, int _width, int _height,double rot,double xscale,double yscale) {
        int ydelta = Window.getHeight2()/Map.numRows;
        int xdelta = Window.getWidth2()/Map.numColumns;
        int width = _width;
        int height = _height;
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.drawImage(image,xpos,ypos,
        width,height,mainClassInst);
        
        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void drawRectangle(int xpos,int ypos,double rot,double xscale,double yscale,Color color)
    {
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.setColor(color);
        g.fillRect(0,0,20,20);

        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void displayText(int xpos, int ypos, String text, Font font, Color color ){
        g.setColor(color);
        g.setFont(font);
        g.drawString(text,xpos,ypos);
    }
}
