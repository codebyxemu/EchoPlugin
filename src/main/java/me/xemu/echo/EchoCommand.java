package me.xemu.echo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EchoCommand implements CommandExecutor
{

    private final Echo plugin;
    public EchoCommand(Echo plugin)
    {
        this.plugin = plugin;
    };

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        Player player = (Player) sender;
        if(command.getName().equalsIgnoreCase("echo"))
        {
            if(plugin.getEchos().contains(player)){
                plugin.getEchos().remove(player);
                player.sendMessage("§8[§3Echo§8] §7Echo §cDisabled");
            } else {
                plugin.getEchos().add(player);
                player.sendMessage("§8[§3Echo§8] §7Echo §aEnabled");
            }
        };

        return true;
    };

};