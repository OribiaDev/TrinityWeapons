 package com.spikeyt.thermionic.trinity.lists;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum TrinityToolMaterials implements IItemTier {
	
	//Spear
	spearwoodmat(3.8f, 1.0f, 69, 0, 42, TrinityItems.spear_wood),	
	speargoldmat(3.8f, 1.0f, 42, 0, 42, TrinityItems.spear_gold),	
	spearstonemat(4f, 1.0f, 141, 0, 42, TrinityItems.spear_stone),	
	spearironmat(4.5f, 1.0f, 260, 0, 42, TrinityItems.spear_iron),	
	speardiamondmat(5f, 1.0f, 1571, 0, 42, TrinityItems.spear_diamond),	
	spearnetheritemat(5.5f, 1.0f, 2041, 0, 42, TrinityItems.spear_netherite),
	
	//Battle Axe
	woodbattleaxemat(8f, 2.0f, 135, 0, 42, TrinityItems.battle_axe_wood),	
	goldbattleaxemat(8f, 10.0f, 48, 0, 42, TrinityItems.battle_axe_gold),	
	stonebattleaxemat(10f, 4.0f, 147, 0, 42, TrinityItems.battle_axe_stone),	
	ironbattleaxemat(10.5f, 6.0f, 266, 0, 42, TrinityItems.battle_axe_iron),		
	diamondbattleaxemat(11f, 8.0f, 1577, 0, 42, TrinityItems.battle_axe_diamond),	
	netheritebattleaxemat(12f, 8.0f, 2051, 0, 42, TrinityItems.battle_axe_netherite),

	//War Hammer
	woodwarhammermat(4.8f, 1.0f, 72, 0, 42, TrinityItems.war_hammer_wood),	
	goldwarhammermat(4.8f, 1.0f, 45, 0, 42, TrinityItems.war_hammer_gold),	
	stonewarhammermat(5.4f, 1.0f, 144, 0, 42, TrinityItems.war_hammer_stone),	
	ironwarhammermat(6.7f, 1.0f, 263, 0, 42, TrinityItems.war_hammer_iron),	
	diamondwarhammermat(7f, 1.0f, 1574, 0, 42, TrinityItems.war_hammer_diamond),
	netheritewarhammermat(8.1f, 1.0f, 2040, 0, 42, TrinityItems.war_hammer_netherite),
	
	//Katana
	woodkatanamat(4f, 1.0f, 75, 0, 42, TrinityItems.katana_wood),	
	goldkatanamat(4f, 1.0f, 48, 0, 42, TrinityItems.katana_gold),	
	stonekatanamat(5.2f, 1.0f, 147, 0, 42, TrinityItems.katana_stone),	
	ironkatanamat(6f, 1.0f, 266, 0, 42, TrinityItems.katana_iron),
	diamondkatanamat(7.2f, 1.0f, 1577, 0, 42, TrinityItems.katana_diamond),
	netheritekatanamat(8.2f, 1.0f, 2035, 0, 42, TrinityItems.katana_netherite),
	
	//Knife
	woodknifemat(2f, 1.0f, 65, 0, 42, TrinityItems.knife_wood),	
	goldknifemat(2f, 1.0f, 38, 0, 42, TrinityItems.knife_gold),	
	stoneknifemat(2.5f, 1.0f, 137, 0, 42, TrinityItems.knife_stone),	
	ironknifemat(3f, 1.0f, 256, 0, 42, TrinityItems.knife_iron),	
	diamondknifemat(4.5f, 1.0f, 1567, 0, 42, TrinityItems.knife_diamond),	
	netheriteknifemat(5.5f, 1.0f, 2045, 0, 42, TrinityItems.knife_netherite),
	
	//Halberd
	woodhalberdmat(2.5f, 1.0f, 67, 0, 42, TrinityItems.halberd_wood),	
	goldhalberdmat(2.5f, 1.0f, 40, 0, 42, TrinityItems.halberd_gold),	
	stonehalberdmat(4.5f, 1.0f, 139, 0, 42, TrinityItems.halberd_stone),	
	ironhalberdmat(5.5f, 1.0f, 258, 0, 42, TrinityItems.halberd_iron),	
	diamondhalberdmat(6.5f, 1.0f, 1569, 0, 42, TrinityItems.halberd_diamond),	
	netheritehalberdmat(7f, 1.0f, 2049, 0, 42, TrinityItems.halberd_netherite),
	
	//Dagger
	wooddaggermat(1.8f, 1.0f, 58, 0, 42, TrinityItems.dagger_wood),	
	golddaggermat(1.8f, 1.0f, 31, 0, 42, TrinityItems.dagger_gold),	
	stonedaggermat(2.5f, 1.0f, 130, 0, 42, TrinityItems.dagger_stone),	
	irondaggermat(3.5f, 1.0f, 249, 0, 42, TrinityItems.dagger_iron),	
	diamonddaggermat(4.5f, 1.0f, 1560, 0, 42, TrinityItems.dagger_diamond),
	netheritedaggermat(5.5f, 1.0f, 2030, 0, 42, TrinityItems.dagger_netherite),
	
	//Lance
	woodlancemat(2.5f, 1.0f, 75, 0, 42, TrinityItems.lance_wood),
	goldlancemat(2.5f, 1.0f, 48, 0, 42, TrinityItems.lance_gold),
	stonelancemat(3f, 1.0f, 147, 0, 42, TrinityItems.lance_stone),	
	ironlancemat(4.5f, 1.0f, 249, 0, 42, TrinityItems.lance_iron),	
	diamondlancemat(5f, 1.0f, 1570, 0, 42, TrinityItems.lance_diamond),	
	netheritelancemat(6f, 1.0f, 2041, 0, 42, TrinityItems.lance_netherite),
	
	//Guisarme
	woodguisarmemat(3.5f, 1.0f, 60, 0, 42, TrinityItems.guisarme_wood),	
	goldguisarmemat(3.5f, 1.0f, 33, 0, 42, TrinityItems.guisarme_gold),	
	stoneguisarmemat(4.5f, 1.0f, 132, 0, 42, TrinityItems.guisarme_stone),	
	ironguisarmemat(5.5f, 1.0f, 251, 0, 42, TrinityItems.guisarme_iron),	
	diamondguisarmemat(6.5f, 1.0f, 1570, 0, 42, TrinityItems.guisarme_diamond),	
	netheriteguisarmemat(7.5f, 1.0f, 2041, 0, 42, TrinityItems.guisarme_netherite),
	
	//Lucerne
	woodlucernemat(2.5f, 1.0f, 70, 0, 42, TrinityItems.lucerne_hammer_wood),	
	goldlucernemat(2.5f, 1.0f, 43, 0, 42, TrinityItems.lucerne_hammer_gold),	
	stonelucernemat(3.5f, 1.0f, 142, 0, 42, TrinityItems.lucerne_hammer_stone),	
	ironlucernemat(5f, 1.0f, 261, 0, 42, TrinityItems.lucerne_hammer_iron),	
	diamondlucernemat(6f, 1.0f, 1580, 0, 42, TrinityItems.lucerne_hammer_diamond),	
	netheritelucernemat(7.2f, 1.0f, 2061, 0, 42, TrinityItems.lucerne_hammer_netherite),
	
	//Quarterstaff
	woodquarterstaffmat(1.5f, 1.0f, 58, 0, 42, TrinityItems.quarterstaff_wood),	
	goldquarterstaffmat(1.5f, 1.0f, 38, 0, 42, TrinityItems.quarterstaff_gold),	
	stonequarterstaffmat(2.5f, 1.0f, 137, 0, 42, TrinityItems.quarterstaff_stone),	
	ironquarterstaffmat(3f, 1.0f, 275, 0, 42, TrinityItems.quarterstaff_iron),	
	diamondquarterstaffmat(3.5f, 1.0f, 1569, 0, 42, TrinityItems.quarterstaff_diamond),	
	netheritequarterstaffmat(4.5f, 1.0f, 2049, 0, 42, TrinityItems.quarterstaff_netherite);
	
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private TrinityToolMaterials(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {
	
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial  = repairMaterial;
		
	}



	@Override
	public float getAttackDamageBonus() {
		// TODO Auto-generated method stub
		return this.attackDamage - 1;
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return this.enchantability;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return this.harvestLevel;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return Ingredient.of(this.repairMaterial);
	}

	@Override
	public float getSpeed() {
		// TODO Auto-generated method stub
		return this.efficiency;
	}

	@Override
	public int getUses() {
		// TODO Auto-generated method stub
		return this.durability;
	}

}
