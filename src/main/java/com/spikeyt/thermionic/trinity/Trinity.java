package com.spikeyt.thermionic.trinity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.spikeyt.thermionic.trinity.items.CustomAxeItem;
import com.spikeyt.thermionic.trinity.lists.TrinityItems;
import com.spikeyt.thermionic.trinity.lists.TrinityToolMaterials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("trinity")
public class Trinity {
	
	public static Trinity instance;
	public static final String MODID = "trinity";
	private static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final ItemGroup WEAPONS = new WeaponsItemGroup();
	public static final ItemGroup CRAFTING = new CraftingItemGroup();
	

	
	public Trinity() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}	
	
	private void setup(final FMLCommonSetupEvent event) {
		
	     LOGGER.info("Setup Method Registerd.");
		
	}
	
	private void clientRegistries(final FMLCommonSetupEvent event) {
		
		LOGGER.info("Client Registries Method Registerd.");
		
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event){
			
			
			event.getRegistry().registerAll(
					
					//Items
					
					//wood
					TrinityItems.spear_head_wood = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("spear_head_wood")),
					TrinityItems.battle_axe_head_wood = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("battle_axe_head_wood")),
					TrinityItems.war_hammer_head_wood = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("war_hammer_head_wood")),
					
					//gold
					TrinityItems.spear_head_gold = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("spear_head_gold")),
					TrinityItems.battle_axe_head_gold = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("battle_axe_head_gold")),
					TrinityItems.war_hammer_head_gold = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("war_hammer_head_gold")),
					
					//stone
					TrinityItems.spear_head_stone = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("spear_head_stone")),
					TrinityItems.battle_axe_head_stone = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("battle_axe_head_stone")),
					TrinityItems.war_hammer_head_stone = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("war_hammer_head_stone")),
					
					//iron
					TrinityItems.spear_head_iron = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("spear_head_iron")),
					TrinityItems.battle_axe_head_iron = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("battle_axe_head_iron")),
					TrinityItems.war_hammer_head_iron = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("war_hammer_head_iron")),
					
					//diamond
					TrinityItems.spear_head_diamond = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("spear_head_diamond")),
					TrinityItems.battle_axe_head_diamond = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("battle_axe_head_diamond")),
					TrinityItems.war_hammer_head_diamond = new Item(new Item.Properties().group(CRAFTING)).setRegistryName(location("war_hammer_head_diamond")),
					
					//Weapons || The second number after the material as seen below is the attack speed, when it is at 0 it is at 4 so if you wanted something like 1 you do -3
					
					//wood
					TrinityItems.spear_wood = new SwordItem(TrinityToolMaterials.spearwoodmat, 0, -1.5f, new Item.Properties().group(WEAPONS)).setRegistryName(location("spear_wood")),
					TrinityItems.battle_axe_wood = new CustomAxeItem(TrinityToolMaterials.woodbattleaxemat, 0, -3.2f, new Item.Properties().group(WEAPONS)).setRegistryName(location("battle_axe_wood")),
					TrinityItems.war_hammer_wood = new SwordItem(TrinityToolMaterials.woodwarhammermat, 0, -2.5f, new Item.Properties().group(WEAPONS)).setRegistryName(location("war_hammer_wood")),
					TrinityItems.katana_wood = new SwordItem(TrinityToolMaterials.woodkatanamat, 0, -1.6f, new Item.Properties().group(WEAPONS)).setRegistryName(location("katana_wood")),
					TrinityItems.knife_wood = new SwordItem(TrinityToolMaterials.woodknifemat, 0, -2.3f, new Item.Properties().group(WEAPONS)).setRegistryName(location("knife_wood")),
					TrinityItems.halberd_wood = new SwordItem(TrinityToolMaterials.woodhalberdmat, 0, -2.7f, new Item.Properties().group(WEAPONS)).setRegistryName(location("halberd_wood")),
					
					//gold
					TrinityItems.spear_gold = new SwordItem(TrinityToolMaterials.speargoldmat, 0, -1.5f, new Item.Properties().group(WEAPONS)).setRegistryName(location("spear_gold")),
					TrinityItems.battle_axe_gold = new CustomAxeItem(TrinityToolMaterials.goldbattleaxemat, 0, -3.0f, new Item.Properties().group(WEAPONS)).setRegistryName(location("battle_axe_gold")),
					TrinityItems.war_hammer_gold = new SwordItem(TrinityToolMaterials.goldwarhammermat, 0, -2.5f, new Item.Properties().group(WEAPONS)).setRegistryName(location("war_hammer_gold")),
					TrinityItems.katana_gold = new SwordItem(TrinityToolMaterials.goldkatanamat, 0, -1.6f, new Item.Properties().group(WEAPONS)).setRegistryName(location("katana_gold")),
					TrinityItems.knife_gold = new SwordItem(TrinityToolMaterials.goldknifemat, 0, -2.3f, new Item.Properties().group(WEAPONS)).setRegistryName(location("knife_gold")),
					TrinityItems.halberd_gold = new SwordItem(TrinityToolMaterials.goldhalberdmat, 0, -2.7f, new Item.Properties().group(WEAPONS)).setRegistryName(location("halberd_gold")),
					
					
					
					//stone
					TrinityItems.spear_stone = new SwordItem(TrinityToolMaterials.spearstonemat, 0, -1.5f, new Item.Properties().group(WEAPONS)).setRegistryName(location("spear_stone")),
					TrinityItems.battle_axe_stone = new CustomAxeItem(TrinityToolMaterials.stonebattleaxemat, 0, -3.2f, new Item.Properties().group(WEAPONS)).setRegistryName(location("battle_axe_stone")),
					TrinityItems.war_hammer_stone = new SwordItem(TrinityToolMaterials.stonewarhammermat, 0, -2.5f, new Item.Properties().group(WEAPONS)).setRegistryName(location("war_hammer_stone")),
					TrinityItems.katana_stone = new SwordItem(TrinityToolMaterials.stonekatanamat, 0, -1.6f, new Item.Properties().group(WEAPONS)).setRegistryName(location("katana_stone")),
					TrinityItems.knife_stone = new SwordItem(TrinityToolMaterials.stoneknifemat, 0, -2.3f, new Item.Properties().group(WEAPONS)).setRegistryName(location("knife_stone")),
					TrinityItems.halberd_stone = new SwordItem(TrinityToolMaterials.stonehalberdmat, 0, -2.7f, new Item.Properties().group(WEAPONS)).setRegistryName(location("halberd_stone")),
					
					//iron
					TrinityItems.spear_iron = new SwordItem(TrinityToolMaterials.spearironmat, 0, -1.5f, new Item.Properties().group(WEAPONS)).setRegistryName(location("spear_iron")),
					TrinityItems.battle_axe_iron = new CustomAxeItem(TrinityToolMaterials.ironbattleaxemat, 0, -3.1f, new Item.Properties().group(WEAPONS)).setRegistryName(location("battle_axe_iron")),
					TrinityItems.war_hammer_iron = new SwordItem(TrinityToolMaterials.ironwarhammermat, 0, -2f, new Item.Properties().group(WEAPONS)).setRegistryName(location("war_hammer_iron")),
					TrinityItems.katana_iron = new SwordItem(TrinityToolMaterials.ironkatanamat, 0, -1.6f, new Item.Properties().group(WEAPONS)).setRegistryName(location("katana_iron")),
					TrinityItems.knife_iron = new SwordItem(TrinityToolMaterials.ironknifemat, 0, -2.3f, new Item.Properties().group(WEAPONS)).setRegistryName(location("knife_iron")),
					TrinityItems.halberd_iron = new SwordItem(TrinityToolMaterials.ironhalberdmat, 0, -2.7f, new Item.Properties().group(WEAPONS)).setRegistryName(location("halberd_iron")),
					
					//diamond
					TrinityItems.spear_diamond = new SwordItem(TrinityToolMaterials.speardiamondmat, 0, -1.5f, new Item.Properties().group(WEAPONS)).setRegistryName(location("spear_diamond")),
					TrinityItems.battle_axe_diamond = new CustomAxeItem(TrinityToolMaterials.diamondbattleaxemat, 0, -3.0f, new Item.Properties().group(WEAPONS)).setRegistryName(location("battle_axe_diamond")),
					TrinityItems.war_hammer_diamond = new SwordItem(TrinityToolMaterials.diamondwarhammermat, 0, -2.5f, new Item.Properties().group(WEAPONS)).setRegistryName(location("war_hammer_diamond")),
					TrinityItems.katana_diamond = new SwordItem(TrinityToolMaterials.diamondkatanamat, 0, -1.6f, new Item.Properties().group(WEAPONS)).setRegistryName(location("katana_diamond")),
					TrinityItems.knife_diamond = new SwordItem(TrinityToolMaterials.diamondknifemat, 0, -2.3f, new Item.Properties().group(WEAPONS)).setRegistryName(location("knife_diamond")),
					TrinityItems.halberd_diamond = new SwordItem(TrinityToolMaterials.diamondhalberdmat, 0, -2.7f, new Item.Properties().group(WEAPONS)).setRegistryName(location("halberd_diamond"))
					
					);
				
			LOGGER.info("Items Registerd");
		}
		
	

		
		public static ResourceLocation location(String name){
			
			return new ResourceLocation(MODID, name);
			
		}
			
	}
	
}
