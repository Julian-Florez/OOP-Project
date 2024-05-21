import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class ImageManager {

    private String color = "red";

    public void ProcessImages(Boolean dec1, Boolean dec2, Boolean dec3) {
        // Load the images
        BufferedImage image1 = loadImage("src/color/"+ color +".png");
        BufferedImage image2 = loadImage("src/Decorate/Files/null.png");
        BufferedImage image3 = loadImage("src/Decorate/Files/null.png");
        BufferedImage image4 = loadImage("src/Decorate/Files/null.png");

        if (dec1) {
            image2 = loadImage("src/Decorate/Files/Dec1.png");
        }
        if (dec2) {
            image3 = loadImage("src/Decorate/Files/Dec2.png");
        }
        if (dec3) {
            image4 = loadImage("src/Decorate/Files/Dec3.png");
        }

        // Overlay the images
        BufferedImage resultImage = overlayImages(image1, image2, image3, image4);

        // Save the result image
        saveImage(resultImage, "result.png");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static BufferedImage overlayImages(BufferedImage... images) {
        int maxWidth = 0;
        int maxHeight = 0;

        // Find the maximum width and height among the images
        for (BufferedImage image : images) {
            maxWidth = Math.max(maxWidth, image.getWidth());
            maxHeight = Math.max(maxHeight, image.getHeight());
        }

        // Create a new image with the maximum width and height
        BufferedImage resultImage = new BufferedImage(maxWidth, maxHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resultImage.createGraphics();

        // Overlay each image onto the result image
        for (BufferedImage image : images) {
            g2d.drawImage(image, 0, 0, null);
        }

        g2d.dispose();

        return resultImage;
    }

    public static BufferedImage loadImage(String imagePath) {
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void saveImage(BufferedImage image, String outputPath) {
        try {
            ImageIO.write(image, "png", new File(outputPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showImage() {
        // Load the result image
        BufferedImage image = loadImage("result.png");
        // Display the image in a new window
        JLabel label = new JLabel(new ImageIcon(image));
        JOptionPane.showMessageDialog(null, label, "Result Image", JOptionPane.PLAIN_MESSAGE);
        File file = new File("result.png");
        file.delete();
    }


}
