package mod.linguardium.recipestacks.mixin;

import mod.linguardium.recipestacks.api.RecipeRemainderProvider;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.*;
import net.minecraft.util.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(value = {ShapelessRecipe.class, ShapedRecipe.class, SpecialCraftingRecipe.class, AbstractCookingRecipe.class})
public abstract class RecipeRemainderMixin implements CraftingRecipe {

    @Override
    public DefaultedList<ItemStack> getRemainingStacks(CraftingInventory inventory) {
        DefaultedList<ItemStack> defaultedList = DefaultedList.ofSize(inventory.getInvSize(), ItemStack.EMPTY);

        for(int i = 0; i < defaultedList.size(); ++i) {
            Item item = inventory.getInvStack(i).getItem();
            if (item instanceof RecipeRemainderProvider) {
                defaultedList.set(i,((RecipeRemainderProvider) item).getRecipeRemainder(inventory.getInvStack(i)));
            }else if (item.hasRecipeRemainder()) {
                defaultedList.set(i, new ItemStack(item.getRecipeRemainder()));
            }
        }

        return defaultedList;
    }

}
