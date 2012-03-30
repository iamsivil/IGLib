package com.github.igp.IGHelpers;

import org.bukkit.block.BlockFace;

public class BlockFaceHelper
{
	private final BlockFace[] adjacentFaces =
	{
			BlockFace.UP,
			BlockFace.DOWN,
			BlockFace.NORTH,
			BlockFace.EAST,
			BlockFace.SOUTH,
			BlockFace.WEST
	};

	public final BlockFace[] getAdjacentFaces()
	{
		return adjacentFaces;
	}

	public final BlockFace getOppositeFace(final BlockFace face)
	{
		if (face.equals(BlockFace.UP))
			return BlockFace.DOWN;

		if (face.equals(BlockFace.DOWN))
			return BlockFace.UP;

		if (face.equals(BlockFace.NORTH))
			return BlockFace.SOUTH;

		if (face.equals(BlockFace.SOUTH))
			return BlockFace.NORTH;

		if (face.equals(BlockFace.EAST))
			return BlockFace.WEST;

		if (face.equals(BlockFace.WEST))
			return BlockFace.EAST;

		return null;
	}
}