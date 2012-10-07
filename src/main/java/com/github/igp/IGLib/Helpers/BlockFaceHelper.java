package com.github.igp.IGLib.Helpers;

import org.bukkit.block.BlockFace;

public class BlockFaceHelper
{
	private static final BlockFace[] adjacentFaces =
	{
			BlockFace.UP,
			BlockFace.DOWN,
			BlockFace.NORTH,
			BlockFace.EAST,
			BlockFace.SOUTH,
			BlockFace.WEST
	};

	public static BlockFace[] getAdjacentFaces()
	{
		return adjacentFaces;
	}
}
