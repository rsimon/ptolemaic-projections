package at.no5.oikumene.projection

import java.awt.geom.Point2D

class Ptolemys2nd extends Projection {

   Double rEquator = 180;
   
   Point2D toXY(Double lat, Double lon) {
      Double r = rEquator - lat 
      Double alpha = Math.PI * Math.cos(Math.toRadians(lat)) / (Math.PI * Math.toRadians(r)) * lat;

      Double x = r * Math.cos(alpha)
      Double y = r * Math.sin(alpha)

      return new Point2D.Double(x, y)
   }

}