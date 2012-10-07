package com.github.igp.IGLib.Runnables;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("UnusedDeclaration")
public class BlockSetter implements Runnable
{
	private final Location location;
	private final Material material;
	private final Byte data;

	public BlockSetter(final Block block, final ItemStack stack)
	{
		this.location = new Location(block.getLocation().getWorld(), block.getLocation().getBlockX(), block.getLocation().getBlockY(), block.getLocation().getBlockZ());
		this.material = stack.getType();
		data = stack.getData().getData();
	}

	public BlockSetter(final Block block, final Material material)
	{
		this.location = new Location(block.getLocation().getWorld(), block.getLocation().getBlockX(), block.getLocation().getBlockY(), block.getLocation().getBlockZ());
		this.material = material;
		data = null;
	}

	@Override
	public void run()
	{
		if ((location == null) || (material == null))
			return;

		location.getBlock().setType(material);

		if (data != null)
			location.getBlock().setData(data);
	}
}
