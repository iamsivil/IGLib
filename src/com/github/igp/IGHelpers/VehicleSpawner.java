package com.github.igp.IGHelpers;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.PoweredMinecart;
import org.bukkit.entity.StorageMinecart;

public class VehicleSpawner implements Runnable
{
	private final Location location;
	private final Material material;

	public VehicleSpawner(final Location location, final Material material)
	{
		this.location = location;
		this.material = material;
	}

	@Override
	public void run()
	{
		if ((location == null) || (material == null))
			return;

		if (material.equals(Material.BOAT))
			location.getWorld().spawn(location, Boat.class);
		else if (material.equals(Material.MINECART))
			location.getWorld().spawn(location, Minecart.class);
		else if (material.equals(Material.POWERED_MINECART))
			location.getWorld().spawn(location, PoweredMinecart.class);
		else if (material.equals(Material.STORAGE_MINECART))
			location.getWorld().spawn(location, StorageMinecart.class);
	}
}
