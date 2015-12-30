package com.kalabron.bluepoppy;

import com.kalabron.bluepoppy.handlers.BluepoppyEventHandler;
import com.kalabron.bluepoppy.handlers.RecipeHandler;
import com.kalabron.bluepoppy.items.ModItems;
import com.kalabron.bluepoppy.proxies.CommonProxy;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;



@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, dependencies = "required-after:FML")


public class Main 
{
	@Instance(value = Reference.MODID)
	public static Main instance;
	
	@SidedProxy(modId=Reference.MODID, clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	BluepoppyEventHandler handler = new BluepoppyEventHandler();
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		this.proxy.preInit(event);		
		
		GameRegistry.registerWorldGenerator(handler,  0);

	}	
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{

		this.proxy.init(event);
				
		//Register Items
		ModItems.registerItems();
		
		//Calls RecipeHandler class + registerRecipes() Method
		RecipeHandler.registerRecipes();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		this.proxy.postInit(event);


	}
	
}
	