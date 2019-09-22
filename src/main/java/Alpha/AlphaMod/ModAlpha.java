package Alpha.AlphaMod;

import Alpha.Block.BlockMod;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Alpha.item.ItemMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Alpha.proxy.CommonProxy;
import Alpha.wold.worldregisteur;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModAlpha 
{
	@Instance(Reference.MOD_ID)
	public static ModAlpha instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVEUR_PROXY)
	public static CommonProxy proxy;
	
	public static CreativeTabs Alpha = new CreativeTabs("tabalpha") 
	{
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() 
		{
			return ItemMod.Alpha;
		}	
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		ItemMod.init();
		ItemMod.registeur();
		BlockMod.init();
		BlockMod.registeur();
		worldregisteur.MainRegistry();
		GameRegistry.addRecipe(new ItemStack(BlockMod.Alphablock, 1), new Object[]{"###", "###", "###", '#', ItemMod.Alpha});
		GameRegistry.addRecipe(new ItemStack(ItemMod.Alpha, 9), new Object[]{"   ", " # ", "   ", '#', BlockMod.Alphablock});
		GameRegistry.addRecipe(new ItemStack(ItemMod.piocheAlpha, 1), new Object[]{"###", " F ", " F ", '#', ItemMod.Alpha, 'F', Items.stick});
		GameRegistry.addSmelting(BlockMod.Alphaston, new ItemStack(ItemMod.Alpha), 50);
		GameRegistry.addSmelting(BlockMod.Blockvert, new ItemStack(ItemMod.Itemvert), 40);
		GameRegistry.addRecipe(new ItemStack(BlockMod.bloctransparent, 1), new Object[]{"###", "#F#", "###", '#', Blocks.glass, 'F', ItemMod.Itemvert});
		GameRegistry.addRecipe(new ItemStack(ItemMod.epeeAlpha, 1), new Object[]{" # ", " # ", " F ", '#', ItemMod.Alpha, 'F', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ItemMod.casqueAlpha, 1), new Object[]{"###", "# #", '#', ItemMod.Alpha});
		GameRegistry.addRecipe(new ItemStack(ItemMod.pantalonAlpha, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.Alpha});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plastronAlpha, 1), new Object[]{"# #", "###", "###", '#', ItemMod.Alpha});
		GameRegistry.addRecipe(new ItemStack(ItemMod.bootAlpha, 1), new Object[]{"   ", "# #", "# #", '#', ItemMod.Alpha});
		GameRegistry.addRecipe(new ItemStack(ItemMod.casquegrassium, 1), new Object[]{"###", "# #", '#', ItemMod.Itemvert});
		GameRegistry.addRecipe(new ItemStack(ItemMod.pantalongrassium, 1), new Object[]{"###", "# #", "# #", '#', ItemMod.Itemvert});
		GameRegistry.addRecipe(new ItemStack(ItemMod.plastrongrassium, 1), new Object[]{"# #", "###", "###", '#', ItemMod.Itemvert});
		GameRegistry.addRecipe(new ItemStack(ItemMod.bootgrassium, 1), new Object[]{"   ", "# #", "# #", '#', ItemMod.Itemvert});
		GameRegistry.addRecipe(new ItemStack(ItemMod.banane, 4), new Object[]{"   ", " # ", "   ", '#', BlockMod.blockdebanane});
	}
	
	@EventHandler
	public void preInit(FMLInitializationEvent event) 
	{
		proxy.registeurRendeurs();
	}
	
	@EventHandler
	public void preInit(FMLPostInitializationEvent event) 
	{
		
	}
}
