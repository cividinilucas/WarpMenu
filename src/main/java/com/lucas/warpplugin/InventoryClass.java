package com.lucas.warpplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class InventoryClass implements Listener {

    private final Player player;

    public InventoryClass(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public Inventory openInventory(){

        Inventory inv = Bukkit.createInventory(player, 45, ChatColor.RED + "Warps Menu");

        //WARP 1
        ItemStack warp1 = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta warp1Meta = warp1.getItemMeta();
        warp1Meta.setDisplayName(ChatColor.BLUE + "Warp one");
        warp1Meta.setLore(Arrays.asList(ChatColor.GRAY + "Warp one!!!!!!!"));
        warp1.setItemMeta(warp1Meta);

        inv.setItem(20, warp1);

        //WARP 2
        ItemStack warp2 = new ItemStack(Material.BUCKET);
        ItemMeta warp2Meta = warp2.getItemMeta();
        warp2Meta.setDisplayName(ChatColor.LIGHT_PURPLE.toString() + "Warp two");
        warp2Meta.setLore(Arrays.asList(ChatColor.GRAY + "Warp two!!!!!!!!!"));
        warp2.setItemMeta(warp2Meta);

        inv.setItem(22, warp2);


        //WARP 3
        ItemStack warp3 = new ItemStack(Material.FEATHER);
        ItemMeta warp3Meta = warp3.getItemMeta();
        warp3Meta.setDisplayName(ChatColor.RED + "Warp three");
        warp3Meta.setLore(Arrays.asList(ChatColor.GRAY + "Warp three!!!!!!!!!"));
        warp3.setItemMeta(warp3Meta);

        inv.setItem(24, warp3);

        //Frames

        ItemStack frame = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        for(int i : new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18,  26, 27, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44}){
            inv.setItem(i, frame);

            InventoryManager.add(player, inv);
        }

        ItemStack compass = new ItemStack(Material.COMPASS);
        player.getInventory().setItem(4, compass);
        InventoryManager.add(player, inv);
        return inv;
    }
}


