package com.cafebabe.bukkit.countdown;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Counter implements Runnable {
	
	ChatColor c;
	String message;

	public Counter(String message, ChatColor c) {
		this.c = c;
		this.message = message;
	}
	
	@Override
	public void run() {
		try {
			Bukkit.getServer().broadcastMessage(c + message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
