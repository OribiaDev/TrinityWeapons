package com.spikeyt.thermionic.trinity.registries;

import com.spikeyt.thermionic.trinity.Trinity;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WeaponRegistries {	
	
	//Event bus register
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Trinity.MODID);
	
	//Weapon Register Example (first number is damage, while second is attack speed)
	//public static final RegistryObject<SwordItem> EXAMPLE_SWORD = ITEMS.register("example_sword", () -> new SwordItem(Tiers.EXAMPLE, 0, 0, props()));
	
	//Axe Register Example
	//public static final RegistryObject<AxeItem> EXAMPLE_AXE = ITEMS.register("example axe", () -> new AxeItem(Tiers.EXAMPLE, 0, 0, props()));
	
	
	//WeaponRegisters
	//Wood
	public static final RegistryObject<SwordItem> SPEAR_WOOD = ITEMS.register("spear_wood", () -> new SwordItem(Tiers.SPEAR_TIER_WOOD, 0, -1.7f, props()));
	public static final RegistryObject<AxeItem> AXE_WOOD = ITEMS.register("battle_axe_wood", () -> new AxeItem(Tiers.AXE_TIER_WOOD, 0, -3.2f, props()));
	public static final RegistryObject<SwordItem> WAR_HAMMER_WOOD = ITEMS.register("war_hammer_wood", () -> new SwordItem(Tiers.HAMMER_TIER_WOOD, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> KATANA_WOOD = ITEMS.register("katana_wood", () -> new SwordItem(Tiers.KATANA_TIER_WOOD, 0, -1.6f, props()));
	public static final RegistryObject<SwordItem> KNIFE_WOOD = ITEMS.register("knife_wood", () -> new SwordItem(Tiers.KNIFE_TIER_WOOD, 0, -1.5f, props()));
	public static final RegistryObject<SwordItem> HALBERD_WOOD = ITEMS.register("halberd_wood", () -> new SwordItem(Tiers.HALBERD_TIER_WOOD, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> DAGGER_WOOD = ITEMS.register("dagger_wood", () -> new SwordItem(Tiers.DAGGER_TIER_WOOD, 0, -0.6f, props()));
	public static final RegistryObject<SwordItem> LANCE_WOOD = ITEMS.register("lance_wood", () -> new SwordItem(Tiers.LANCE_TIER_WOOD, 0, -1.8f, props()));
	public static final RegistryObject<SwordItem> GUISARME_WOOD = ITEMS.register("guisarme_wood", () -> new SwordItem(Tiers.GUISARME_TIER_WOOD, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> LUCERNE_HAMMER_WOOD = ITEMS.register("lucerne_hammer_wood", () -> new SwordItem(Tiers.LUCERNE_TIER_WOOD, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> QUARTERSTAFF_WOOD = ITEMS.register("quarterstaff_wood", () -> new SwordItem(Tiers.QUARTERSTAFF_TIER_WOOD, 0, -1.6f, props()));
	
	//Gold
	public static final RegistryObject<SwordItem> SPEAR_GOLD = ITEMS.register("spear_gold", () -> new SwordItem(Tiers.SPEAR_TIER_GOLD, 0, -1.7f, props()));
	public static final RegistryObject<AxeItem> AXE_GOLD = ITEMS.register("battle_axe_gold", () -> new AxeItem(Tiers.AXE_TIER_GOLD, 0, -3.0f, props()));
	public static final RegistryObject<SwordItem> WAR_HAMMER_GOLD = ITEMS.register("war_hammer_gold", () -> new SwordItem(Tiers.HAMMER_TIER_GOLD, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> KATANA_GOLD = ITEMS.register("katana_gold", () -> new SwordItem(Tiers.KATANA_TIER_GOLD, 0, -1.6f, props()));
	public static final RegistryObject<SwordItem> KNIFE_GOLD = ITEMS.register("knife_gold", () -> new SwordItem(Tiers.KNIFE_TIER_GOLD, 0, -1.5f, props()));
	public static final RegistryObject<SwordItem> HALBERD_GOLD = ITEMS.register("halberd_gold", () -> new SwordItem(Tiers.HALBERD_TIER_GOLD, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> DAGGER_GOLD = ITEMS.register("dagger_gold", () -> new SwordItem(Tiers.DAGGER_TIER_GOLD, 0, -0.6f, props()));
	public static final RegistryObject<SwordItem> LANCE_GOLD = ITEMS.register("lance_gold", () -> new SwordItem(Tiers.LANCE_TIER_GOLD, 0, -1.8f, props()));
	public static final RegistryObject<SwordItem> GUISARME_GOLD = ITEMS.register("guisarme_gold", () -> new SwordItem(Tiers.GUISARME_TIER_GOLD, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> LUCERNE_HAMMER_GOLD = ITEMS.register("lucerne_hammer_gold", () -> new SwordItem(Tiers.LUCERNE_TIER_GOLD, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> QUARTERSTAFF_GOLD = ITEMS.register("quarterstaff_gold", () -> new SwordItem(Tiers.QUARTERSTAFF_TIER_GOLD, 0, -1.6f, props()));
	
	//Stone
	public static final RegistryObject<SwordItem> SPEAR_STONE = ITEMS.register("spear_stone", () -> new SwordItem(Tiers.SPEAR_TIER_STONE, 0, -1.7f, props()));
	public static final RegistryObject<AxeItem> AXE_STONE = ITEMS.register("battle_axe_stone", () -> new AxeItem(Tiers.AXE_TIER_STONE, 0, -3.2f, props()));
	public static final RegistryObject<SwordItem> WAR_HAMMER_STONE = ITEMS.register("war_hammer_stone", () -> new SwordItem(Tiers.HAMMER_TIER_STONE, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> KATANA_STONE = ITEMS.register("katana_stone", () -> new SwordItem(Tiers.KATANA_TIER_STONE, 0, -1.6f, props()));
	public static final RegistryObject<SwordItem> KNIFE_STONE = ITEMS.register("knife_stone", () -> new SwordItem(Tiers.KNIFE_TIER_STONE, 0, -1.5f, props()));
	public static final RegistryObject<SwordItem> HALBERD_STONE = ITEMS.register("halberd_stone", () -> new SwordItem(Tiers.HALBERD_TIER_STONE, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> DAGGER_STONE = ITEMS.register("dagger_stone", () -> new SwordItem(Tiers.DAGGER_TIER_STONE, 0, -0.6f, props()));
	public static final RegistryObject<SwordItem> LANCE_STONE = ITEMS.register("lance_stone", () -> new SwordItem(Tiers.LANCE_TIER_STONE, 0, -1.8f, props()));
	public static final RegistryObject<SwordItem> GUISARME_STONE = ITEMS.register("guisarme_stone", () -> new SwordItem(Tiers.GUISARME_TIER_STONE, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> LUCERNE_HAMMER_STONE = ITEMS.register("lucerne_hammer_stone", () -> new SwordItem(Tiers.LUCERNE_TIER_STONE, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> QUARTERSTAFF_STONE = ITEMS.register("quarterstaff_stone", () -> new SwordItem(Tiers.QUARTERSTAFF_TIER_STONE, 0, -1.6f, props()));
	
	//Iron
	public static final RegistryObject<SwordItem> SPEAR_IRON = ITEMS.register("spear_iron", () -> new SwordItem(Tiers.SPEAR_TIER_IRON, 0, -1.7f, props()));
	public static final RegistryObject<AxeItem> AXE_IRON = ITEMS.register("battle_axe_iron", () -> new AxeItem(Tiers.AXE_TIER_IRON, 0, -3.1f, props()));
	public static final RegistryObject<SwordItem> WAR_HAMMER_IRON = ITEMS.register("war_hammer_iron", () -> new SwordItem(Tiers.HAMMER_TIER_IRON, 0, -2f, props()));
	public static final RegistryObject<SwordItem> KATANA_IRON = ITEMS.register("katana_iron", () -> new SwordItem(Tiers.KATANA_TIER_IRON, 0, -1.6f, props()));
	public static final RegistryObject<SwordItem> KNIFE_IRON = ITEMS.register("knife_iron", () -> new SwordItem(Tiers.KNIFE_TIER_IRON, 0, -1.5f, props()));
	public static final RegistryObject<SwordItem> HALBERD_IRON = ITEMS.register("halberd_iron", () -> new SwordItem(Tiers.HALBERD_TIER_IRON, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> DAGGER_IRON = ITEMS.register("dagger_iron", () -> new SwordItem(Tiers.DAGGER_TIER_IRON, 0, -0.6f, props()));
	public static final RegistryObject<SwordItem> LANCE_IRON = ITEMS.register("lance_iron", () -> new SwordItem(Tiers.LANCE_TIER_IRON, 0, -1.8f, props()));
	public static final RegistryObject<SwordItem> GUISARME_IRON = ITEMS.register("guisarme_iron", () -> new SwordItem(Tiers.GUISARME_TIER_IRON, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> LUCERNE_HAMMER_IRON = ITEMS.register("lucerne_hammer_iron", () -> new SwordItem(Tiers.LUCERNE_TIER_IRON, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> QUARTERSTAFF_IRON = ITEMS.register("quarterstaff_iron", () -> new SwordItem(Tiers.QUARTERSTAFF_TIER_IRON, 0, -1.6f, props()));
	
	//Diamond
	public static final RegistryObject<SwordItem> SPEAR_DIAMOND = ITEMS.register("spear_diamond", () -> new SwordItem(Tiers.SPEAR_TIER_DIAMOND, 0, -1.7f, props()));
	public static final RegistryObject<AxeItem> AXE_DIAMOND = ITEMS.register("battle_axe_diamond", () -> new AxeItem(Tiers.AXE_TIER_DIAMOND, 0, -3.0f, props()));
	public static final RegistryObject<SwordItem> WAR_HAMMER_DIAMOND = ITEMS.register("war_hammer_diamond", () -> new SwordItem(Tiers.HAMMER_TIER_DIAMOND, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> KATANA_DIAMOND = ITEMS.register("katana_diamond", () -> new SwordItem(Tiers.KATANA_TIER_DIAMOND, 0, -1.6f, props()));
	public static final RegistryObject<SwordItem> KNIFE_DIAMOND = ITEMS.register("knife_diamond", () -> new SwordItem(Tiers.KNIFE_TIER_DIAMOND, 0, -1.5f, props()));
	public static final RegistryObject<SwordItem> HALBERD_DIAMOND = ITEMS.register("halberd_diamond", () -> new SwordItem(Tiers.HALBERD_TIER_DIAMOND, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> DAGGER_DIAMOND = ITEMS.register("dagger_diamond", () -> new SwordItem(Tiers.DAGGER_TIER_DIAMOND, 0, -0.6f, props()));
	public static final RegistryObject<SwordItem> LANCE_DIAMOND = ITEMS.register("lance_diamond", () -> new SwordItem(Tiers.LANCE_TIER_DIAMOND, 0, -1.8f, props()));
	public static final RegistryObject<SwordItem> GUISARME_DIAMOND = ITEMS.register("guisarme_diamond", () -> new SwordItem(Tiers.GUISARME_TIER_DIAMOND, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> LUCERNE_HAMMER_DIAMOND = ITEMS.register("lucerne_hammer_diamond", () -> new SwordItem(Tiers.LUCERNE_TIER_DIAMOND, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> QUARTERSTAFF_DIAMOND = ITEMS.register("quarterstaff_diamond", () -> new SwordItem(Tiers.QUARTERSTAFF_TIER_DIAMOND, 0, -1.6f, props()));
	
	//Netherite
	public static final RegistryObject<SwordItem> SPEAR_NETHERITE = ITEMS.register("spear_netherite", () -> new SwordItem(Tiers.SPEAR_TIER_NETHERITE, 0, -1.7f, props()));
	public static final RegistryObject<AxeItem> AXE_NETHERITE = ITEMS.register("battle_axe_netherite", () -> new AxeItem(Tiers.AXE_TIER_NETHERITE, 0, -2.9f, props()));
	public static final RegistryObject<SwordItem> WAR_HAMMER_NETHERITE = ITEMS.register("war_hammer_netherite", () -> new SwordItem(Tiers.HAMMER_TIER_NETHERITE, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> KATANA_NETHERITE = ITEMS.register("katana_netherite", () -> new SwordItem(Tiers.KATANA_TIER_NETHERITE, 0, -1.6f, props()));
	public static final RegistryObject<SwordItem> KNIFE_NETHERITE = ITEMS.register("knife_netherite", () -> new SwordItem(Tiers.KNIFE_TIER_NETHERITE, 0, -1.5f, props()));
	public static final RegistryObject<SwordItem> HALBERD_NETHERITE = ITEMS.register("halberd_netherite", () -> new SwordItem(Tiers.HALBERD_TIER_NETHERITE, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> DAGGER_NETHERITE = ITEMS.register("dagger_netherite", () -> new SwordItem(Tiers.DAGGER_TIER_NETHERITE, 0, -0.6f, props()));
	public static final RegistryObject<SwordItem> LANCE_NETHERITE = ITEMS.register("lance_netherite", () -> new SwordItem(Tiers.LANCE_TIER_NETHERITE, 0, -1.8f, props()));
	public static final RegistryObject<SwordItem> GUISARME_NETHERITE = ITEMS.register("guisarme_netherite", () -> new SwordItem(Tiers.GUISARME_TIER_NETHERITE, 0, -2.5f, props()));
	public static final RegistryObject<SwordItem> LUCERNE_HAMMER_NETHERITE = ITEMS.register("lucerne_hammer_netherite", () -> new SwordItem(Tiers.LUCERNE_TIER_NETHERITE, 0, -2.7f, props()));
	public static final RegistryObject<SwordItem> QUARTERSTAFF_NETHERITE = ITEMS.register("quarterstaff_netherite", () -> new SwordItem(Tiers.QUARTERSTAFF_TIER_NETHERITE, 0, -1.6f, props()));
	
	//Makes tabbing easier
	private static Item.Properties props() {
		return new Item.Properties().tab(Trinity.WeaponsTab);
	}
	
	public static class Tiers {
		//Teirs (first number) | 0 = Wood | 1 = Stone/Gold | 2 = Iron | 3 = Diamond | 4 = Netherite | 
		//Secound number is durability 
		//Third number is speed
		// 4th number is attack damage bonus
		//5th number is enchantable value
		//6th Number is tag
		//public static final Tier EXAMPLE = new ForgeTier(2, 800, 1.5f, 3, 350, null, () -> Ingredient.of(WeaponRegistries.EXAMPLE_AXE.get()));
		
		//Spear
		public static final Tier SPEAR_TIER_WOOD = new ForgeTier(0, 69, 0f, 3.8f-1, 42, null, () -> Ingredient.of(WeaponRegistries.SPEAR_WOOD.get()));
		public static final Tier SPEAR_TIER_GOLD = new ForgeTier(1, 42, 0, 3.8f-1, 42, null, () -> Ingredient.of(WeaponRegistries.SPEAR_GOLD.get()));
		public static final Tier SPEAR_TIER_STONE = new ForgeTier(1, 141, 0f, 4f-1, 42, null, () -> Ingredient.of(WeaponRegistries.SPEAR_STONE.get()));
		public static final Tier SPEAR_TIER_IRON = new ForgeTier(2, 260, 0f, 4.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.SPEAR_IRON.get()));
		public static final Tier SPEAR_TIER_DIAMOND = new ForgeTier(3, 1571, 0f, 5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.SPEAR_DIAMOND.get()));
		public static final Tier SPEAR_TIER_NETHERITE = new ForgeTier(4, 2041, 0f, 5.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.SPEAR_NETHERITE.get()));
		
		//Battle Axe
		public static final Tier AXE_TIER_WOOD = new ForgeTier(0, 135, 0f, 4f-1, 42, null, () -> Ingredient.of(WeaponRegistries.AXE_WOOD.get()));
		public static final Tier AXE_TIER_GOLD  = new ForgeTier(1, 48, 0f, 4f-1, 42, null, () -> Ingredient.of(WeaponRegistries.AXE_GOLD.get()));
		public static final Tier AXE_TIER_STONE  = new ForgeTier(1, 147, 0f, 6f-1, 42, null, () -> Ingredient.of(WeaponRegistries.AXE_STONE.get()));
		public static final Tier AXE_TIER_IRON  = new ForgeTier(2, 266, 0f, 8f-1, 42, null, () -> Ingredient.of(WeaponRegistries.AXE_IRON.get()));
		public static final Tier AXE_TIER_DIAMOND  = new ForgeTier(3, 1577, 0f, 10f-1, 42, null, () -> Ingredient.of(WeaponRegistries.AXE_DIAMOND.get()));
		public static final Tier AXE_TIER_NETHERITE  = new ForgeTier(4, 2051, 0f, 12f-1, 42, null, () -> Ingredient.of(WeaponRegistries.AXE_NETHERITE.get()));
		
		//War Hammer
		public static final Tier HAMMER_TIER_WOOD = new ForgeTier(0, 72, 0f, 4.8f-1, 42, null, () -> Ingredient.of(WeaponRegistries.WAR_HAMMER_WOOD.get()));
		public static final Tier HAMMER_TIER_GOLD = new ForgeTier(1, 45, 0f, 4.8f-1, 42, null, () -> Ingredient.of(WeaponRegistries.WAR_HAMMER_GOLD.get()));
		public static final Tier HAMMER_TIER_STONE = new ForgeTier(1, 144, 0f, 5.4f-1, 42, null, () -> Ingredient.of(WeaponRegistries.WAR_HAMMER_STONE.get()));
		public static final Tier HAMMER_TIER_IRON = new ForgeTier(2, 263, 0f, 6.7f-1, 42, null, () -> Ingredient.of(WeaponRegistries.WAR_HAMMER_IRON.get()));
		public static final Tier HAMMER_TIER_DIAMOND = new ForgeTier(3, 1574, 0f, 7f-1, 42, null, () -> Ingredient.of(WeaponRegistries.WAR_HAMMER_DIAMOND.get()));
		public static final Tier HAMMER_TIER_NETHERITE = new ForgeTier(4, 2040, 0f, 8.1f-1, 42, null, () -> Ingredient.of(WeaponRegistries.WAR_HAMMER_NETHERITE.get()));
		
		//Katana
		public static final Tier KATANA_TIER_WOOD = new ForgeTier(0, 75, 0f, 4f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KATANA_WOOD.get()));
		public static final Tier KATANA_TIER_GOLD = new ForgeTier(1, 48, 0f, 4f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KATANA_GOLD.get()));
		public static final Tier KATANA_TIER_STONE = new ForgeTier(1, 147, 0f, 5.2f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KATANA_STONE.get()));
		public static final Tier KATANA_TIER_IRON = new ForgeTier(2, 266, 0f, 6f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KATANA_IRON.get()));
		public static final Tier KATANA_TIER_DIAMOND = new ForgeTier(3, 1577, 0f, 7.2f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KATANA_DIAMOND.get()));
		public static final Tier KATANA_TIER_NETHERITE = new ForgeTier(4, 2035, 0f, 8.2f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KATANA_NETHERITE.get()));
		
		//Knife
		public static final Tier KNIFE_TIER_WOOD = new ForgeTier(0, 65, 0f, 2f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KNIFE_WOOD.get()));
		public static final Tier KNIFE_TIER_GOLD = new ForgeTier(1, 38, 0f, 2f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KNIFE_GOLD.get()));
		public static final Tier KNIFE_TIER_STONE = new ForgeTier(1, 137, 0f, 2.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KNIFE_STONE.get()));
		public static final Tier KNIFE_TIER_IRON = new ForgeTier(2, 256, 0f, 3f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KNIFE_IRON.get()));
		public static final Tier KNIFE_TIER_DIAMOND = new ForgeTier(3, 1567, 0f, 4.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KNIFE_DIAMOND.get()));
		public static final Tier KNIFE_TIER_NETHERITE = new ForgeTier(4, 2045, 0f, 5.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.KNIFE_NETHERITE.get()));
		
		//Halberd
		public static final Tier HALBERD_TIER_WOOD = new ForgeTier(0, 67, 0f, 2.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.HALBERD_WOOD.get()));
		public static final Tier HALBERD_TIER_GOLD = new ForgeTier(1, 40, 0f, 2.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.HALBERD_GOLD.get()));
		public static final Tier HALBERD_TIER_STONE = new ForgeTier(1, 139, 0f, 4.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.HALBERD_STONE.get()));
		public static final Tier HALBERD_TIER_IRON = new ForgeTier(2, 258, 0f, 5.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.HALBERD_IRON.get()));
		public static final Tier HALBERD_TIER_DIAMOND = new ForgeTier(3, 1569, 0f, 6.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.HALBERD_DIAMOND.get()));
		public static final Tier HALBERD_TIER_NETHERITE = new ForgeTier(4, 2049, 0f, 7f-1, 42, null, () -> Ingredient.of(WeaponRegistries.HALBERD_NETHERITE.get()));
		
		//Dagger
		public static final Tier DAGGER_TIER_WOOD = new ForgeTier(0, 58, 0f, 1.8f-1, 42, null, () -> Ingredient.of(WeaponRegistries.DAGGER_WOOD.get()));
		public static final Tier DAGGER_TIER_GOLD = new ForgeTier(1, 31, 0f, 1.8f-1, 42, null, () -> Ingredient.of(WeaponRegistries.DAGGER_GOLD.get()));
		public static final Tier DAGGER_TIER_STONE = new ForgeTier(1, 130, 0f, 2.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.DAGGER_STONE.get()));
		public static final Tier DAGGER_TIER_IRON = new ForgeTier(2, 249, 0f, 3.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.DAGGER_IRON.get()));
		public static final Tier DAGGER_TIER_DIAMOND = new ForgeTier(3, 1560, 0f, 4.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.DAGGER_DIAMOND.get()));
		public static final Tier DAGGER_TIER_NETHERITE = new ForgeTier(4, 2030, 0f, 5.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.DAGGER_NETHERITE.get()));
		
		//Lance
		public static final Tier LANCE_TIER_WOOD = new ForgeTier(0, 75, 0f, 2.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LANCE_WOOD.get()));
		public static final Tier LANCE_TIER_GOLD = new ForgeTier(1, 48, 0f, 2.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LANCE_WOOD.get()));
		public static final Tier LANCE_TIER_STONE = new ForgeTier(1, 147, 0f, 3f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LANCE_WOOD.get()));
		public static final Tier LANCE_TIER_IRON = new ForgeTier(2, 249, 0f, 4.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LANCE_WOOD.get()));
		public static final Tier LANCE_TIER_DIAMOND = new ForgeTier(3, 1570, 0f, 5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LANCE_WOOD.get()));
		public static final Tier LANCE_TIER_NETHERITE = new ForgeTier(4, 2041, 0f, 6f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LANCE_WOOD.get()));
		
		//Guisarme
		public static final Tier GUISARME_TIER_WOOD = new ForgeTier(0, 60, 0f, 3.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.GUISARME_WOOD.get()));
		public static final Tier GUISARME_TIER_GOLD = new ForgeTier(1, 33, 0f, 3.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.GUISARME_GOLD.get()));
		public static final Tier GUISARME_TIER_STONE = new ForgeTier(1, 132, 0f, 4.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.GUISARME_STONE.get()));
		public static final Tier GUISARME_TIER_IRON = new ForgeTier(2, 251, 0f, 5.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.GUISARME_IRON.get()));
		public static final Tier GUISARME_TIER_DIAMOND = new ForgeTier(3, 1570, 0f, 6.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.GUISARME_DIAMOND.get()));
		public static final Tier GUISARME_TIER_NETHERITE = new ForgeTier(4, 2041, 0f, 7.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.GUISARME_NETHERITE.get()));
		
		//Lucerne
		public static final Tier LUCERNE_TIER_WOOD = new ForgeTier(0, 70, 0f, 2.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LUCERNE_HAMMER_WOOD.get()));
		public static final Tier LUCERNE_TIER_GOLD = new ForgeTier(1, 43, 0f, 2.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LUCERNE_HAMMER_GOLD.get()));
		public static final Tier LUCERNE_TIER_STONE = new ForgeTier(1, 142, 0f, 3.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LUCERNE_HAMMER_STONE.get()));
		public static final Tier LUCERNE_TIER_IRON = new ForgeTier(2, 261, 0f, 5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LUCERNE_HAMMER_IRON.get()));
		public static final Tier LUCERNE_TIER_DIAMOND = new ForgeTier(3, 1580, 0f, 6f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LUCERNE_HAMMER_DIAMOND.get()));
		public static final Tier LUCERNE_TIER_NETHERITE = new ForgeTier(4, 2061, 0f, 7.2f-1, 42, null, () -> Ingredient.of(WeaponRegistries.LUCERNE_HAMMER_NETHERITE.get()));
		
		//Quarterstaff
		public static final Tier QUARTERSTAFF_TIER_WOOD = new ForgeTier(0, 58, 0f, 1.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.QUARTERSTAFF_WOOD.get()));
		public static final Tier QUARTERSTAFF_TIER_GOLD = new ForgeTier(1, 38, 0f, 1.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.QUARTERSTAFF_WOOD.get()));
		public static final Tier QUARTERSTAFF_TIER_STONE = new ForgeTier(1, 137, 0f, 2.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.QUARTERSTAFF_WOOD.get()));
		public static final Tier QUARTERSTAFF_TIER_IRON = new ForgeTier(2, 275, 0f, 3f-1, 42, null, () -> Ingredient.of(WeaponRegistries.QUARTERSTAFF_WOOD.get()));
		public static final Tier QUARTERSTAFF_TIER_DIAMOND = new ForgeTier(3, 1569, 0f, 3.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.QUARTERSTAFF_WOOD.get()));
		public static final Tier QUARTERSTAFF_TIER_NETHERITE = new ForgeTier(4, 2049, 0f, 4.5f-1, 42, null, () -> Ingredient.of(WeaponRegistries.QUARTERSTAFF_WOOD.get()));
		
	}
	
}
	
	
	
	

