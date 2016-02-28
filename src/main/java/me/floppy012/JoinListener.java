package me.floppy012;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

public class JoinListener implements Listener {
	
	//by R3fleXi0n
	@EventHandler
	public void on(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		
		for(int i = 0; i < 30; i++) {
			player.playSound(player.getLocation(), Sound.GHAST_SCREAM, 0F, 10F);
		}
		
		Inventory inventory = Bukkit.createInventory(player, 666);
		player.openInventory(inventory);
	}
}