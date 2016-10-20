package me.meepidy.clanly;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import me.meepidy.clanly.cmd.ClanCommand;

public class Clanly extends JavaPlugin {
	
	public Inventory claninv = Bukkit.createInventory(null, 9, "§bClan Menu");

	public ConsoleCommandSender console = this.getServer().getConsoleSender();
	public PluginDescriptionFile pdfFile = this.getDescription();

	public String prefix = "§b§lClanly §7» §f"; //TODO: Maybe configurable.

	public void registerCommands() {
		this.getCommand("clan").setExecutor(new ClanCommand(this));
	}

}
