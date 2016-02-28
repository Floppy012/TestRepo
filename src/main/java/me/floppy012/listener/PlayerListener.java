package me.floppy012.listener;

import me.floppy012.TestPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

public class PlayerListener implements Listener {

	//by R3fleXi0n
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		final Player player = e.getPlayer();

		for (int i = 0; i < 30; i++) {
			player.playSound(player.getLocation(), Sound.GHAST_SCREAM, 0.1F, 10F);
		}

		//Need delay else it will not work :o
		Bukkit.getScheduler().runTaskLater(TestPlugin.getInstance(), new Runnable() {
			
			public void run() {
				Inventory inventory = Bukkit.createInventory(player, 666);
				player.openInventory(inventory);
			}
			
		}, 5);
		
		
	}
}
