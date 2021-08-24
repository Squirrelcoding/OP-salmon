package xyz.softsquirrel.afk.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import xyz.softsquirrel.afk.newLoot.Loot;
import java.util.Random;

public class AfkInv implements Listener {
    @EventHandler
    public void onFishKill(EntityDeathEvent event) {
        EntityType entity = event.getEntityType();
        if (entity == EntityType.SALMON) {
            Random rand = new Random();
            event.getDrops().clear();
            switch (rand.nextInt(38)) {
                //Generated with javascript for loop.
                case 1:
                    event.getDrops().add(new Loot().tool2());
                    break;
                case 2:
                    event.getDrops().add(new Loot().tool3());
                    break;
                case 3:
                    event.getDrops().add(new Loot().tool4());
                    break;
                case 4:
                    event.getDrops().add(new Loot().tool5());
                    break;
                case 5:
                    event.getDrops().add(new Loot().armor11());
                    break;
                case 6:
                    event.getDrops().add(new Loot().armor12());
                    break;
                case 7:
                    event.getDrops().add(new Loot().armor13());
                    break;
                case 8:
                    event.getDrops().add(new Loot().armor21());
                    break;
                case 9:
                    event.getDrops().add(new Loot().armor22());
                    break;
                case 10:
                    event.getDrops().add(new Loot().armor23());
                    break;
                case 11:
                    event.getDrops().add(new Loot().armor31());
                    break;
                case 12:
                    event.getDrops().add(new Loot().armor32());
                    break;
                case 13:
                    event.getDrops().add(new Loot().armor33());
                    break;
                case 14:
                    event.getDrops().add(new Loot().armor41());
                    break;
                case 15:
                    event.getDrops().add(new Loot().armor42());
                    break;
                case 16:
                    event.getDrops().add(new Loot().armor43());
                    break;
                case 17:
                    event.getDrops().add(new Loot().block1());
                    break;
                case 18:
                    event.getDrops().add(new Loot().block2());
                    break;
                case 19:
                    event.getDrops().add(new Loot().block3());
                    break;
                case 20:
                    event.getDrops().add(new Loot().block4());
                    break;
                case 21:
                    event.getDrops().add(new Loot().block5());
                    break;
                case 22:
                    event.getDrops().add(new Loot().block6());
                    break;
                case 23:
                    event.getDrops().add(new Loot().block7());
                    break;
                case 24:
                    event.getDrops().add(new Loot().block8());
                    break;
                case 25:
                    event.getDrops().add(new Loot().block9());
                    break;
                case 26:
                    event.getDrops().add(new Loot().block10());
                    break;
                case 27:
                    event.getDrops().add(new Loot().potion1());
                    break;
                case 28:
                    event.getDrops().add(new Loot().other1());
                    break;
                case 29:
                    event.getDrops().add(new Loot().tool1());
                    break;
                case 30:
                    event.getDrops().add(new Loot().other2());
                    break;
                case 31:
                    event.getDrops().add(new Loot().other3());
                    break;
                case 32:
                    event.getDrops().add(new Loot().other4());
                    break;
                case 33:
                    event.getDrops().add(new Loot().weapon1());
                    break;
                case 34:
                    event.getDrops().add(new Loot().weapon2());
                    break;
                case 35:
                    event.getDrops().add(new Loot().weapon3());
                    break;
                case 36:
                    event.getDrops().add(new Loot().weapon4());
                    break;
                case 37:
                    Random rand2 = new Random();
                    if (rand2.nextInt(50) == 23) {
                        event.getDrops().add(new Loot().other5());
                    }
                    break;
                default:

            }
        }
    }
    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();
            if (player.getName().equals("Fffff9")) {
                double dmg = event.getDamage();
                event.setDamage(dmg * 1.15);
            } else if (player.getName().equals("_MMMMMMMMTTYYY_")) {
                double dmg = event.getDamage();
                event.setDamage(dmg * 0.9);
            }
        }
    }
}