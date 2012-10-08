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

	public static BlockFace getRotatePlus90Face(BlockFace face)
	{
		switch (face)
		{
			case NORTH:
				return BlockFace.EAST;
			case EAST:
				return BlockFace.SOUTH;
			case SOUTH:
				return BlockFace.WEST;
			case WEST:
				return BlockFace.NORTH;
			default:
				return null;
		}
	}

	public static BlockFace getRotateNeg90Face(BlockFace face)
	{
		switch (face)
		{
			case NORTH:
				return BlockFace.WEST;
			case WEST:
				return BlockFace.SOUTH;
			case SOUTH:
				return BlockFace.EAST;
			case EAST:
				return BlockFace.NORTH;
			default:
				return null;
		}
	}
}
