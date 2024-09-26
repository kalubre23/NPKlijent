/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ai.np.NPKlijent.ui.form;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class ImagePanel extends JPanel{
      
    private BufferedImage image;
    
    private static final int PADDING = 15;

    // Constructor to load image
    public ImagePanel(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath)); // Load the image
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            // Get the current size of the panel
            int panelWidth = getWidth();
            int panelHeight = getHeight();
            
             // Calculate the available width and height considering the padding
            int imageWidth = panelWidth - 2 * PADDING; // Subtract padding from left and right
            int imageHeight = panelHeight; // Keep the image height same as panel height (or adjust)

            // Calculate aspect ratio to avoid distortion (optional)
            double aspectRatio = (double) image.getWidth() / image.getHeight();
            int scaledHeight = (int) (imageWidth / aspectRatio);

            // Adjust the image height to fit inside the panel if it's too tall
            if (scaledHeight > panelHeight) {
                scaledHeight = panelHeight;
                imageWidth = (int) (scaledHeight * aspectRatio);
            }

            // Calculate position to center the image vertically
            int x = PADDING; // 15px padding from the left
            int y = (panelHeight - scaledHeight) / 2; //
            
            // Draw the image scaled to fit the panel's size
            g.drawImage(image, x, y, imageWidth, scaledHeight, this);
        }
    }
}
