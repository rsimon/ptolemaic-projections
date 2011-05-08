package at.no5.oikumene.projection

import java.awt.geom.Point2D

/**
 * Implements Ptolemy's 2nd projection.
 * 
 * @author Rainer Simon
 */
class Ptolemys2nd extends Projection {

   Double rEquator = 180;
   
   Point2D toXY(Double lat, Double lon) {
      Double r = rEquator - lat 
      Double alpha = Math.PI * Math.cos(Math.toRadians(lat)) / (Math.PI * Math.toRadians(r)) * lat;

      Double x = r * Math.cos(alpha) + 320
      Double y = r * Math.sin(alpha)

      return new Point2D.Double(x, y)
   }

}