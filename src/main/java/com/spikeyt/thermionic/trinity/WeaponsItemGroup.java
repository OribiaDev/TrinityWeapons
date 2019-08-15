package com.spikeyt.thermionic.trinity;

import com.spikeyt.thermionic.trinity.lists.TrinityItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WeaponsItemGroup extends ItemGroup {
	
	public WeaponsItemGroup() {
		
		super("weapons");
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(TrinityItems.battle_axe_stone);
	}


}