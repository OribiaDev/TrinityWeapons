package com.spikeyt.thermionic.trinity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.spikeyt.thermionic.trinity.item_groups.WeaponsItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("trinity")
public class Trinity {
	
	public static Trinity instance;
	public static final String MODID = "trinity";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final ItemGroup WEAPONS = new WeaponsItemGroup();
	

	
	public Trinity() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}	
	
	private void setup(final FMLCommonSetupEvent event) {
		
	     LOGGER.info("Setup Method Registerd.");
		
	}
	

	
	
	private void clientRegistries(final FMLCommonSetupEvent event) {
		
		LOGGER.info("Client Registries Method Registerd.");
		
	}	
}
