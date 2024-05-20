package com.lucas.warpplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Bukkit.getPlayer;

public final class WarpPlugin extends JavaPlugin {

    @Override
    public void onEnable() {


        Bukkit.getPluginManager().registerEvents(new MenuInteractEvent(), this);


    }

}
