package xyz.softsquirrel.afk;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.softsquirrel.afk.events.AfkInv;
public class Afk extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        getServer().getPluginManager().registerEvents(new AfkInv(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
