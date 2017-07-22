package net.rdevs.plugins.rserverinfo.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.rdevs.plugins.rserverinfo.CoreConfiguration;
import net.rdevs.plugins.rserverinfo.RServerInfo;

public class DiscordCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arg) {
		if(RServerInfo.config.getString("Discord_command").equalsIgnoreCase("true")) {
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', CoreConfiguration.DARK_GRAY + "&m-|-----------------------------|-"));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', RServerInfo.config.getString("Discord")));
		sender.sendMessage(ChatColor.translateAlternateColorCodes('&', CoreConfiguration.DARK_GRAY + "&m-|-----------------------------|-"));
		return false;

} else {
	if(RServerInfo.config.getString("Discord_command").equalsIgnoreCase("false"))
		sender.sendMessage(CoreConfiguration.GRAY + "This " + CoreConfiguration.GREEN + "§lCOMMAND" + CoreConfiguration.GRAY + " is " + CoreConfiguration.GREEN + "§ldisabled" + CoreConfiguration.GRAY + '!');
}
		return false;
}}