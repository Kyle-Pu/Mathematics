package GeometryGUI.Area;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AreaFormulasTest {
	@Test
	public void rectangleTest() {
		// when
		double rectangleArea = AreaFormulas.rectangle(10, 5);

		// then
		assertEquals(50, rectangleArea, 0.001);
	}

	@Test
	public void circleArea() {
		// when
		double circleArea = AreaFormulas.circle(4);

		// then
		assertEquals(50.2654, circleArea, 0.001);
	}

	@Test
	public void triangleArea() {
		// when
		double triangleArea = AreaFormulas.triangle(5, 6);

		// then
		assertEquals(15, triangleArea, 0.001);
	}

	@Test
	public void squareArea() {
		// when
		double squareArea = AreaFormulas.square(10);

		// then
		assertEquals(100, squareArea, 0.001);
	}

}
