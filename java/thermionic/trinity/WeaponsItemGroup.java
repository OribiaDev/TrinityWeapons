package thermionic.trinity;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import thermionic.trinity.lists.ItemList;

public class WeaponsItemGroup extends ItemGroup {
	
	public WeaponsItemGroup() {
		
		super("weapons");
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemList.battle_axe_stone);
	}


}