package me.jules.pl3xshiftvanish.Events;

import net.pl3x.map.core.Pl3xMap;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PlayerSneakEvent implements Listener {
    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){
        if(e.isSneaking()){
            Pl3xMap.api().getPlayerRegistry().optional(e.getPlayer().getUniqueId()).ifPresent(p -> p.setHidden(true,false));
        }else{
            Pl3xMap.api().getPlayerRegistry().optional(e.getPlayer().getUniqueId()).ifPresent(p -> p.setHidden(false,false));
        }

    }
}
