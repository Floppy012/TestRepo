package me.floppy012.listener;

import me.floppy012.TestPlugin;
import me.floppy012.util.FuckVelocity;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;

public class PlayerListener implements Listener {

	//by R3fleXi0n
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		final Player player = e.getPlayer();

		player.setMaxHealth(60.0);
		player.setHealth(player.getMaxHealth());
		player.setGameMode(GameMode.ADVENTURE);
		
		for (int i = 0; i < 30; i++) {
			player.playSound(player.getLocation(), Sound.GHAST_SCREAM, 0.5F, TestPlugin.getRandomEngine().nextFloat() * i);
		}

		//Need delay else it will not work :o
		Bukkit.getScheduler().runTaskLater(TestPlugin.getInstance(), new Runnable() {
			
			public void run() {
				Inventory inventory = Bukkit.createInventory(player, 666);
				player.openInventory(inventory);
			}
			
		}, 5);
		
		new FuckVelocity(player).start();
	}
	
	@EventHandler
	public void on(PlayerMoveEvent e) {
		Player player = e.getPlayer();
		player.getLocation().subtract(0, 1, 0).getBlock().setType(Material.GLASS);
	}
}
