package rp.Exercise.Ex4;

import rp.Exercise.Ex4.mapping.GridMap;
import rp.robotics.mapping.GridMapTest;
import rp.robotics.mapping.IGridMap;
import rp.robotics.mapping.RPLineMap;

public class Ex4P1 extends GridMapTest {

	/***
	 * Create an instance of an object that implements IGridMap from a LineMap.
	 *
	 * @param lineMap The underlying line map
	 * @param gridXSize How many grid positions along the x axis
	 * @param gridYSize How many grid positions along the y axis
	 * @param xStart The x coordinate where grid position (0,0) starts
	 * @param yStart The y coordinate where grid position (0,0) starts
	 * @param cellSize The distance between grid positions
	 * @return
	 */
	public static IGridMap createGridMap(RPLineMap lineMap, int gridXSize, int gridYSize, float xStart, float yStart, float cellSize) {
		return new GridMap(gridXSize, gridYSize, xStart, yStart, cellSize, lineMap);
	}
}