package com.spikeyt.thermionic.trinity.registries;

import com.spikeyt.thermionic.trinity.Trinity;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

public class ItemRegistries {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Trinity.MODID);
	
	//Register An Item
	//public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().tab(Trinity.WEAPONS)));
	
	
}
