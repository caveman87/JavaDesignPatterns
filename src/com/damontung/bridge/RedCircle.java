/**
 * 
 */
package com.damontung.bridge;

/**
 * @author guangzhd
 *
 */
public class RedCircle implements DrawAPI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.bridge.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw circle[Color: red, radius: " + radius + ", x: " + x + ", y: " + y);

	}

}
