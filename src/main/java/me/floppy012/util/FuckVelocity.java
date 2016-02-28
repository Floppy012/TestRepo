package me.floppy012.util;

import java.util.Random;
import me.floppy012.TestPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class FuckVelocity {

	private Player player;
	
	public FuckVelocity(Player player) {
		this.player = player;
	}
	
	public void start() {
		new BukkitRunnable() {
			
			int i = 25;
			
			public void run() {
				if (i <= 0) this.cancel();
				
				Random rand = TestPlugin.getRandomEngine();
				Vector vec = new Vector(
						rand.nextDouble() * 3.5 * (rand.nextBoolean() ? -1 : 1), 
						rand.nextDouble() * 0.5, 
						rand.nextDouble() * 3.5 * (rand.nextBoolean() ? -1 : 1)
				);
				player.setVelocity(vec);
				i--;
			}
			
			
		}.runTaskTimer(TestPlugin.getInstance(), 0, 3);
	}
	
}
