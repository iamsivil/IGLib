package com.github.igp.IGLib.Runnables;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;

public class EntitySpawner implements Runnable
{
	private final Location location;
	private final EntityType entityType;

	public EntitySpawner(final Location location, final EntityType entityType)
	{
		this.location = location;
		this.entityType = entityType;
	}

	@Override
	public void run()
	{
		if ((location == null) || (entityType == null))
			return;

		location.getWorld().spawn(location, entityType.getEntityClass());
	}
}
