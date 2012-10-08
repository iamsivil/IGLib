package com.github.igp.IGLib.Helpers;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class BlockHelper
{
	public static Location getBlockCenter(final Block block)
	{
		return new Location(block.getWorld(), block.getLocation().getBlockX() + 0.5, block.getLocation().getBlockY() + 0.5, block.getLocation().getBlockZ() + 0.5);
	}

	public static Boolean isBlockPowered(final Block b, final BlockFace ignore)
	{
		for (final BlockFace face : BlockFaceHelper.getAdjacentFaces())
		{
			if ((face != null) && face.equals(ignore))
				continue;

			if (b.getRelative(face).getBlockPower(face) == 0)
				continue;

			return true;
		}

		return false;
	}
}
