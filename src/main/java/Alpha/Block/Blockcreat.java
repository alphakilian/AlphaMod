package Alpha.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blockcreat extends Block
{

	public Blockcreat(Material p_i45394_1_, int level) 
	{
		super(p_i45394_1_);
		this.setHarvestLevel("pickaxe", level);
	}

}
