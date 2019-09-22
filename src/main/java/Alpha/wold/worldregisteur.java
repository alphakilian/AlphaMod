package Alpha.wold;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class worldregisteur 
{
	public static void MainRegistry() 
	{
		registeurWorldGen(new worldGen(), -1);
		registeurWorldGen(new worldGen(), 0);
		registeurWorldGen(new worldGen(), -1);
	}
	
	public static void registeurWorldGen(IWorldGenerator iGenerator, int probability) 
	{
		GameRegistry.registerWorldGenerator(iGenerator, probability);
	}
}
