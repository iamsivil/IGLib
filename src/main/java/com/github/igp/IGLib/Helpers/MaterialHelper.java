package com.github.igp.IGLib.Helpers;

import org.bukkit.Material;

@SuppressWarnings("unused")
public class MaterialHelper
{
	public static boolean isValidBlockMaterial(final Material material)
	{
		if (material.isBlock())
		{
			switch (material)
			{
				case REDSTONE_TORCH_ON:
				case REDSTONE_TORCH_OFF:
				case PISTON_BASE:
				case PISTON_EXTENSION:
				case PISTON_MOVING_PIECE:
				case PISTON_STICKY_BASE:
				case DISPENSER:
				case SAPLING:
				case LONG_GRASS:
				case DEAD_BUSH:
				case BED:
				case BED_BLOCK:
				case WATER:
				case STATIONARY_WATER:
				case LAVA:
				case STATIONARY_LAVA:
				case RAILS:
				case POWERED_RAIL:
				case DETECTOR_RAIL:
				case RED_ROSE:
				case YELLOW_FLOWER:
				case BROWN_MUSHROOM:
				case RED_MUSHROOM:
				case TORCH:
				case FIRE:
				case REDSTONE_WIRE:
				case CROPS:
				case FURNACE:
				case BURNING_FURNACE:
				case SIGN_POST:
				case WALL_SIGN:
				case WOODEN_DOOR:
				case WOOD_DOOR:
				case IRON_DOOR:
				case IRON_DOOR_BLOCK:
				case LADDER:
				case LEVER:
				case STONE_BUTTON:
				case PORTAL:
				case LOCKED_CHEST:
				case DIODE_BLOCK_ON:
				case DIODE_BLOCK_OFF:
				case MONSTER_EGGS:
				case PUMPKIN_STEM:
				case MELON_STEM:
				case VINE:
				case WATER_LILY:
				case NETHER_WARTS:
				case ENDER_PORTAL:
					return false;
				default:
					return true;
			}
		}
		return false;
	}

	public static boolean isValidContainerMaterial(final Material material)
	{
		switch (material)
		{
			case CHEST:
			case DISPENSER:
			case FURNACE:
			case BURNING_FURNACE:
			case ENDER_CHEST:
				return true;
			default:
				return false;
		}
	}

	public static boolean isValidRailMaterial(final Material material)
	{
		switch (material)
		{
			case RAILS:
			case POWERED_RAIL:
			case DETECTOR_RAIL:
				return true;
			default:
				return false;
		}
	}

	public static boolean isValidVehicleMaterial(final Material material)
	{
		switch (material)
		{
			case BOAT:
			case MINECART:
			case POWERED_MINECART:
			case STORAGE_MINECART:
				return true;
			default:
				return false;
		}
	}

	public static Material getMaterialFromString(final String string)
	{
		Material material = null;
		final String s = string.trim().toUpperCase();

		try
		{
			material = Material.getMaterial(Integer.parseInt(s));
		}
		catch (final NumberFormatException ignore)
		{
		}

		if (material == null)
			material = Material.getMaterial(s);

		return material;
	}
}
