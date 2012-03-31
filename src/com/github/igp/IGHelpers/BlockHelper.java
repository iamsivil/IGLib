package com.github.igp.IGHelpers;

import org.bukkit.Location;
import org.bukkit.block.Block;

public class BlockHelper
{
	public Location getBlockCenter(final Block block)
	{
		return new Location(block.getWorld(), block.getLocation().getBlockX() + 0.5, block.getLocation().getBlockY() + 0.5, block.getLocation().getBlockZ() + 0.5);
	}
}
