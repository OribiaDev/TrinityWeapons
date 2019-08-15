package com.spikeyt.thermionic.trinity;

import com.spikeyt.thermionic.trinity.lists.TrinityItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CraftingItemGroup extends ItemGroup {

	public CraftingItemGroup() {
		
		super("crafting");
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(TrinityItems.spear_head_iron);
	}
	
}
