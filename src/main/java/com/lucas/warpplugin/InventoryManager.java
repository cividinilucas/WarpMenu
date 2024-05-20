package com.lucas.warpplugin;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    private static final List<Inventory> openInventories = new ArrayList<>();

    public static void add(Player player, Inventory inventory) {
        openInventories.add(inventory);
    }

    public static void remove(Inventory inventory) {
        openInventories.remove(inventory);
    }

    public static boolean contains(Inventory inventory) {
        return openInventories.contains(inventory);
    }

}


