package com.martinbrook.TesseractTeams;

import org.bukkit.ChatColor;

public class TTeam {

	private String tag;
	private String name;
	private ChatColor color;
	
	public TTeam(String tag, String name, ChatColor color) {
		this.tag=tag;
		this.name=name;
		this.color=color;
		
	}
	
	public String getTag() {
		return this.tag;
	}
	
	public String getName() {
		return this.name;
	}
	
	public ChatColor getColor() {
		return this.color;
	}
	
	public String getPrefix() {
		return this.color + "[" + this.tag + "]";
	}
	
}

