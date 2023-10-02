package at.oop.circle;

class CircleWithFilledArray {

    protected int radius, posX, posY;
    protected int[] filled = new int[3];

    public CircleWithFilledArray(int rad, int x, int y, int[] filled) {
    	radius = rad;
    	posX = x;
    	posY = y;
    	this.filled[0] = filled[0];
    	this.filled[1] = filled[1];
		this.filled[2] = filled[2];
    }

    public static String compareCirclesWithFilledArray(CircleWithFilledArray firstCircleToCompare, CircleWithFilledArray secondCircleToCompare) {
    	
    	String response = "ERGEBNIS DES VERGLEICHS: ";

    	boolean filledArrayComparison = false;
    	
    	for (int index = 0; index <  firstCircleToCompare.filled.length; index++) {
			if (firstCircleToCompare.filled[index] == secondCircleToCompare.filled[index]) {
				filledArrayComparison = true;
			} else {
				filledArrayComparison = false;
			}
		}
    	
	    if (
	    		firstCircleToCompare.radius == secondCircleToCompare.radius && 
	    		firstCircleToCompare.posX == secondCircleToCompare.posX &&
	    		firstCircleToCompare.posY == secondCircleToCompare.posY &&
	    		filledArrayComparison == true ) {
	    	response += "Die Properties der zwei CircleWithFilledArray-Objekte sind IDENTISCH.\n";
	    }  else {
	    	response += "Die Properties der zwei CircleWithFilledArray-Objekte sind NICHT identisch.\n";
	    }
	    
	    return response;
    }
    
    public static CircleWithFilledArray createFilledCircleCopy(CircleWithFilledArray circleToCopy) {    	
    	CircleWithFilledArray copiedFilledCircle = new CircleWithFilledArray(circleToCopy.radius, circleToCopy.posX, circleToCopy.posY, new int[] {circleToCopy.filled[0], circleToCopy.filled[1], circleToCopy.filled[2]});
    	return copiedFilledCircle;
    }

}


