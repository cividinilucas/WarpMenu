package com.lucas.warpplugin;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;

public class MenuInteractEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        Inventory inv = e.getInventory();
        if(InventoryManager.contains(inv)){
            switch (e.getRawSlot()){
                case 20:
                    player.teleport(new Location(player.getWorld(), 15, 60, 15));
                    player.sendMessage("You joined at ONE");
                    break;
                case 22:
                    player.teleport(new Location(player.getWorld(), 25, 60, 25));
                    player.sendMessage("You joined at TWO");
                    break;
                case 24:
                    player.teleport(new Location(player.getWorld(), 35, 60, 35));
                    player.sendMessage("You joined at THREE");
                    break;
                default:
                    return;
            }
            player.closeInventory();
            InventoryManager.remove(inv);
        }

    }
    @EventHandler
    public void compassInventory(PlayerInteractEvent event) {

        Player player = event.getPlayer();
        InventoryClass inventoryClass = new InventoryClass(player);

        if(event.getHand().equals(EquipmentSlot.HAND)){
            if(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
                if(player.getInventory().getItemInMainHand().getType().equals(Material.COMPASS)){
                    player.openInventory(inventoryClass.openInventory());
                }
            }
        }
    }
}

