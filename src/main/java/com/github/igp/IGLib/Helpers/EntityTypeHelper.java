package com.github.igp.IGLib.Helpers;

import org.bukkit.entity.EntityType;

public class EntityTypeHelper
{
	public static boolean hasSpawnEgg(final EntityType type)
	{
		switch (type)
		{
		case BLAZE:
		case CAVE_SPIDER:
		case CHICKEN:
		case COW:
		case CREEPER:
		case ENDERMAN:
		case GHAST:
		case MAGMA_CUBE:
		case MUSHROOM_COW:
		case OCELOT:
		case PIG:
		case PIG_ZOMBIE:
		case SHEEP:
		case SILVERFISH:
		case SKELETON:
		case SLIME:
		case SPIDER:
		case SQUID:
		case VILLAGER:
		case WOLF:
		case ZOMBIE:
			return true;
		default:
			return false;
		}
	}
}
