package me.xemu.echo;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class Echo extends JavaPlugin {

    private List<Player> echos = new ArrayList<>();

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new EchoEvent(this), this);
        getCommand("echo").setExecutor(new EchoCommand(this));
        getLogger().info("Plugin Enabled");

    }

    @Override
    public void onDisable() {

        getLogger().info("Plugin Disabled");

    }

    public List<Player> getEchos()
    {
        return this.echos;
    };

}
