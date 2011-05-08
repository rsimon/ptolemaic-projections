import java.io.File
import javax.imageio.ImageIO
import java.awt.Graphics2D
import java.awt.image.BufferedImage

// Just a dummy script for testing graphics output in Groovy
BufferedImage img = new BufferedImage(640, 480, BufferedImage.TYPE_INT_ARGB);
Graphics2D g = (Graphics2D) img.getGraphics()

ImageIO.write(img, "PNG", new File("test.png"))
