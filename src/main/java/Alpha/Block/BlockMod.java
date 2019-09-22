package Alpha.Block;

import Alpha.AlphaMod.ModAlpha;
import Alpha.AlphaMod.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BlockMod 
{
	public static Block Alphaston;
	public static Block bloctransparent;
	public static Block Alphablock;
	public static Block Blockvert;   
	public static Block blockdebanane;
	public static Block blockbleu;
	public static Block blockrouge;

	
	public static void init() 
	{
		Alphaston = new Blockcreat(Material.rock, 3).setBlockName("Alphaston").setCreativeTab(ModAlpha.Alpha).setBlockTextureName(Reference.MOD_ID + ":alphastone").setHardness(10.0F);
		bloctransparent = new Blockcreat(Material.glass, 2).setBlockName("bloctransparent").setCreativeTab(ModAlpha.Alpha).setBlockTextureName(Reference.MOD_ID + ":bloctransparent").setHardness(2.0F).setStepSound(Block.soundTypeGlass);
		Alphablock = new Blockcreat(Material.rock, 4).setBlockName("Alphablock").setCreativeTab(ModAlpha.Alpha).setBlockTextureName(Reference.MOD_ID + ":alphablock").setHardness(10.0F);
		Blockvert = new Blockcreat(Material.rock, 3).setBlockName("Blockvert").setCreativeTab(ModAlpha.Alpha).setBlockTextureName(Reference.MOD_ID + ":Blockvert").setHardness(10.0F);
		blockdebanane = new Blockcreat(Material.grass, 0).setBlockName("blockdebanane").setCreativeTab(ModAlpha.Alpha).setBlockTextureName(Reference.MOD_ID + ":block-de-banane").setHardness(0.5F).setStepSound(Block.soundTypeGrass);;
		blockbleu = new Blockcreat(Material.rock, 3).setBlockName("blockbleu").setCreativeTab(ModAlpha.Alpha).setBlockTextureName(Reference.MOD_ID + ":blockbleu").setHardness(10.0F);
		blockrouge = new Blockcreat(Material.rock, 3).setBlockName("blockrouge").setCreativeTab(ModAlpha.Alpha).setBlockTextureName(Reference.MOD_ID + ":blockrouge").setHardness(10.0F);
	}
	
	
	public static void registeur() 
	{
		GameRegistry.registerBlock(Alphaston, Alphaston.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(bloctransparent, bloctransparent.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Alphablock, Alphablock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Blockvert, Blockvert.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockdebanane, blockdebanane.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockbleu, blockbleu.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockrouge, blockrouge.getUnlocalizedName().substring(5));
	}
}
