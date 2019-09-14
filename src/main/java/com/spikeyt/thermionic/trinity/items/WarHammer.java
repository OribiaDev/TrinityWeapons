package com.spikeyt.thermionic.trinity.items;

import java.util.Map;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class WarHammer extends SwordItem{

	public WarHammer(IItemTier tier, int attackDamage, float attackSpeed, Properties builder) {
		super(tier, attackDamage, attackSpeed, builder);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {			
			ITextComponent name = stack.getDisplayName();
			//Trinity.LOGGER.info(name);
			if(name.getString().matches("taddgy")) {
				//Trinity.LOGGER.info("NameThingWorks!");
				Map<Enchantment, Integer> enchants = EnchantmentHelper.getEnchantments(stack);
				if(enchants.get(Enchantment.getEnchantmentByID(11))==null) {
					stack.addEnchantment(Enchantment.getEnchantmentByID(11), 2);					
					super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
				}else {return;}
		}
	}
}




