package me.meepidy.clanly.cmd;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.meepidy.clanly.Clanly;
import me.meepidy.clanly.util.ItemBuilder;

public class ClanCommand implements CommandExecutor {

	private Clanly pl;
	public ClanCommand(Clanly pl) {
		this.pl = pl;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(cmd.getName().equalsIgnoreCase("clan") || cmd.getName().equalsIgnoreCase("cl")) {
			if(args.length == 0) {
				if(!(sender instanceof Player)) {
					pl.console = (ConsoleCommandSender) sender;
					sender.sendMessage("§c-----[§fClanly§c]-----");
					sender.sendMessage("§fVersion§c: " + pl.pdfFile.getVersion());
					sender.sendMessage("§fAuthor§c: " + pl.pdfFile.getAuthors());
					sender.sendMessage("§fHelp§c: /" + label + " help");
					sender.sendMessage("§c------------------");
					return true;
				}
				sender.sendMessage("§f-----§7[§b§lClanly§7]§f-----");
				sender.sendMessage("§7Version§b§l: " + pl.pdfFile.getVersion());
				sender.sendMessage("§7Author§b§l: " + pl.pdfFile.getAuthors());
				sender.sendMessage("§7Help§b§l: /" + label + " help");
				sender.sendMessage("§f----------------");
				
			} else if(args.length == 1) {
				
				if(args[0].equalsIgnoreCase("create")) {
					
					if(args.length != 2) {
						sender.sendMessage(pl.prefix + "Invalid arguments! Usage: /" + label + " create <name>");
						return true;
					}
					
				} else if(args[0].equalsIgnoreCase("menu")) {
					ItemStack createitem = new ItemBuilder(Material.YELLOW_FLOWER).displayname("§e§lCreate a clan").lore("Create a new clan!").build();
				}
				
			}

		}

		return true;
	}

}
