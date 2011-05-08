package at.no5.oikumene.projection

import java.awt.geom.Point2D

abstract class Projection {

   abstract Point2D toXY(Double lat, Double lon)

}