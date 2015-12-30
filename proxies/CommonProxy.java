package com.kalabron.bluepoppy.proxies;

import com.kalabron.bluepoppy.Main;
import com.kalabron.bluepoppy.blocks.ModBlocks;
import com.kalabron.bluepoppy.handlers.ModGuiHandler;
import com.kalabron.bluepoppy.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.loadBlocks();
		ModItems.loadItems();
	}	

	public void init(FMLInitializationEvent event)
	{
		

	}	

	public void postInit(FMLPostInitializationEvent event)
	{


	}
}

