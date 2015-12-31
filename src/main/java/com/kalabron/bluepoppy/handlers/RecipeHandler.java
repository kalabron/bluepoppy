package com.kalabron.bluepoppy.handlers;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class RecipeHandler 
{
	
	public static void registerRecipes()
	{
		// declaration of items
  		// Item bloodStoneSwordItem = GameRegistry.findItem("bluepoppy",  "bloodStoneSword");

		
		// Drops on death - Calls Handlers

		
		// Enchantment recipes

		
		//ItemStack knockbackStoneSwordItemStack = new ItemStack(Items.stone_sword);
		//knockbackStoneSwordItemStack.addEnchantment(Enchantment.knockback, 1);
		
		//GameRegistry.addShapelessRecipe(knockbackStoneSwordItemStack,
		//		Items.gunpowder, Items.stone_sword, Blocks.red_flower );		
		
		
	
		
		// Shaped Crafting Recipes
		
		//GameRegistry.addRecipe(
		//		new ItemStack(redPoppyBookItem),
		//		"e  ",
		//		" d ",
		//		"   ",
		//		'd', Items.book,
		//		'e', Blocks.red_flower);
	
		
		//Smelting Recipes
		
		//GameRegistry.addSmelting(
		//		bloodStoneDustItem,
		//		new ItemStack(bloodStoneIngotItem, 1),
		//		1.0F);		
		
	
		
		//Dungeon changes - adds xxx items to chests
		//ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new
		//		WeightedRandomChestContent(new ItemStack(bloodStoneIngotItem), 1,5,7));
		

	}

}
