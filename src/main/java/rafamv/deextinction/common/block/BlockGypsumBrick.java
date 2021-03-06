package rafamv.deextinction.common.block;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import rafamv.deextinction.common.registry.DECreativeTabs;
import rafamv.deextinction.common.registry.DEItemRegistry;

public class BlockGypsumBrick extends Block
{

	public BlockGypsumBrick()
	{
		super(Material.rock);
		this.setUnlocalizedName("block_gypsum_brick");
		this.setHardness(1.25F);
		this.setResistance(25.0F);
		this.setStepSound(Block.soundTypePiston);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(DECreativeTabs.blocks);
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
	{
		List<ItemStack> list = new ArrayList<ItemStack>();
		list.add(new ItemStack(DEItemRegistry.gypsum_powder, 1 + Block.RANDOM.nextInt(8)));
		return list;
	}
}
