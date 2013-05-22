package at.no5.oikumene.projection

import java.awt.geom.Point2D

/**
 * Implements Ptolemy's 2nd projection.
 * 
 * @author Rainer Simon
 */
class Ptolemys2nd extends Projection {
	
	def scale = 1
	def offsetX = 0
	def offsetY = 0

	Double rEquator = 180;
   
	Point2D toXY(Double lat, Double lon) {
	   // According to Neugebauer's equation (in fact an approximation!?)
	   Double r = rEquator - lat 
	   Double alpha = Math.PI * Math.cos(Math.toRadians(lat)) / (Math.PI * Math.toRadians(r)) * Math.toRadians(lon)
	  
	   // Account for orientation on the drawing plane
	   alpha += Math.PI / 2 

	   // To cartesian coords
	   Double x = scale * r * Math.cos(alpha) + offsetX
	   Double y = scale * r * Math.sin(alpha) + offsetY

	   return new Point2D.Double(x, y)
	}

}