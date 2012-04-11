package com.github.igp.IGLib.Runnables;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class ItemStackDropper implements Runnable
{
	private final Location location;
	private final ItemStack[] stacks;

	public ItemStackDropper(final Location location, final ItemStack stack)
	{
		this.location = location;
		if (stack != null)
			stacks = new ItemStack[]
			{
				stack
			};
		else
			stacks = null;
	}

	public ItemStackDropper(final Location location, final ItemStack[] stacks)
	{
		this.location = location;
		if (stacks != null)
			this.stacks = stacks;
		else
			this.stacks = null;
	}

	@Override
	public void run()
	{
		if ((location == null) || (stacks == null))
			return;

		for (final ItemStack stack : stacks)
		{
			if ((stack == null) || stack.getType().equals(Material.AIR))
				continue;

			final Item drop = location.getWorld().dropItem(location, stack);
			drop.setVelocity(new Vector(0, 0, 0));
		}
	}
}
