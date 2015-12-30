package com.kalabron.bluepoppy.proxies;

import com.kalabron.bluepoppy.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
	}	

	@Override
	public void init(FMLInitializationEvent e)
	{
		super.init(e);
		
		//Item bloodStoneBlockItem = GameRegistry.findItem("redpoppy",  "bloodStoneBlock");
		//ModelResourceLocation bloodStoneBlockModel = 
		//		new ModelResourceLocation("redpoppy:bloodStoneBlock", "inventory");
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		//	.register(bloodStoneBlockItem,  0, bloodStoneBlockModel);
		
	}	

	@Override
	public void postInit(FMLPostInitializationEvent e)
	{

		super.postInit(e);
	}

}
