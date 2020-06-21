package be.exacu.Spigot;

import org.bukkit.plugin.java.JavaPlugin;

public class Tags extends JavaPlugin {

    public void onEnable(){

        getLogger().info("(!) Tags Plugin loaded");

        getServer().getPluginManager().registerEvents();

    }

    public void onDisable(){

    }

}
