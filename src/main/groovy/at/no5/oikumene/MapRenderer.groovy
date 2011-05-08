import java.io.File

import javax.imageio.ImageIO

import java.awt.Graphics2D
import java.awt.Color
import java.awt.image.BufferedImage
import java.awt.geom.Line2D

import at.no5.oikumene.projection.Projection
import at.no5.oikumene.projection.Ptolemys2nd

/**
 * Just a dummy script for testing graphics output in Groovy
 */
BufferedImage img = new BufferedImage(640, 480, BufferedImage.TYPE_INT_ARGB);
Graphics2D g = (Graphics2D) img.getGraphics()
g.setPaint(new Color(0, 0, 0))

// 60 degrees latitude
drawParallel(g, 60)
drawParallel(g, 23.5)
drawParallel(g, -16.25)

ImageIO.write(img, "PNG", new File("test.png"))

def drawParallel(Graphics2D g, Double lat) {
	Projection p = new Ptolemys2nd()
	for (int i=-90; i<=80; i+=10) {
		g.draw(new Line2D.Double(p.toXY(lat, i), p.toXY(lat, i + 10)))
	}
}

def drawMeridian(Graphics2D g, Double lon) {
  
}