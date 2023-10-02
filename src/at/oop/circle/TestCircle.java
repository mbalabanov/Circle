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

		System.out.println("*** ACHTUNG: Vergleich eines Circle-Objekts mit sich selbst:");
		System.out.println(Circle.compareCircles(myCircleOneWithSameValues, myCircleOneWithSameValues));
		
		System.out.println("*** Vergleich eines Circle-Objekts mit einer Kopie:");
		Circle myCircleThreeCopyOfTwo = Circle.createCircleCopy(myCircleTwoWithSameValues);
		System.out.println(Circle.compareCircles(myCircleTwoWithSameValues, myCircleThreeCopyOfTwo));
		
		CircleWithFilledArray myCircleFourthWithDifferentValues = new CircleWithFilledArray(6, 12, 12, new int[] {1, 2, 3} );
		CircleWithFilledArray myCircleFifthWithDifferentValues = new CircleWithFilledArray(6, 12, 12, new int[] {1, 2, 3} );
		
		System.out.println("*** Vergleich zweier unabhaengig voneinander deklarierter CircleWithFilledArray-Objekte mit IDENTISCHEN Properties:");
		System.out.println(CircleWithFilledArray.compareCirclesWithFilledArray(myCircleFourthWithDifferentValues, myCircleFifthWithDifferentValues));
		
		System.out.println("*** Vergleich eines CircleWithFilledArray-Objekts mit einer Kopie:");
		CircleWithFilledArray myCircleSixCopyOfFive = CircleWithFilledArray.createFilledCircleCopy(myCircleFifthWithDifferentValues);
		System.out.println(CircleWithFilledArray.compareCirclesWithFilledArray(myCircleSixCopyOfFive, myCircleFifthWithDifferentValues));
		
	}

}
