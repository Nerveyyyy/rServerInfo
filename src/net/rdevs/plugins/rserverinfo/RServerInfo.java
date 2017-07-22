package net.rdevs.plugins.rserverinfo;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.FileConfigurationOptions;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import net.rdevs.plugins.rserverinfo.commands.DiscordCommand;
import net.rdevs.plugins.rserverinfo.commands.ForumsCommand;
import net.rdevs.plugins.rserverinfo.commands.TeamSpeakCommand;
import net.rdevs.plugins.rserverinfo.commands.TwitterCommand;
import net.rdevs.plugins.rserverinfo.commands.WebsiteCommand;

public class RServerInfo extends JavaPlugin implements Listener {
	
	public static FileConfiguration config;
	public static File conf;
	
	public void onEnable() {
	System.out.println(CoreConfiguration.GREEN + "§l" + CoreConfiguration.PLUGIN_NAME  + CoreConfiguration.PLUGIN_VERSION + ' ' + CoreConfiguration.DARK_GRAY + "»" + ' ' + CoreConfiguration.GRAY + "This " + CoreConfiguration.GREEN + "§lPLUGIN " + CoreConfiguration.GRAY + "has been " + CoreConfiguration.GREEN + "§lENABLED" + CoreConfiguration.GRAY + '!');
		
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
    	this.getCommand("twitter").setExecutor(new TwitterCommand()); 
    	this.getCommand("forums").setExecutor(new ForumsCommand());
    	this.getCommand("rserverinfo").setExecutor(this);
}
    
    public FileConfigurationOptions getFileConfigurationOptions()
    {
    	return getConfig().options();
    }
    public void onDisable() {
    	System.out.println(CoreConfiguration.GREEN + "§l" + CoreConfiguration.PLUGIN_NAME  + CoreConfiguration.PLUGIN_VERSION + ' ' + CoreConfiguration.DARK_GRAY + "»" + ' ' + CoreConfiguration.GRAY + "This " + CoreConfiguration.GREEN + "§lPLUGIN " + CoreConfiguration.GRAY + "has been " + CoreConfiguration.GREEN + "§lDISABLED" + CoreConfiguration.GRAY + '!');
    }
    
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arg) {
		if(command.getName().equalsIgnoreCase("rserverinfo")){
			if(sender.hasPermission("rserverinfo.reload")){
				if(arg.length < 1){
					sender.sendMessage(CoreConfiguration.GREEN + CoreConfiguration.PLUGIN_NAME + CoreConfiguration.DARK_GRAY + "»" + CoreConfiguration.GREEN + "§l CREATED" + CoreConfiguration.GRAY + " by" + CoreConfiguration.GREEN + " §lPETTLES" + CoreConfiguration.GRAY + "\nhttps://www.spigotmc.org/resources/rserverinfo.44288/\n" + CoreConfiguration.DARK_GRAY + "» " + CoreConfiguration.GREEN + "/rserverinfo" + CoreConfiguration.DARK_GRAY + " - " + CoreConfiguration.GRAY + "Shows this page!\n" + CoreConfiguration.DARK_GRAY + "» " + CoreConfiguration.GREEN + "/rserverinfo reload" + CoreConfiguration.DARK_GRAY + " - " + CoreConfiguration.GRAY + "Reloads the plugin configuration file!");
					return false;
				} if(arg[0].equals("reload")) {
					Bukkit.getPluginManager().disablePlugin(this);
					Bukkit.getPluginManager().getPlugin("rServerInfo").reloadConfig();
					Bukkit.getPluginManager().enablePlugin(this);
					sender.sendMessage(CoreConfiguration.GREEN + "§l" + CoreConfiguration.PLUGIN_NAME  + ' ' + CoreConfiguration.DARK_GRAY + "»" + ' ' + CoreConfiguration.GRAY + "This " + CoreConfiguration.GREEN + "§lPLUGIN " + CoreConfiguration.GRAY + "has been " + CoreConfiguration.GREEN + "§lRELOADED" + CoreConfiguration.GRAY + '!');
					return false;
				}else {
					sender.sendMessage(CoreConfiguration.GREEN + CoreConfiguration.PLUGIN_NAME + CoreConfiguration.DARK_GRAY + "»" + CoreConfiguration.GREEN + "§l CREATED" + CoreConfiguration.GRAY + " by" + CoreConfiguration.GREEN + " §lPETTLES" + CoreConfiguration.GRAY + "\nhttps://www.spigotmc.org/resources/rserverinfo.44288/\n" + CoreConfiguration.DARK_GRAY + "» " + CoreConfiguration.GREEN + "/rserverinfo" + CoreConfiguration.DARK_GRAY + " - " + CoreConfiguration.GRAY + "Shows this page!\n" + CoreConfiguration.DARK_GRAY + "» " + CoreConfiguration.GREEN + "/rserverinfo reload" + CoreConfiguration.DARK_GRAY + " - " + CoreConfiguration.GRAY + "Reloads the plugin configuration file!");
					return false;
					}}
				}
		return false;}}

 
