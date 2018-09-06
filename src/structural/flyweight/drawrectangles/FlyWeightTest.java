package structural.flyweight.drawrectangles;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;


/**
 * Client
 * 
 * Example of the flyweight pattern
 * 
 * @author valerivaleriev
 *
 */
public class FlyWeightTest extends JFrame {
  JButton startDrawing;
  
  int windowWidth = 1200;
  int windowHeight = 800;
  
  // Intrinsic state
  Color[] shapeColors = {
      Color.ORANGE, Color.RED, Color.YELLOW, Color.BLUE,
      Color.PINK, Color.CYAN, Color.magenta, Color.BLACK
  };
  
  public FlyWeightTest() {
    this.setSize(windowWidth, windowHeight);
    
    this.setLocationRelativeTo(null);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Flyweight test");
    
    JPanel contentPane = new JPanel();
    contentPane.setLayout(new BorderLayout());
    
    final JPanel drawingPanel = new JPanel();
    
    startDrawing = new JButton("Draw stuff");
    
    contentPane.add(drawingPanel, BorderLayout.CENTER);
    contentPane.add(startDrawing, BorderLayout.SOUTH);
    
    startDrawing.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        Graphics graphics = drawingPanel.getGraphics();
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
          MyRect reckti = RectFactory.getRect(getRandColor());
          
          reckti.draw(graphics, getRandX(), getRandY(), getRandX(), getRandY());
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("It took " + (endTime - startTime));
      }
    });
    
    this.add(contentPane);
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    new FlyWeightTest();
  }
  
  private int getRandX(){ return (int)(Math.random()*windowWidth); }

  private int getRandY(){ return (int)(Math.random()*windowHeight); }

  private Color getRandColor() {
    Random random = new Random();
    
    int randInt = random.nextInt(this.shapeColors.length);
    
    return this.shapeColors[randInt];
  }
  
  
}
