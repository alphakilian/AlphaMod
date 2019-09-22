package Alpha.item;

import Alpha.AlphaMod.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorAlpha extends ItemArmor
{

	public ArmorAlpha(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) 
	{
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}

	
	public ArmorAlpha(ArmorMaterial material, int metaData) 
	{
		super(material, 0, metaData);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if(stack.getItem() == ItemMod.Apant)
		{
			return Reference.MOD_ID + ":textures/models/armor/armurealpha_layer_A2.png";
		}
		
		else if (stack.getItem() == ItemMod.Acas || stack.getItem() ==  ItemMod.Aplast || stack.getItem() == ItemMod.Aboot)
		{
			return Reference.MOD_ID + ":textures/models/armor/armurealpha_layer_A1.png";
		}
		return null;
	}

}
