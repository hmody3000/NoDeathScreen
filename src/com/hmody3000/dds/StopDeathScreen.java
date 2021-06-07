package com.hmody3000.dds;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class StopDeathScreen
extends JavaPlugin
implements Listener
{
public void onEnable()
{
  getServer().getPluginManager().registerEvents(this, this);
}
@EventHandler
public void onDeathOfPlayer(PlayerDeathEvent event)
{
  Player player = event.getEntity();
  player.setHealth(20.0D);
  player.teleport(player.getWorld().getSpawnLocation());
  event.getDrops().clear();
  event.setDroppedExp(0);
}
}