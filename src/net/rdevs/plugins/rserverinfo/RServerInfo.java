package net.rdevs.plugins.rserverinfo;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import net.rdevs.plugins.rserverinfo.commands.DiscordCommand;
import net.rdevs.plugins.rserverinfo.commands.TeamSpeakCommand;
import net.rdevs.plugins.rserverinfo.commands.WebsiteCommand;

public class RServerInfo extends JavaPlugin implements Listener {
	
	public static FileConfiguration config;
	public static File conf;
	
	public void onEnable() {
	System.out.println("§7§lWe successfully Enabled rTeamspeak! §c§lENJOY THE PLUGIN!");
		
	this.registerCommands();
	
	config = getConfig();
	config.options().copyDefaults(true);
	conf = new File(getDataFolder(), "config.yml");
	saveConfig();
	saveDefaultConfig();
	}
	
    private void registerCommands() {
    	this.getCommand("teamspeak").setExecutor(new TeamSpeakCommand());
    	this.getCommand("website").setExecutor(new WebsiteCommand());
    	this.getCommand("discord").setExecutor(new DiscordCommand());
}
    
    public FileConfigurationOptions getFileConfigurationOptions()
    {
    	return getConfig().options();
    }
    public void onDisable() {
    	System.out.println("§7§lWe successfully Disabled rTeamspeak! §c§lSEE YOU SOON!!");
    }
    	
}

