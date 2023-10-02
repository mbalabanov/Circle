package at.oop.circle;

class Circle {

    protected int radius, posX, posY;
    protected boolean filled;

    public Circle(int rad, int x, int y, boolean filled) {
    	radius = rad;
    	posX = x;
    	posY = y;
    	this.filled = filled;
    }

    public static String compareCircles(Circle firstCircleToCompare, Circle secondCircleToCompare) {
    	
    	String response = "ERGEBNIS DES VERGLEICHS: ";
    	
    	// Direct comparison of objects reference (should never be true, if two different objects are compared)
	    if (firstCircleToCompare == secondCircleToCompare) {
	    	response += "Die zwei Objektreferenzen sind identisch (was in unserem Fall hier nicht passieren duerfte). Die Properties werden natuerlich ebenfalls identisch sein (sie gleich die naechste Zeile.\n";
	    }

	    //  Compares the object properties, not the object references
	    if (    firstCircleToCompare.radius == secondCircleToCompare.radius &&
	    		firstCircleToCompare.posX == secondCircleToCompare.posX && 
	    		firstCircleToCompare.posY == secondCircleToCompare.posY && 
	    		firstCircleToCompare.filled == secondCircleToCompare.filled ) {
	    	response += "Die Properties der zwei Circle-Objekte sind IDENTISCH.\n";
	    }  else {
	    	response += "Die Properties der zwei Circle-Objekte sind NICHT identisch.\n";
	    }
	    
	    return response;

    }
    
    public static Circle createCircleCopy(Circle circleToCopy) {
    	Circle copiedCircle = new Circle(circleToCopy.radius, circleToCopy.posX, circleToCopy.posY, circleToCopy.filled);
    	return copiedCircle;
    }

}


