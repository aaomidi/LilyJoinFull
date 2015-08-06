package com.aaomidi.lilyjoinfull;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Amir on 2015-08-06.
 */
public class LilyJoinFull extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onLogin(PlayerLoginEvent event) {
        if (event.getResult() != PlayerLoginEvent.Result.KICK_FULL) return;

        if (!event.getPlayer().hasPermission("lily.join.full.server")) return;

        event.allow();
    }
}
