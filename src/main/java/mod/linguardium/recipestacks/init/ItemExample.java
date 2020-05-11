package mod.linguardium.recipestacks.init;

import mod.linguardium.recipestacks.api.RecipeRemainderProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ItemExample extends Item implements RecipeRemainderProvider {
    public ItemExample(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return new ItemStack(Items.DIAMOND);
    }
}
