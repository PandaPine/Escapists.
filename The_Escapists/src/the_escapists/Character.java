/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_escapists;

import java.awt.Graphics2D;
import java.awt.Image;

public class Character {
    protected Image image;
    protected int xPos;
    protected int yPos;
    
    Character(){
        
    }
    public void move(int xChange, int yChange){
        xPos+=xChange;
        yPos+=yChange;
    }
    public void Draw(Graphics2D g, The_Escapists frame,int width, int height){
                g.drawImage(image,xPos,yPos,width,height, frame);
    }
}
