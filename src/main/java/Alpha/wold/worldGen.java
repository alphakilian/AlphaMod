package Alpha.wold;

import java.util.Random;
import Alpha.Block.BlockMod;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class worldGen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId) 
		{
			case 0:
				GenerateOverworld(world, chunkX * 16, chunkZ, random);
		}
	}
	
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance) 
	{
		for(int i = 0; i < spawnChance; i++) 
		{
			int chunkSize = 16;
			int Xpos = posX + random.nextInt(chunkSize); 
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(chunkSize);
			
			new WorldGenMinable(block, maxV).generate(world, random, Xpos, Ypos, Zpos);
		}
	}
	

	private void GenerateOverworld(World world, int i, int j, Random random) 
	{
		addOre(BlockMod.Alphaston, Blocks.stone, random, world, i, j, 2, 11, 1, 1, 1);
		addOre(BlockMod.Blockvert, Blocks.stone, random, world, i, j, 1, 15, 1, 1, 2);
	}
}
