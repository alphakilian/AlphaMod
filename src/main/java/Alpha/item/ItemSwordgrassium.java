package Alpha.item;

import Alpha.AlphaMod.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSwordgrassium extends ItemArmor
{
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		if(stack.getItem() == ItemMod.pantalongrassium)
		{
			return Reference.MOD_ID + ":textures/models/armor/iron_layer_2.png";
		}
		
		else if (stack.getItem() == ItemMod.casquegrassium || stack.getItem() ==  ItemMod.plastrongrassium || stack.getItem() == ItemMod.bootgrassium)
		{
			return Reference.MOD_ID + ":textures/models/armor/iron_layer_1.png";
		}
		return null;
	}

	public ItemSwordgrassium(ArmorMaterial material, int metaData) 
	{
		super(material, 0, metaData);
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if(this == ItemMod.casquegrassium) 
		{
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 660, 0));
		}
	}

}
