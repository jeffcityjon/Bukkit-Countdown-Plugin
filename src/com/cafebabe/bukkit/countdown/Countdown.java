package com.cafebabe.bukkit.countdown;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Countdown extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");
	private static long SECOND = 20L;
 
	public void onEnable(){
		log.info("Countdown has been enabled!");
	}
 
	public void onDisable(){
		log.info("Countdown has been disabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (cmd.getName().equalsIgnoreCase("countdown")){ 
			this.getServer().getScheduler().scheduleAsyncDelayedTask(this, new Counter("5", ChatColor.RED), SECOND * 1);
			this.getServer().getScheduler().scheduleAsyncDelayedTask(this, new Counter("4", ChatColor.RED), SECOND * 2);
			this.getServer().getScheduler().scheduleAsyncDelayedTask(this, new Counter("3", ChatColor.RED), SECOND * 3);
			this.getServer().getScheduler().scheduleAsyncDelayedTask(this, new Counter("2", ChatColor.RED), SECOND * 4);
			this.getServer().getScheduler().scheduleAsyncDelayedTask(this, new Counter("1", ChatColor.RED), SECOND * 5);
			this.getServer().getScheduler().scheduleAsyncDelayedTask(this, new Counter("Go!", ChatColor.GREEN), SECOND * 6);
			return true;
		}
		
		return false;
	}
}
