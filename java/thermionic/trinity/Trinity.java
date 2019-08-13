package thermionic.trinity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import thermionic.trinity.items.ItemCustomAxe;
import thermionic.trinity.lists.ItemList;
import thermionic.trinity.lists.ToolMaterialList;

@Mod("trinity")
public class Trinity {
	
	public static Trinity instance;
	public static final String modid = "trinity";
	private static final Logger logger = LogManager.getLogger(modid);
	
	public static final ItemGroup weapons = new WeaponsItemGroup();
	public static final ItemGroup crafting = new CraftingItemGroup();
	

	
	public Trinity() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}	
	
	private void setup(final FMLCommonSetupEvent event) {
		
	     logger.info("Setup Method Registerd.");
		
	}
	
	private void clientRegistries(final FMLCommonSetupEvent event) {
		
		logger.info("Client Registries Method Registerd.");
		
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event){
			
			
			event.getRegistry().registerAll(
					
					//Items
					
					//wood
					ItemList.spear_head_wood = new Item(new Item.Properties().group(crafting)).setRegistryName(location("spear_head_wood")),
					ItemList.battle_axe_head_wood = new Item(new Item.Properties().group(crafting)).setRegistryName(location("battle_axe_head_wood")),
					ItemList.war_hammer_head_wood = new Item(new Item.Properties().group(crafting)).setRegistryName(location("war_hammer_head_wood")),
					
					//gold
					ItemList.spear_head_gold = new Item(new Item.Properties().group(crafting)).setRegistryName(location("spear_head_gold")),
					ItemList.battle_axe_head_gold = new Item(new Item.Properties().group(crafting)).setRegistryName(location("battle_axe_head_gold")),
					ItemList.war_hammer_head_gold = new Item(new Item.Properties().group(crafting)).setRegistryName(location("war_hammer_head_gold")),
					
					//stone
					ItemList.spear_head_stone = new Item(new Item.Properties().group(crafting)).setRegistryName(location("spear_head_stone")),
					ItemList.battle_axe_head_stone = new Item(new Item.Properties().group(crafting)).setRegistryName(location("battle_axe_head_stone")),
					ItemList.war_hammer_head_stone = new Item(new Item.Properties().group(crafting)).setRegistryName(location("war_hammer_head_stone")),
					
					//iron
					ItemList.spear_head_iron = new Item(new Item.Properties().group(crafting)).setRegistryName(location("spear_head_iron")),
					ItemList.battle_axe_head_iron = new Item(new Item.Properties().group(crafting)).setRegistryName(location("battle_axe_head_iron")),
					ItemList.war_hammer_head_iron = new Item(new Item.Properties().group(crafting)).setRegistryName(location("war_hammer_head_iron")),
					
					//diamond
					ItemList.spear_head_diamond = new Item(new Item.Properties().group(crafting)).setRegistryName(location("spear_head_diamond")),
					ItemList.battle_axe_head_diamond = new Item(new Item.Properties().group(crafting)).setRegistryName(location("battle_axe_head_diamond")),
					ItemList.war_hammer_head_diamond = new Item(new Item.Properties().group(crafting)).setRegistryName(location("war_hammer_head_diamond")),
					
					//Weapons || The second number after the material as seen below is the attack speed, when it is at 0 it is at 4 so if you wanted something like 1 you do -3
					
					//wood
					ItemList.spear_wood = new ItemSword(ToolMaterialList.spearwoodmat, 0, -1.5f, new Item.Properties().group(weapons)).setRegistryName(location("spear_wood")),
					ItemList.battle_axe_wood = new ItemCustomAxe(ToolMaterialList.woodbattleaxemat, 0, -3.2f, new Item.Properties().group(weapons)).setRegistryName(location("battle_axe_wood")),
					ItemList.war_hammer_wood = new ItemSword(ToolMaterialList.woodwarhammermat, 0, -2.5f, new Item.Properties().group(weapons)).setRegistryName(location("war_hammer_wood")),
					ItemList.katana_wood = new ItemSword(ToolMaterialList.woodkatanamat, 0, -1.6f, new Item.Properties().group(weapons)).setRegistryName(location("katana_wood")),
					ItemList.knife_wood = new ItemSword(ToolMaterialList.woodknifemat, 0, -2.3f, new Item.Properties().group(weapons)).setRegistryName(location("knife_wood")),
					ItemList.halberd_wood = new ItemSword(ToolMaterialList.woodhalberdmat, 0, -2.5f, new Item.Properties().group(weapons)).setRegistryName(location("halberd_wood")),
					
					//gold
					ItemList.spear_gold = new ItemSword(ToolMaterialList.speargoldmat, 0, -1.5f, new Item.Properties().group(weapons)).setRegistryName(location("spear_gold")),
					ItemList.battle_axe_gold = new ItemCustomAxe(ToolMaterialList.goldbattleaxemat, 0, -3.0f, new Item.Properties().group(weapons)).setRegistryName(location("battle_axe_gold")),
					ItemList.war_hammer_gold = new ItemSword(ToolMaterialList.goldwarhammermat, 0, -2.5f, new Item.Properties().group(weapons)).setRegistryName(location("war_hammer_gold")),
					ItemList.katana_gold = new ItemSword(ToolMaterialList.goldkatanamat, 0, -1.6f, new Item.Properties().group(weapons)).setRegistryName(location("katana_gold")),
					ItemList.knife_gold = new ItemSword(ToolMaterialList.goldknifemat, 0, -2.3f, new Item.Properties().group(weapons)).setRegistryName(location("knife_gold")),
					ItemList.halberd_gold = new ItemSword(ToolMaterialList.goldhalberdmat, 0, -2.5f, new Item.Properties().group(weapons)).setRegistryName(location("halberd_gold")),
					
					//stone
					ItemList.spear_stone = new ItemSword(ToolMaterialList.spearstonemat, 0, -1.5f, new Item.Properties().group(weapons)).setRegistryName(location("spear_stone")),
					ItemList.battle_axe_stone = new ItemCustomAxe(ToolMaterialList.stonebattleaxemat, 0, -3.2f, new Item.Properties().group(weapons)).setRegistryName(location("battle_axe_stone")),
					ItemList.war_hammer_stone = new ItemSword(ToolMaterialList.stonewarhammermat, 0, -2.5f, new Item.Properties().group(weapons)).setRegistryName(location("war_hammer_stone")),
					ItemList.katana_stone = new ItemSword(ToolMaterialList.stonekatanamat, 0, -1.6f, new Item.Properties().group(weapons)).setRegistryName(location("katana_stone")),
					ItemList.knife_stone = new ItemSword(ToolMaterialList.stoneknifemat, 0, -2.3f, new Item.Properties().group(weapons)).setRegistryName(location("knife_stone")),
					ItemList.halberd_stone = new ItemSword(ToolMaterialList.stonehalberdmat, 0, -2.5f, new Item.Properties().group(weapons)).setRegistryName(location("halberd_stone")),
					
					//iron
					ItemList.spear_iron = new ItemSword(ToolMaterialList.spearironmat, 0, -1.5f, new Item.Properties().group(weapons)).setRegistryName(location("spear_iron")),
					ItemList.battle_axe_iron = new ItemCustomAxe(ToolMaterialList.ironbattleaxemat, 0, -3.1f, new Item.Properties().group(weapons)).setRegistryName(location("battle_axe_iron")),
					ItemList.war_hammer_iron = new ItemSword(ToolMaterialList.ironwarhammermat, 0, -2f, new Item.Properties().group(weapons)).setRegistryName(location("war_hammer_iron")),
					ItemList.katana_iron = new ItemSword(ToolMaterialList.ironkatanamat, 0, -1.6f, new Item.Properties().group(weapons)).setRegistryName(location("katana_iron")),
					ItemList.knife_iron = new ItemSword(ToolMaterialList.ironknifemat, 0, -2.3f, new Item.Properties().group(weapons)).setRegistryName(location("knife_iron")),
					ItemList.halberd_iron = new ItemSword(ToolMaterialList.ironhalberdmat, 0, -2.5f, new Item.Properties().group(weapons)).setRegistryName(location("halberd_iron")),
					
					//diamond
					ItemList.spear_diamond = new ItemSword(ToolMaterialList.speardiamondmat, 0, -1.5f, new Item.Properties().group(weapons)).setRegistryName(location("spear_diamond")),
					ItemList.battle_axe_diamond = new ItemCustomAxe(ToolMaterialList.diamondbattleaxemat, 0, -3.0f, new Item.Properties().group(weapons)).setRegistryName(location("battle_axe_diamond")),
					ItemList.war_hammer_diamond = new ItemSword(ToolMaterialList.diamondwarhammermat, 0, -2.5f, new Item.Properties().group(weapons)).setRegistryName(location("war_hammer_diamond")),
					ItemList.katana_diamond = new ItemSword(ToolMaterialList.diamondkatanamat, 0, -1.6f, new Item.Properties().group(weapons)).setRegistryName(location("katana_diamond")),
					ItemList.knife_diamond = new ItemSword(ToolMaterialList.diamondknifemat, 0, -2.3f, new Item.Properties().group(weapons)).setRegistryName(location("knife_diamond")),
					ItemList.halberd_diamond = new ItemSword(ToolMaterialList.diamondhalberdmat, 0, -2.5f, new Item.Properties().group(weapons)).setRegistryName(location("halberd_diamond"))
					
					);
				
			logger.info("Items Registerd");
		}
		
		public static ResourceLocation location(String name){
			
			return new ResourceLocation(modid, name);
			
		}
			
	}
	
}
