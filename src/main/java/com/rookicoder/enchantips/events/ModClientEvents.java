package com.rookicoder.enchantips.events;

import com.rookicoder.enchantips.EnchanTips;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

@Mod.EventBusSubscriber(modid = EnchanTips.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void extendOpenedTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        Map enchants = EnchantmentHelper.getEnchantments(stack);

        if (enchants.containsKey(Enchantments.AQUA_AFFINITY) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases underwater mining speed." +
                            "\nWorks with all helmets and turtle shells." +
                            "\nUp to level I."));

        } else if (enchants.containsKey(Enchantments.BANE_OF_ARTHROPODS) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases damage and applies slowness to arthropod mobs." +
                            "\nWorks with all swords and axes." +
                            "\nIncompatible with Smite and Sharpness." +
                            "\nUp to level V"));

        } else if (enchants.containsKey(Enchantments.BLAST_PROTECTION) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Reduces explosion damage and knockback." +
                            "\nWorks with all armour and turtle shells." +
                            "\nIncompatible with Fire, Projectile, and normal Protection." +
                            "\nUp to level IV"));

        } else if (enchants.containsKey(Enchantments.CHANNELING) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Directs lightning towards entity hit." +
                            "\nWorks with tridents." +
                            "\nIncompatible with Riptide." +
                            "\nUp to level I"));

        } else if (enchants.containsKey(Enchantments.BINDING_CURSE) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Cannot remove item from armour slots except if in creative or item breaks or death" +
                            "\nWorks with all armour, elytra, turtle shells, pumpkins, and heads."));

        } else if (enchants.containsKey(Enchantments.VANISHING_CURSE) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Item is deleted if you die." +
                            "\nWorks with all enchantable items."));

        } else if (enchants.containsKey(Enchantments.DEPTH_STRIDER) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases movement speed underwater." +
                            "\nWorks with boots." +
                            "\nIncompatible with Frost Walker." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.EFFICIENCY) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases mining speed. On axes, it increases the chance of stunning a shield" +
                            "\nWorks with all tools and shears." +
                            "\nUp to level V"));

        } else if (enchants.containsKey(Enchantments.FEATHER_FALLING) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Reduces fall damage" +
                            "\nWorks with all armour and turtle shells." +
                            "\nUp to level IV"));

        } else if (enchants.containsKey(Enchantments.FIRE_ASPECT) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Sets target on fire." +
                            "\nWorks with all swords." +
                            "\nUp to level II"));

        } else if (enchants.containsKey(Enchantments.FIRE_PROTECTION) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Reduces fire damage and burn time." +
                            "\nWorks with all armour and turtle shells." +
                            "\nIncompatible with Blast, Projectile, and normal Protection." +
                            "\nUp to level IV"));

        } else if (enchants.containsKey(Enchantments.FLAME) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Sets target on fire." +
                            "\nWorks with bows." +
                            "\nUp to level I"));

        } else if (enchants.containsKey(Enchantments.FORTUNE) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases certain block drops." +
                            "\nWorks with all tools." +
                            "\nIncompatible with Silk Touch." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.FROST_WALKER) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Turns water beneath player into frosted ice. Prevents magma block damage." +
                            "\nWorks with boots." +
                            "\nIncompatible with Depth Strider" +
                            "\nUp to level II"));

        } else if (enchants.containsKey(Enchantments.IMPALING) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Deals extra damage to mobs which spawn in the ocean." +
                            "\nWorks with trident." +
                            "\nIncompatible with Smite and Sharpness." +
                            "\nUp to level V"));

        } else if (enchants.containsKey(Enchantments.INFINITY) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Shooting does not consume any regular arrows." +
                            "\nWorks with bows." +
                            "\nIncompatible with Mending." +
                            "\nUp to level I"));

        } else if (enchants.containsKey(Enchantments.KNOCKBACK) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases knockback." +
                            "\nWorks with swords." +
                            "\nUp to level II"));

        } else if (enchants.containsKey(Enchantments.LOOTING) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases mob loot." +
                            "\nWorks with swords." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.LOYALTY) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Returns trident after thrown. Higher level decreases return time" +
                            "\nWorks with tridents." +
                            "\nIncompatible with Riptide." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.LUCK_OF_THE_SEA) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases rate of good loot." +
                            "\nWorks with fishing rods." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.LURE) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Decreases wait time until fish/junk/loot \'bites\'." +
                            "\nWorks with fishing rods." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.MENDING) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Repair item while gaining xp drops." +
                            "\nWorks with everything enchantable." +
                            "\nIncompatible with Infinty" +
                            "\nUp to level I"));

        } else if (enchants.containsKey(Enchantments.MULTISHOT) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Shoot 3 arrows at the cost of 1." +
                            "\nWorks with crossbows." +
                            "\nIncompatible with Piercing" +
                            "\nUp to level I"));

        } else if (enchants.containsKey(Enchantments.POWER) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases arrow damage." +
                            "\nWorks with bows." +
                            "\nUp to level V"));

        } else if (enchants.containsKey(Enchantments.PROJECTILE_PROTECTION) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Reduces projectile damage." +
                            "\nWorks with all armour and turtle shells." +
                            "\nIncompatible with Blast, Fire and Normal protection." +
                            "\nUp to level IV"));

        } else if (enchants.containsKey(Enchantments.PROTECTION) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Reduces most typed of damage by 4% for each level." +
                            "\nWorks with all armour and turtle shells." +
                            "\nIncompatible with Projectile, Fire and Blast protection" +
                            "\nUp to level IV"));

        } else if (enchants.containsKey(Enchantments.PUNCH) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases arrow knockback." +
                            "\nWorks with bows." +
                            "\nUp to level II"));

        } else if (enchants.containsKey(Enchantments.QUICK_CHARGE) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Decreases crossbow charging time." +
                            "\nWorks with crossbows." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.RESPIRATION) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Extends underwater breathing time." +
                            "\nWorks with all helmets and turtle shells." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.RIPTIDE) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Launches player itself when thrown. Only works in the water or rain. " +
                            "\nWorks with tridents." +
                            "\nIncompatible with Channeling and Loyalty" +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.SHARPNESS) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases damage." +
                            "\nWorks with swords and axes." +
                            "\nIncompatible with Bane of Arthropods and Smite" +
                            "\nUp to level V"));

        } else if (enchants.containsKey(Enchantments.SILK_TOUCH) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Mined block drop themselves." +
                            "\nWorks with all pickaxes, axes, shovels, hoes, and shears." +
                            "\nIncompatible with Fortune" +
                            "\nUp to level I"));

        } else if (enchants.containsKey(Enchantments.SMITE) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases damage to undead mobs." +
                            "\nWorks with swords and axes." +
                            "\nIncompatible with Bane of Arthropods and Sharpness" +
                            "\nUp to level V"));

        } else if (enchants.containsKey(Enchantments.SOUL_SPEED) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases walking speed on soul sand and soul soil." +
                            "\nWorks with all boots." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.SWEEPING) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases sweeping attack damage." +
                            "\nWorks with all swords." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.THORNS) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Reflects damage taken when hit at the cost of durability." +
                            "\nWorks with all armour and turtle shells." +
                            "\nUp to level III"));

        } else if (enchants.containsKey(Enchantments.UNBREAKING) && Screen.hasShiftDown()) {
            event.getToolTip().add(new StringTextComponent(
                    "Increases item durability." +
                            "\nWorks with everything enchantable." +
                            "\nCOMPATIBLE with Mending" +
                            "\nUp to level III"));

        }
    }
}
