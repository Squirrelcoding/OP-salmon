package xyz.softsquirrel.afk.newLoot;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.Map;

public class Loot {

    /*=======TOOLS=======*/
    //Silk touch pickaxe
    public ItemStack tool1(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.SILK_TOUCH, 2);
        e.put(Enchantment.DIG_SPEED, 255);
        e.put(Enchantment.DURABILITY, 255);
        ItemStack loot = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta meta = loot.getItemMeta();
        meta.setDisplayName("bruh pickaxe");
        loot.setItemMeta(meta);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    //Fortune pickaxe
    public ItemStack tool2(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.LOOT_BONUS_BLOCKS, 100);
        e.put(Enchantment.DIG_SPEED, 255);
        e.put(Enchantment.DURABILITY, 255);
        ItemStack loot = new ItemStack(Material.NETHERITE_PICKAXE);
        ItemMeta meta = loot.getItemMeta();
        meta.setDisplayName("bruh pickaxe");
        loot.setItemMeta(meta);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    //Silk touch axe
    public ItemStack tool3(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.SILK_TOUCH, 2);
        e.put(Enchantment.DIG_SPEED, 255);
        e.put(Enchantment.DURABILITY, 255);
        ItemStack loot = new ItemStack(Material.NETHERITE_AXE);
        ItemMeta meta = loot.getItemMeta();
        meta.setDisplayName("sussy axe");
        loot.setItemMeta(meta);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    //Silk touch shovel
    public ItemStack tool4(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.SILK_TOUCH, 2);
        e.put(Enchantment.DIG_SPEED, 255);
        e.put(Enchantment.DURABILITY, 255);
        ItemStack loot = new ItemStack(Material.NETHERITE_SHOVEL);
        ItemMeta meta = loot.getItemMeta();
        meta.setDisplayName("Never gonna give you up Never gonna let you down");
        loot.setItemMeta(meta);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    //Fortune Hoe
    public ItemStack tool5(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.LOOT_BONUS_BLOCKS, 2);
        e.put(Enchantment.DIG_SPEED, 255);
        e.put(Enchantment.DURABILITY, 255);
        ItemStack loot = new ItemStack(Material.NETHERITE_HOE);
        ItemMeta meta = loot.getItemMeta();
        meta.setDisplayName("amogus");
        loot.setItemMeta(meta);
        loot.addUnsafeEnchantments(e);
        return loot;
    }

    /*=======ARMOR=======*/
    //There will be 3 armor types for every piece, 1 good, 1 neutral, and 1 bad. But still OP.
    public ItemStack armor11(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_EXPLOSIONS, 25);
        e.put(Enchantment.DURABILITY, 50);
        e.put(Enchantment.THORNS, 2);
        ItemStack loot = new ItemStack(Material.IRON_HELMET);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack armor12(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 30);
        e.put(Enchantment.DURABILITY, 75);
        e.put(Enchantment.THORNS, 5);
        ItemStack loot = new ItemStack(Material.DIAMOND_HELMET);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack armor13(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 50);
        e.put(Enchantment.DURABILITY, 100);
        e.put(Enchantment.THORNS, 10);
        e.put(Enchantment.OXYGEN, 25);
        ItemStack loot = new ItemStack(Material.NETHERITE_HELMET);
        loot.addUnsafeEnchantments(e);
        return loot;
    }

    public ItemStack armor21(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 20);
        e.put(Enchantment.DURABILITY, 10);
        e.put(Enchantment.THORNS, 3);
        ItemStack loot = new ItemStack(Material.GOLDEN_CHESTPLATE);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack armor22(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 45);
        e.put(Enchantment.DURABILITY, 20);
        e.put(Enchantment.THORNS, 5);
        ItemStack loot = new ItemStack(Material.DIAMOND_CHESTPLATE);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack armor23(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 75);
        e.put(Enchantment.DURABILITY, 45);
        e.put(Enchantment.THORNS, 10);
        ItemStack loot = new ItemStack(Material.NETHERITE_CHESTPLATE);
        loot.addUnsafeEnchantments(e);
        return loot;
    }

    public ItemStack armor31(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 40);
        e.put(Enchantment.DURABILITY, 20);
        e.put(Enchantment.THORNS, 2);
        ItemStack loot = new ItemStack(Material.LEATHER_LEGGINGS);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack armor32(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 30);
        e.put(Enchantment.DURABILITY, 50);
        e.put(Enchantment.THORNS, 9);
        ItemStack loot = new ItemStack(Material.IRON_LEGGINGS);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack armor33(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 50);
        e.put(Enchantment.DURABILITY, 100);
        e.put(Enchantment.THORNS, 20);
        ItemStack loot = new ItemStack(Material.DIAMOND_LEGGINGS);
        loot.addUnsafeEnchantments(e);
        return loot;
    }

    public ItemStack armor41(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 20);
        e.put(Enchantment.DURABILITY, 30);
        e.put(Enchantment.THORNS, 7);
        ItemStack loot = new ItemStack(Material.CHAINMAIL_BOOTS);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack armor42(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 20);
        e.put(Enchantment.DURABILITY, 20);
        e.put(Enchantment.THORNS, 10);
        ItemStack loot = new ItemStack(Material.IRON_BOOTS);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack armor43(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 50);
        e.put(Enchantment.DURABILITY, 100);
        e.put(Enchantment.THORNS, 15);
        ItemStack loot = new ItemStack(Material.NETHERITE_BOOTS);
        loot.addUnsafeEnchantments(e);
        return loot;
    }

    /*=======WEAPONS=======*/
    public ItemStack weapon1(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.DAMAGE_ALL, 20);
        e.put(Enchantment.DURABILITY, 30);
        e.put(Enchantment.KNOCKBACK, 3);
        ItemStack loot = new ItemStack(Material.IRON_SWORD);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack weapon2(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.DAMAGE_ALL, 30);
        e.put(Enchantment.DURABILITY, 50);
        e.put(Enchantment.KNOCKBACK, 4);
        e.put(Enchantment.FIRE_ASPECT, 3);
        ItemStack loot = new ItemStack(Material.DIAMOND_SWORD);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack weapon3(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.DAMAGE_ALL, 40);
        e.put(Enchantment.DURABILITY, 100);
        e.put(Enchantment.KNOCKBACK, 10);
        e.put(Enchantment.FIRE_ASPECT, 5);
        e.put(Enchantment.LOOT_BONUS_MOBS, 10);
        ItemStack loot = new ItemStack(Material.NETHERITE_SWORD);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack weapon4(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.DURABILITY, 20);
        e.put(Enchantment.ARROW_DAMAGE, 10);
        e.put(Enchantment.ARROW_FIRE, 2);
        e.put(Enchantment.ARROW_KNOCKBACK, 10);
        ItemStack loot = new ItemStack(Material.BOW);
        ItemMeta meta = loot.getItemMeta();
        meta.setDisplayName("bruh bow");
        loot.addUnsafeEnchantments(e);
        return loot;
    }

    /*=======BLOCKS=======*/
    //for the blocks I cloud have done "return new ItemStack(Material.<BLOCK>, 64);" but I dont want to
    public ItemStack block1(){
        ItemStack loot = new ItemStack(Material.STONE, 64);
        return loot;
    }
    public ItemStack block2(){
        ItemStack loot = new ItemStack(Material.DIAMOND_BLOCK, 64);
        return loot;
    }
    public ItemStack block3(){
        ItemStack loot = new ItemStack(Material.OBSIDIAN, 64);
        return loot;
    }
    public ItemStack block4(){
        ItemStack loot = new ItemStack(Material.BEDROCK, 64);
        return loot;
    }
    public ItemStack block5(){
        ItemStack loot = new ItemStack(Material.BARRIER, 64);
        return loot;
    }
    public ItemStack block6(){
        ItemStack loot = new ItemStack(Material.BLACK_CANDLE, 64);
        return loot;
    }
    public ItemStack block7(){
        ItemStack loot = new ItemStack(Material.END_PORTAL_FRAME, 64);
        return loot;
    }
    public ItemStack block8(){
        ItemStack loot = new ItemStack(Material.EXPOSED_CUT_COPPER_STAIRS, 64);
        return loot;
    }
    public ItemStack block9(){
        ItemStack loot = new ItemStack(Material.SPAWNER, 64);
        return loot;
    }
    public ItemStack block10(){
        ItemStack loot = new ItemStack(Material.YELLOW_SHULKER_BOX);
        return loot;
    }


    /*=======OTHER=======*/
    public ItemStack potion1(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.PROTECTION_ENVIRONMENTAL, 50);
        e.put(Enchantment.THORNS, 5);
        e.put(Enchantment.CHANNELING, 100);
        ItemStack loot = new ItemStack(Material.POTION);
        PotionMeta metaPotion = (PotionMeta) loot.getItemMeta();
        metaPotion.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 600, 3), true);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack other1(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.DAMAGE_ALL, 2);
        e.put(Enchantment.KNOCKBACK, 2);
        ItemStack loot = new ItemStack(Material.SPYGLASS);
        loot.addUnsafeEnchantments(e);
        return loot;
    }
    public ItemStack other2(){
        ItemStack loot = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta meta = loot.getItemMeta();
        meta.setDisplayName("bruh totem");
        return loot;
    }
    public ItemStack other3(){
        ItemStack loot = new ItemStack(Material.ELYTRA);
        ItemMeta meta = loot.getItemMeta();
        meta.setDisplayName("SUScribe to pro poop");
        return loot;
    }
    public ItemStack other4(){
        ItemStack loot = new ItemStack(Material.FIREWORK_ROCKET, 64);
        return loot;
    }
    public ItemStack other5(){
        Map<Enchantment, Integer> e = new HashMap<>();
        e.put(Enchantment.DAMAGE_ALL, 255);
        e.put(Enchantment.KNOCKBACK, 20);
        ItemStack loot = new ItemStack(Material.DIRT);
        ItemMeta meta = loot.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "ULTIMATE POOP");
        loot.setItemMeta(meta);
        loot.addUnsafeEnchantments(e);
        return loot;
    }



}
