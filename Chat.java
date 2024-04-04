package bobcatsss.staffchat;

import java.net.http.WebSocket;

public class Chat implements WebSocket.Listener {

    public Main plugin;

    public Chat (Main pl) {

        this .plugin = pl;


    }
    @EventHandler
    public void onChat(AysncPlayerChatEvent e) {

        Player p = e.getPlayer();

        String Prefix = ChatColor.tranlateAlternateColorCodes('&', "&6[&2Sc&8]");
        String msg = e.getMessage();

        if(Commands.Insc.contains(p)) {

            e.setCancelled(true);

            if(p.hasPermission("StaffChat.see")) {

                for(Player staff : Bukkit.getServer().getOnlinePlayers()) {

                    if(staff.hasPermission("StaffChat.see")) {

                        staff.sendMessage(Prefix + " " + p.getDisplayName() + org.bukkit.ChatColor.RED + ">>" + org.bukkit.ChatColor.Aqua + msg);
                    }
                }
            }
        }
    }


}
