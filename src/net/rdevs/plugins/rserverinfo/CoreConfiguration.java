package net.rdevs.plugins.rserverinfo;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import net.md_5.bungee.api.ChatColor;

public class CoreConfiguration {
	
	static Plugin plugin = Bukkit.getPluginManager().getPlugin("rServerInfo");	
	
	//STRINGS
	public static String PLUGIN_NAME = plugin.getDescription().getName();
	public static String PLUGIN_VERSION = plugin.getDescription().getVersion();
	
	//CHATCOLORS
	public static ChatColor RED = ChatColor.RED;
	public static ChatColor GREEN = ChatColor.GREEN;
	public static ChatColor DARK_GRAY = ChatColor.DARK_GRAY;
	public static ChatColor GRAY = ChatColor.GRAY;

	
}
