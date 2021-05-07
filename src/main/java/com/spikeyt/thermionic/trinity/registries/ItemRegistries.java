package com.spikeyt.thermionic.trinity.registries;

import com.spikeyt.thermionic.trinity.Trinity;

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
					//Example Item
					//TrinityItems.spear_head_wood = new Item(new Item.Properties().tab(Trinity.CRAFTING)).setRegistryName(location("spear_head_wood"));
					);
				
			Trinity.LOGGER.info("Items Registerd");
		}
		
	

		
		public static ResourceLocation location(String name){
			
			return new ResourceLocation(Trinity.MODID, name);
			
		}
			
	}
	
}
