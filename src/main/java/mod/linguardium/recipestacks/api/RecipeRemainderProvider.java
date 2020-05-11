package mod.linguardium.recipestacks.api;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public interface RecipeRemainderProvider
{
    public ItemStack getRecipeRemainder(ItemStack stack);
    public default boolean hasRecipeRemainder() {
        return true;
    }
    public default Item getRecipeRemainder() {
        return Items.DIRT;
    }
}
