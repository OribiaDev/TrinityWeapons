package com.spikeyt.thermionic.trinity.registries;

import com.spikeyt.thermionic.trinity.Trinity;
import com.spikeyt.thermionic.trinity.lists.TrinityItems;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ItemRegistries {
	
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event){						
			event.getRegistry().registerAll(					
					//wood
					TrinityItems.spear_head_wood = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("spear_head_wood")),
					TrinityItems.battle_axe_head_wood = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("battle_axe_head_wood")),
					TrinityItems.war_hammer_head_wood = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("war_hammer_head_wood")),
					
					//gold
					TrinityItems.spear_head_gold = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("spear_head_gold")),
					TrinityItems.battle_axe_head_gold = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("battle_axe_head_gold")),
					TrinityItems.war_hammer_head_gold = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("war_hammer_head_gold")),
					
					//stone
					TrinityItems.spear_head_stone = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("spear_head_stone")),
					TrinityItems.battle_axe_head_stone = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("battle_axe_head_stone")),
					TrinityItems.war_hammer_head_stone = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("war_hammer_head_stone")),
					
					//iron
					TrinityItems.spear_head_iron = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("spear_head_iron")),
					TrinityItems.battle_axe_head_iron = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("battle_axe_head_iron")),
					TrinityItems.war_hammer_head_iron = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("war_hammer_head_iron")),
					
					//diamond
					TrinityItems.spear_head_diamond = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("spear_head_diamond")),
					TrinityItems.battle_axe_head_diamond = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("battle_axe_head_diamond")),
					TrinityItems.war_hammer_head_diamond = new Item(new Item.Properties().group(Trinity.CRAFTING)).setRegistryName(location("war_hammer_head_diamond"))

					);
				
			Trinity.LOGGER.info("Items Registerd");
		}
		
	

		
		public static ResourceLocation location(String name){
			
			return new ResourceLocation(Trinity.MODID, name);
			
		}
			
	}
	
}
