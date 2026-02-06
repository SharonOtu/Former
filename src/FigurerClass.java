
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shaot01
 */
public abstract class FigurerClass {
    
    private int xPos;
    private int yPos;
    private boolean running;
    private boolean PositivRiktning;
    private Color farg;


public Figur (int x, int y){
     xPos = x;
     yPos = y;
     running = false;
     positivRiktning = true;
     Random farg = new Random();
     color = new Color (
        rand.nextInt
        rand.nextInt
        rand.nextInt
     )
public int getXPos(){
  return xPos;      
}

public int getYpos(){
  return yPos;

}

public Point getPos() {
   return new Point (xPos, yPos);
}


   public void setRunning(boolean run) {
      running = run;
}  

public void move (int x, int y) {
   xPos += x;
   yPos += y;
   
}

public abstract void draw (Graphics g);
public abstract String whatAmI();

}

public class Rektangel extends FigurerClass {
   private int bas;
   private int höjd;
   private boolean fylld;

public Rektangel (int x, int y, int b, int h, boolean f) {
   super(x, y);
   bas = b;
   hojd = h;
   fylld = f;
   color;
}
   public void draw(Graphics g) {
     g.setColor(color);
      if (fylld)
         g.fillRect(xPos, yPos, bas, hojd);
      else
         g.drawRect(xPos, yPos, bas, hojd);
   }
   public String whatAmI() {
return "Rektangel (" + xPos + ", " + yPos + ")";       
   }
}

public class Triangel extends Form {
   private int bas;
   private int höjd;
   private boolean fylld;

public Triangel (int x, int y, int b, int h, boolean f) {
    super(x, y);
    bas = b;
    hojd = h;
    fylld = f;
    color;
}
 public void draw(Graphics g) {
     g.setColor(color);
      if (fylld)
         g.fillPolygon(xPos, yPos, bas, hojd);
      else
         g.drawPolygon(xPos, yPos, bas, hojd);
   }
   public String whatAmI() {
return "Triangel (" + xPos + ", " + yPos + ")";      
}


public class Cirkel extends Form {
   private int radie;
   private boolean fylld;


public Cirkel (int x, int y, int r, boolean f) {
   super(x, y);
    radie = r;
    fylld = f;
    color;
}

     public void draw(Graphics g) {
        g.setColor(color);
        if (fylld)
           g.fillOval(xPos, yPos, radie * 2, radie * 2)
         else
            g.drawOval(xPos, yPos, radie * 2, radie * 2)
     }
      public String whatAmI() {
          return "Cirkel (" + xPos + ", " + yPos + ")";      
}
}
