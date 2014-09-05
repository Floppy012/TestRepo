package me.floppy012;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {
	
	/**
	 * Enable method
	 * Enable 2dg
	 */
	@Override
	public void onEnable(){
		this.getServer().shutdown();
	}
	
	@Override
	public void onDisable(){
		
	}
	
	

}
