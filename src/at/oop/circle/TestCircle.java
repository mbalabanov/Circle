package at.oop.circle;

class TestCircle {

	public static void main(String[] args) {

		Circle myCircleOneWithSameValues = new Circle(6, 12, 12, false);
		Circle myCircleTwoWithSameValues = new Circle(6, 12, 12, false);

		System.out.println("*** Vergleich zweier unabhaengig voneinander deklarierter Circle-Objekte mit IDENTISCHEN Properties:");
		System.out.println(Circle.compareCircles(myCircleOneWithSameValues, myCircleTwoWithSameValues));

		Circle myCircleOneWithDifferentValues = new Circle(6, 12, 12, false);
		Circle myCircleTwoWithDifferentValues = new Circle(4, 8, 14, true);
		
		System.out.println("*** Vergleich zweier unabhaengig voneinander deklarierter Circle-Objekte mit UNTERSCHIEDLICHEN Properties:");
		System.out.println(Circle.compareCircles(myCircleOneWithDifferentValues, myCircleTwoWithDifferentValues));

		System.out.println("*** ACHTUNG: Vergleich eines Circle-Objekts mit sich selbst (als Sanity Check:");
		System.out.println(Circle.compareCircles(myCircleOneWithSameValues, myCircleOneWithSameValues));
		
		System.out.println("*** Vergleich eines Circle-Objekts mit einem Clone (ueber den Clone-Konstruktor):");
		Circle myCircleThreeCopyOfTwo = new Circle(myCircleTwoWithSameValues);
		System.out.println(Circle.compareCircles(myCircleTwoWithSameValues, myCircleThreeCopyOfTwo));
		
		CircleWithFilledArray myCircleFourthWithDifferentValues = new CircleWithFilledArray(6, 12, 12, new int[] {1, 2, 3} );
		CircleWithFilledArray myCircleFifthWithDifferentValues = new CircleWithFilledArray(6, 12, 12, new int[] {1, 2, 3} );
		
		System.out.println("*** Vergleich zweier unabhaengig voneinander deklarierter CircleWithFilledArray-Objekte mit IDENTISCHEN Properties:");
		System.out.println(CircleWithFilledArray.compareCirclesWithFilledArray(myCircleFourthWithDifferentValues, myCircleFifthWithDifferentValues));
		
		System.out.println("*** XXX Vergleich eines CircleWithFilledArray-Objekts mit einem Clone (ueber den Clone-Konstruktor):");
		CircleWithFilledArray myCircleSixCopyOfFive = new CircleWithFilledArray(myCircleFifthWithDifferentValues);
		System.out.println(CircleWithFilledArray.compareCirclesWithFilledArray(myCircleSixCopyOfFive, myCircleFifthWithDifferentValues));
		
	}

}
