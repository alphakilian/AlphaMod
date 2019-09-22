package Alpha.item;

import Alpha.AlphaMod.ModAlpha;
import Alpha.AlphaMod.Reference;
import Alpha.Block.BlockMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod 
{
	public static Item Alpha, casqueAlpha, plastronAlpha, pantalonAlpha, bootAlpha, piocheAlpha, epeeAlpha, Itemvert, casquegrassium, plastrongrassium, pantalongrassium, bootgrassium, banane, Acas, Apant, Aplast, Aboot, multi;
	public static ArmorMaterial armurAlpha = EnumHelper.addArmorMaterial("armurAlpha", 66, new int[] {6, 16, 12, 6}, 50);
	public static ToolMaterial toolApha = EnumHelper.addToolMaterial("Alpha", 4, 5000, 20, 7, 25);
	public static ArmorMaterial armurgrassium = EnumHelper.addArmorMaterial("armurgrassium", 5, new int[] {3, 8, 6, 3}, 25);
	
	
	public static void init() 
	{
		Alpha = new Item().setUnlocalizedName("Alpha").setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":Alpha");
		casqueAlpha = new ItemArmorAlpha(armurAlpha, 0).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":casquealpha").setUnlocalizedName("casqueAlpha");
		plastronAlpha = new ItemArmorAlpha(armurAlpha, 1).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":plastronAlpha").setUnlocalizedName("plastronAlpha");
		pantalonAlpha = new ItemArmorAlpha(armurAlpha, 2).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":pantalonAlpha").setUnlocalizedName("pantalonAlpha");
		bootAlpha = new ItemArmorAlpha(armurAlpha, 3).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":bootAlpha").setUnlocalizedName("bootAlpha");
		piocheAlpha = new ItemPickaxeAlpha(toolApha).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":piocheAlpha").setUnlocalizedName("piocheAlpha");
		epeeAlpha = new ItemSwordAlpha(toolApha).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":epeeAlpha").setUnlocalizedName("epeeAlpha");
		plastrongrassium = new ItemSwordgrassium(armurgrassium, 1).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":plastrongrassium").setUnlocalizedName("plastrongrassium");
		pantalongrassium = new ItemSwordgrassium(armurgrassium, 2).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":pantalongrassium").setUnlocalizedName("pantalongrassium");
		bootgrassium = new ItemSwordgrassium(armurgrassium, 3).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":bootgrassium").setUnlocalizedName("bootgrassium");
		casquegrassium = new ItemSwordgrassium(armurgrassium, 0).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":casquegrassium").setUnlocalizedName("casquegrassium");
		Itemvert = new Item().setUnlocalizedName("Itemvert").setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":Itemvert");
		banane = new ItemFoodMod(5, 0.0F, true, null).setAlwaysEdible().setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":banane").setUnlocalizedName("banane");
		Acas = new ArmorAlpha(armurAlpha, 0).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":Acas").setUnlocalizedName("Acas");
		Aplast = new ArmorAlpha(armurAlpha, 1).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":Aplast").setUnlocalizedName("Aplast");
		Apant = new ArmorAlpha(armurAlpha, 2).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":Apant").setUnlocalizedName("Apant");
		Aboot = new ArmorAlpha(armurAlpha, 3).setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":Aboot").setUnlocalizedName("Aboot");
		multi = new Item().setUnlocalizedName("multi").setCreativeTab(ModAlpha.Alpha).setTextureName(Reference.MOD_ID + ":multi");
	}
	
	public static void registeur() 
	{
		GameRegistry.registerItem(Alpha, "Alpha");
		GameRegistry.registerItem(casqueAlpha, "casqueAlpha");
		GameRegistry.registerItem(plastronAlpha, "plastronAlpha");
		GameRegistry.registerItem(pantalonAlpha, "pantalonAlpha");
		GameRegistry.registerItem(bootAlpha, "bootAlpha");
		GameRegistry.registerItem(piocheAlpha, "piocheAlpha");
		GameRegistry.registerItem(epeeAlpha, "epeeAlpha");
		GameRegistry.registerItem(Itemvert, "Itemvert");
		GameRegistry.registerItem(plastrongrassium, "plastrongrassium");
		GameRegistry.registerItem(pantalongrassium, "pantalongrassium");
		GameRegistry.registerItem(bootgrassium, "bootgrassium");
		GameRegistry.registerItem(casquegrassium, "casquegrassium");
		GameRegistry.registerItem(banane, "banane");
		GameRegistry.registerItem(Acas, "Acas");
		GameRegistry.registerItem(Aplast, "Aplast");
		GameRegistry.registerItem(Apant, "Apant");
		GameRegistry.registerItem(Aboot, "Aboot");
		GameRegistry.registerItem(multi, "multi");

	}
}
