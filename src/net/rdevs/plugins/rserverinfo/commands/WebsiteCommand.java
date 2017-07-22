package net.rdevs.plugins.rserverinfo.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.rdevs.plugins.rserverinfo.RServerInfo;

public class WebsiteCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arg) {
		if(RServerInfo.config.getString("Website_command").equalsIgnoreCase("true")) {
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m-|-----------------------------|-"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', RServerInfo.config.getString("Website")));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m-|-----------------------------|-"));
		return false;

} else {
	if(RServerInfo.config.getString("Website_command").equalsIgnoreCase("false"))
		sender.sendMessage("§cThis command is disabled");
}
		return false;
}}