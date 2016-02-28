package me.floppy012;

import lombok.Getter;
import me.floppy012.listener.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {
	
	@Getter
	private static TestPlugin instance;
	
	@Override
	public void onEnable(){
		instance = this;
		//Listener
		PluginManager pluginManager = Bukkit.getPluginManager();
		pluginManager.registerEvents(new PlayerListener(), this);
	
		//Commands
		//this.getCommand("command").setExecutor(new YourExecutor());
	}
	
	@Override
	public void onDisable(){
		
	}
	
	

}
