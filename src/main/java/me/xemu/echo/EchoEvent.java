package me.xemu.echo;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class EchoEvent implements Listener {

    private final Echo plugin;
    public EchoEvent(Echo plugin)
    {
        this.plugin = plugin;
    };

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event)
    {
        Player player = event.getPlayer();
        if(plugin.getEchos().contains(player)) {
            player.sendMessage(ChatColor.GRAY + "§o" + event.getMessage());
        }
    }
}
