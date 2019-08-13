package thermionic.trinity;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import thermionic.trinity.lists.ItemList;

public class CraftingItemGroup extends ItemGroup {

	public CraftingItemGroup() {
		
		super("crafting");
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemList.spear_head_iron);
	}
	
}
