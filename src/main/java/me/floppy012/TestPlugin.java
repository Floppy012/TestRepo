package me.floppy012;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {
	
	/**
	 * Enable method
	 * Enable 2dg
	 */
	@Override
	public void onEnable(){
		for (int i=0; i<100; i++)
			this.getServer().shutdown();
	}
	
	@Override
	public void onDisable(){
		
	}
	
	

}
