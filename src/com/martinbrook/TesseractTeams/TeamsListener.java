package com.martinbrook.TesseractTeams;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;


public class TeamsListener implements Listener {
	private TesseractTeams plugin;
	
	public TeamsListener(TesseractTeams plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerChatEvent(AsyncPlayerChatEvent e) {
		
		TTeam t = plugin.getTeam(e.getPlayer());
		if (t == null) return;
		
		e.setFormat("<" + t.getColor() + "%s" + ChatColor.RESET + ">: %s");
		
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		plugin.setDisplayName(e.getPlayer());
	}

	
}
