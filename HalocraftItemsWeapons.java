package net.killerchief.halocraft.config;

import net.killerchief.halocraft.Halocraft;
import net.killerchief.halocraft.items.HalocraftItem;
import net.killerchief.halocraft.items.ItemEnergySword;
import net.killerchief.halocraft.items.ItemMachete;
import net.killerchief.kcweaponmod.ItemWeapon;
import net.killerchief.kcweaponmod.KCWeaponMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;

public class HalocraftItemsWeapons {

	public static ItemWeapon BattleRifle;
	public static ItemWeapon DMR;
	public static ItemWeapon AssaultRifle;
	public static ItemWeapon Shotgun;
	public static ItemWeapon SniperRifle;
	public static ItemWeapon Magnum;
	public static ItemWeapon SMG;
	public static ItemWeapon RocketLauncher;
	public static ItemWeapon Carbine;
	public static ItemWeapon PlasmaRifle;
	public static ItemWeapon PlasmaPistol;
	public static ItemWeapon Needler;
	public static ItemWeapon BeamRifle;
	public static ItemWeapon Flamethrower;
	public static ItemWeapon Spiker;
	public static ItemWeapon Mauler;
	public static ItemWeapon FragGrenade;
	public static ItemWeapon PlasmaGrenade;
	public static ItemWeapon FirebombGrenade;

	public static Item SpikeGrenade = null;
	
	public static int ModMapOffset = 0;

	public static void initWeapons()
	{
		ModMapOffset = KCWeaponMod.modMap.get(Halocraft.MODID);
		BattleRifle = KCWeaponMod.weapons[ModMapOffset];
		DMR = KCWeaponMod.weapons[ModMapOffset+1];
		AssaultRifle = KCWeaponMod.weapons[ModMapOffset+2];
		Shotgun = KCWeaponMod.weapons[ModMapOffset+3];
		SniperRifle = KCWeaponMod.weapons[ModMapOffset+4];
		Magnum = KCWeaponMod.weapons[ModMapOffset+5];
		SMG = KCWeaponMod.weapons[ModMapOffset+6];
		RocketLauncher = KCWeaponMod.weapons[ModMapOffset+7];
		Carbine = KCWeaponMod.weapons[ModMapOffset+8];
		PlasmaRifle = KCWeaponMod.weapons[ModMapOffset+9];
		PlasmaPistol = KCWeaponMod.weapons[ModMapOffset+10];
		Needler = KCWeaponMod.weapons[ModMapOffset+11];
		BeamRifle = KCWeaponMod.weapons[ModMapOffset+12];
		Flamethrower = KCWeaponMod.weapons[ModMapOffset+13];
		Spiker = KCWeaponMod.weapons[ModMapOffset+14];
		Mauler = KCWeaponMod.weapons[ModMapOffset+15];
		FragGrenade = KCWeaponMod.weapons[ModMapOffset+16];
		PlasmaGrenade = KCWeaponMod.weapons[ModMapOffset+17];
		FirebombGrenade = KCWeaponMod.weapons[ModMapOffset+18];
	}
	
	//Chomp...
}
