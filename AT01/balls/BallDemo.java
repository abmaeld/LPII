
import java.awt.*;
import java.util.*;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo   
{
    private Canvas myCanvas;
    Dimension canvasSize; 
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;
    
    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
        canvasSize = myCanvas.getSize();
    }
 
    
    public void bounce() {
       
        myCanvas.setVisible(true);
        myCanvas.setForegroundColor(Color.blue);
        
        int xStart = 20, xBound = canvasSize.width - 20, yGround = canvasSize.height - 70; // Define the bounds and the ground level;
        
        myCanvas.drawLine(xStart, yGround, xBound, yGround);
        
        Scanner scan = new Scanner(System.in);
        int balls_num = scan.nextInt(); // Get the number of bouncing balls;
        
        BouncingBall balls[] = new BouncingBall[balls_num];
        
        Color colors[] = new Color[6]; // Array of colors;
        colors[0] = Color.black;
        colors[1] = Color.blue;
        colors[2] = Color.green;
        colors[3] = Color.orange;
        colors[4] = Color.red;
        colors[5] = Color.yellow;
        
        Random gerador = new Random(); // Object to generate random numbers;
        
        for (int i = 0; i < balls_num; i++) {
            
            balls[i] = new BouncingBall(xStart + gerador.nextInt(301), xStart + gerador.nextInt(301), 20 + gerador.nextInt(11), colors[gerador.nextInt(6)], yGround, myCanvas);
            balls[i].draw();
            myCanvas.wait(50);
            
        }
        
        
        System.out.println("Started");
        boolean finished =  false;
        
        while(!finished) {
            
            myCanvas.wait(50);  

           for (int i = 0; i < balls_num; i++) {
                
                balls[i].move();
                int crossed = 0;
               
                for (int j = 0; j < balls_num; j++) {
                  
                    if (balls[j].getXPosition() >= xBound) {
                       
                        crossed += 1;
                       
                    }
                                        
                }
                
                if (crossed >= balls_num) {
                
                    finished = true;
                        
                }
                
            }
            
        }
        
        System.out.println("Finished");
        
        for (int i = 0; i < balls_num; i++) {
            
               balls[i].erase();
               
        }
        
    }
    
    /**
     *  Method drawFrame() é um método para desenhar uma moldura com valores específicos de padding relativos a um objeto Canvas da classe BallDemo;
     *  @see Canvas.java
     *  @param void;
     *  @return void;
     *  @autor Abmael Dantas
     */
    
    public void drawFrame() {
        
        canvasSize = myCanvas.getSize();
        Rectangle rect = new Rectangle(20, 20, canvasSize.width - 40, canvasSize.height - 40);
        myCanvas.erase(rect);
        myCanvas.draw(rect);
        
        
    }
    
}
