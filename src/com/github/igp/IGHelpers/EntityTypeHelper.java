package com.github.igp.IGHelpers;

import org.bukkit.entity.EntityType;

public class EntityTypeHelper
{
	public boolean isAnimalEntityType(final EntityType type)
	{
		if (type.equals(EntityType.CHICKEN))
			return true;
		if (type.equals(EntityType.COW))
			return true;
		if (type.equals(EntityType.OCELOT))
			return true;
		if (type.equals(EntityType.PIG))
			return true;
		if (type.equals(EntityType.SHEEP))
			return true;
		if (type.equals(EntityType.WOLF))
			return true;
		if (type.equals(EntityType.MUSHROOM_COW))
			return true;
		// not actual animal
		if (type.equals(EntityType.SQUID))
			return true;
		// not actual animal
		if (type.equals(EntityType.VILLAGER))
			return true;

		return false;
	}

	public boolean isMonsterEntityType(final EntityType type)
	{
		if (type.equals(EntityType.BLAZE))
			return true;
		if (type.equals(EntityType.CAVE_SPIDER))
			return true;
		if (type.equals(EntityType.CREEPER))
			return true;
		if (type.equals(EntityType.ENDERMAN))
			return true;
		if (type.equals(EntityType.GHAST))
			return true;
		if (type.equals(EntityType.MAGMA_CUBE))
			return true;
		if (type.equals(EntityType.SILVERFISH))
			return true;
		if (type.equals(EntityType.SKELETON))
			return true;
		if (type.equals(EntityType.SPIDER))
			return true;
		if (type.equals(EntityType.PIG_ZOMBIE))
			return true;
		if (type.equals(EntityType.SLIME))
			return true;
		if (type.equals(EntityType.ZOMBIE))
			return true;

		return false;
	}

}
