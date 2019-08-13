package thermionic.trinity.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier {
	spearwoodmat(3.5f, 1.0f, 69, 0, 42, ItemList.spear_head_wood),
	speargoldmat(3.8f, 1.0f, 42, 0, 42, ItemList.spear_head_gold),
	spearstonemat(4f, 1.0f, 141, 0, 42, ItemList.spear_head_stone),
	spearironmat(4.5f, 1.0f, 260, 0, 42, ItemList.spear_head_iron),
	speardiamondmat(5.5f, 1.0f, 1571, 0, 42, ItemList.spear_head_diamond),
	woodbattleaxemat(6.9f, 2.0f, 135, 0, 42, ItemList.spear_head_wood),
	goldbattleaxemat(7.4f, 10.0f, 48, 0, 42, ItemList.spear_head_gold),
	stonebattleaxemat(7.4f, 4.0f, 147, 0, 42, ItemList.spear_head_stone),
	ironbattleaxemat(8.2f, 6.0f, 266, 0, 42, ItemList.spear_head_iron),
	diamondbattleaxemat(8.4f, 8.0f, 1577, 0, 42, ItemList.spear_head_diamond),
	woodwarhammermat(6.8f, 1.0f, 72, 0, 42, ItemList.war_hammer_head_wood),
	goldwarhammermat(7.1f, 1.0f, 45, 0, 42, ItemList.war_hammer_head_gold),
	stonewarhammermat(7.4f, 1.0f, 144, 0, 42, ItemList.war_hammer_head_stone),
	ironwarhammermat(7.7f, 1.0f, 263, 0, 42, ItemList.war_hammer_head_iron),
	diamondwarhammermat(8f, 1.0f, 1574, 0, 42, ItemList.war_hammer_head_diamond),
	woodkatanamat(6.5f, 1.0f, 75, 0, 42, ItemList.katana_wood),
	goldkatanamat(6.8f, 1.0f, 48, 0, 42, ItemList.katana_gold),
	stonekatanamat(7f, 1.0f, 147, 0, 42, ItemList.katana_stone),
	ironkatanamat(7.5f, 1.0f, 266, 0, 42, ItemList.katana_iron),
	diamondkatanamat(8.1f, 1.0f, 1577, 0, 42, ItemList.katana_diamond),
	woodknifemat(3.7f, 1.0f, 65, 0, 42, ItemList.knife_wood),
	goldknifemat(3.9f, 1.0f, 38, 0, 42, ItemList.knife_gold),
	stoneknifemat(4.2f, 1.0f, 137, 0, 42, ItemList.knife_stone),
	ironknifemat(5.2f, 1.0f, 256, 0, 42, ItemList.knife_iron),
	diamondknifemat(5.8f, 1.0f, 1567, 0, 42, ItemList.knife_diamond),
	woodhalberdmat(6.7f, 1.0f, 67, 0, 42, ItemList.halberd_wood),
	goldhalberdmat(2f, 1.0f, 40, 0, 42, ItemList.halberd_gold),
	stonehalberdmat(7.3f, 1.0f, 139, 0, 42, ItemList.halberd_stone),
	ironhalberdmat(8.0f, 1.0f, 258, 0, 42, ItemList.halberd_iron),
	diamondhalberdmat(8.2f, 1.0f, 1569, 0, 42, ItemList.halberd_diamond);
	
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {
	
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial  = repairMaterial;
		
	}

	@Override
	public float getAttackDamage() {
		
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getMaxUses() {
		return this.durability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(this.repairMaterial);
	}

}
