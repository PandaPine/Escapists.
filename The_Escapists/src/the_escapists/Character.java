/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_escapists;
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
    public void Draw(){
        Drawing.drawImage(image, xPos, yPos, 50, 100, 0, 1, 1);
    }
}
