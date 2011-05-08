package at.no5.oikumene.projection

import java.awt.geom.Point2D

/**
 * The base class for all projections. Making this an
 * abstract class instead of an interface since we might
 * add common methods later on.
 * 
 * @author Rainer Simon
 */
abstract class Projection {

   abstract Point2D toXY(Double lat, Double lon)

}