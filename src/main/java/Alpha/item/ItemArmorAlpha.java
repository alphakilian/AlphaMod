package Alpha.item;

import Alpha.AlphaMod.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorAlpha extends ItemArmor
{
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if(this == ItemMod.casqueAlpha) 
		{
			player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 660, 0));
		}
		
		if(this == ItemMod.plastronAlpha) 
		{
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 660, 0));
		}
		
		if(this == ItemMod.pantalonAlpha)
		{
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 2, 2));
		}
		
		if(this == ItemMod.bootAlpha) 
		{
			player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 2, 1));
		}
	}

	public ItemArmorAlpha(ArmorMaterial material, int metaData) 
	{
		super(material, 0, metaData);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if(stack.getItem() == ItemMod.pantalonAlpha)
		{
			return Reference.MOD_ID + ":textures/models/armor/armurealpha_layer_2.png";
		}
		
		else if (stack.getItem() == ItemMod.casqueAlpha || stack.getItem() ==  ItemMod.plastronAlpha || stack.getItem() == ItemMod.bootAlpha)
		{
			return Reference.MOD_ID + ":textures/models/armor/armurealpha_layer_1.png";
		}
		return null;
	}
	
	
}




