package com.spikeyt.thermionic.trinity.registries;

import com.spikeyt.thermionic.trinity.Trinity;
import com.spikeyt.thermionic.trinity.items.CustomAxeItem;
import com.spikeyt.thermionic.trinity.items.WarHammer;
import com.spikeyt.thermionic.trinity.lists.TrinityItems;
import com.spikeyt.thermionic.trinity.lists.TrinityToolMaterials;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class WeaponRegistries {	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event){		
			event.getRegistry().registerAll(
					//wood
					TrinityItems.spear_wood = new SwordItem(TrinityToolMaterials.spearwoodmat, 0, -1.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("spear_wood")),
					TrinityItems.battle_axe_wood = new CustomAxeItem(TrinityToolMaterials.woodbattleaxemat, 0, -3.2f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("battle_axe_wood")),
					TrinityItems.war_hammer_wood = new WarHammer(TrinityToolMaterials.woodwarhammermat, 0, -2.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("war_hammer_wood")),
					TrinityItems.katana_wood = new SwordItem(TrinityToolMaterials.woodkatanamat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("katana_wood")),
					TrinityItems.knife_wood = new SwordItem(TrinityToolMaterials.woodknifemat, 0, -1.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("knife_wood")),
					TrinityItems.halberd_wood = new SwordItem(TrinityToolMaterials.woodhalberdmat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("halberd_wood")),
					TrinityItems.dagger_wood = new SwordItem(TrinityToolMaterials.wooddaggermat, 0, -0.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("dagger_wood")),
					TrinityItems.lance_wood = new SwordItem(TrinityToolMaterials.woodlancemat, 0, -1.8f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lance_wood")),
					TrinityItems.guisarme_wood = new SwordItem(TrinityToolMaterials.woodguisarmemat, 0, -2.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("guisarme_wood")),
					TrinityItems.lucerne_hammer_wood = new SwordItem(TrinityToolMaterials.woodlucernemat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lucerne_hammer_wood")),
					TrinityItems.quarterstaff_wood = new SwordItem(TrinityToolMaterials.woodquarterstaffmat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("quarterstaff_wood")),
					
					//gold
					TrinityItems.spear_gold = new SwordItem(TrinityToolMaterials.speargoldmat, 0, -1.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("spear_gold")),
					TrinityItems.battle_axe_gold = new CustomAxeItem(TrinityToolMaterials.goldbattleaxemat, 0, -3.0f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("battle_axe_gold")),
					TrinityItems.war_hammer_gold = new WarHammer(TrinityToolMaterials.goldwarhammermat, 0, -2.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("war_hammer_gold")),
					TrinityItems.katana_gold = new SwordItem(TrinityToolMaterials.goldkatanamat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("katana_gold")),
					TrinityItems.knife_gold = new SwordItem(TrinityToolMaterials.goldknifemat, 0, -1.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("knife_gold")),
					TrinityItems.halberd_gold = new SwordItem(TrinityToolMaterials.goldhalberdmat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("halberd_gold")),
					TrinityItems.dagger_gold = new SwordItem(TrinityToolMaterials.golddaggermat, 0, -0.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("dagger_gold")),
					TrinityItems.lance_gold = new SwordItem(TrinityToolMaterials.goldlancemat, 0, -1.8f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lance_gold")),
					TrinityItems.guisarme_gold = new SwordItem(TrinityToolMaterials.goldguisarmemat, 0, -2.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("guisarme_gold")),
					TrinityItems.lucerne_hammer_gold = new SwordItem(TrinityToolMaterials.goldlucernemat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lucerne_hammer_gold")),
					TrinityItems.quarterstaff_gold = new SwordItem(TrinityToolMaterials.goldquarterstaffmat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("quarterstaff_gold")),
							
					//stone
					TrinityItems.spear_stone = new SwordItem(TrinityToolMaterials.spearstonemat, 0, -1.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("spear_stone")),
					TrinityItems.battle_axe_stone = new CustomAxeItem(TrinityToolMaterials.stonebattleaxemat, 0, -3.2f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("battle_axe_stone")),
					TrinityItems.war_hammer_stone = new WarHammer(TrinityToolMaterials.stonewarhammermat, 0, -2.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("war_hammer_stone")),
					TrinityItems.katana_stone = new SwordItem(TrinityToolMaterials.stonekatanamat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("katana_stone")),
					TrinityItems.knife_stone = new SwordItem(TrinityToolMaterials.stoneknifemat, 0, -1.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("knife_stone")),
					TrinityItems.halberd_stone = new SwordItem(TrinityToolMaterials.stonehalberdmat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("halberd_stone")),
					TrinityItems.dagger_stone = new SwordItem(TrinityToolMaterials.stonedaggermat, 0, -0.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("dagger_stone")),
					TrinityItems.lance_stone = new SwordItem(TrinityToolMaterials.stonelancemat, 0, -1.8f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lance_stone")),
					TrinityItems.guisarme_stone = new SwordItem(TrinityToolMaterials.stoneguisarmemat, 0, -2.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("guisarme_stone")),
					TrinityItems.lucerne_hammer_stone = new SwordItem(TrinityToolMaterials.stonelucernemat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lucerne_hammer_stone")),
					TrinityItems.quarterstaff_stone = new SwordItem(TrinityToolMaterials.stonequarterstaffmat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("quarterstaff_stone")),
					
					//iron
					TrinityItems.spear_iron = new SwordItem(TrinityToolMaterials.spearironmat, 0, -1.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("spear_iron")),
					TrinityItems.battle_axe_iron = new CustomAxeItem(TrinityToolMaterials.ironbattleaxemat, 0, -3.1f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("battle_axe_iron")),
					TrinityItems.war_hammer_iron = new WarHammer(TrinityToolMaterials.ironwarhammermat, 0, -2f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("war_hammer_iron")),
					TrinityItems.katana_iron = new SwordItem(TrinityToolMaterials.ironkatanamat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("katana_iron")),
					TrinityItems.knife_iron = new SwordItem(TrinityToolMaterials.ironknifemat, 0, -1.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("knife_iron")),
					TrinityItems.halberd_iron = new SwordItem(TrinityToolMaterials.ironhalberdmat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("halberd_iron")),
					TrinityItems.dagger_iron = new SwordItem(TrinityToolMaterials.irondaggermat, 0, -0.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("dagger_iron")),
					TrinityItems.lance_iron = new SwordItem(TrinityToolMaterials.ironlancemat, 0, -1.8f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lance_iron")),
					TrinityItems.guisarme_iron = new SwordItem(TrinityToolMaterials.ironguisarmemat, 0, -2.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("guisarme_iron")),
					TrinityItems.lucerne_hammer_iron = new SwordItem(TrinityToolMaterials.ironlucernemat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lucerne_hammer_iron")),
					TrinityItems.quarterstaff_iron = new SwordItem(TrinityToolMaterials.ironquarterstaffmat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("quarterstaff_iron")),
					
					//diamond
					TrinityItems.spear_diamond = new SwordItem(TrinityToolMaterials.speardiamondmat, 0, -1.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("spear_diamond")),
					TrinityItems.battle_axe_diamond = new CustomAxeItem(TrinityToolMaterials.diamondbattleaxemat, 0, -3.0f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("battle_axe_diamond")),
					TrinityItems.war_hammer_diamond = new WarHammer(TrinityToolMaterials.diamondwarhammermat, 0, -2.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("war_hammer_diamond")),
					TrinityItems.katana_diamond = new SwordItem(TrinityToolMaterials.diamondkatanamat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("katana_diamond")),
					TrinityItems.knife_diamond = new SwordItem(TrinityToolMaterials.diamondknifemat, 0, -1.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("knife_diamond")),
					TrinityItems.halberd_diamond = new SwordItem(TrinityToolMaterials.diamondhalberdmat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("halberd_diamond")),
					TrinityItems.dagger_diamond = new SwordItem(TrinityToolMaterials.diamonddaggermat, 0, -0.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("dagger_diamond")),
					TrinityItems.lance_diamond = new SwordItem(TrinityToolMaterials.diamondlancemat, 0, -1.8f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lance_diamond")),
					TrinityItems.guisarme_diamond = new SwordItem(TrinityToolMaterials.diamondguisarmemat, 0, -2.5f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("guisarme_diamond")),
					TrinityItems.lucerne_hammer_diamond = new SwordItem(TrinityToolMaterials.diamondlucernemat, 0, -2.7f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("lucerne_hammer_diamond")),
					TrinityItems.quarterstaff_diamond = new SwordItem(TrinityToolMaterials.diamondquarterstaffmat, 0, -1.6f, new Item.Properties().group(Trinity.WEAPONS)).setRegistryName(location("quarterstaff_diamond"))
										
					
					
					);
				
			Trinity.LOGGER.info("Items Registerd");
		}
		
	

		
		public static ResourceLocation location(String name){
			
			return new ResourceLocation(Trinity.MODID, name);
			
		}
			
	}
	
}
