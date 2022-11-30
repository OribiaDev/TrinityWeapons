package com.spikeyt.thermionic.trinity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.spikeyt.thermionic.trinity.registries.ItemRegistries;
import com.spikeyt.thermionic.trinity.registries.WeaponRegistries;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("trinity")
public class Trinity {
	
	public static Trinity instance;
	public static final String MODID = "trinity";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	//Main Instance
	public Trinity() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		//MinecraftForge.EVENT_BUS.register(this);
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ItemRegistries.ITEMS.register(bus);
		WeaponRegistries.ITEMS.register(bus);
	}	
	
	//Creative Tab
	public static final CreativeModeTab WeaponsTab = new CreativeModeTab(MODID) {
		@Override
		public ItemStack makeIcon() {
			return WeaponRegistries.AXE_NETHERITE.get().getDefaultInstance();
		}
		
		
	};
	
	
	
	//Logging
	private void setup(final FMLCommonSetupEvent event) {
		
	     LOGGER.info("Setup Method Registerd.");
		
	}
	
	private void clientRegistries(final FMLCommonSetupEvent event) {
		
		LOGGER.info("Client Registries Method Registerd.");
		
	}	
}
