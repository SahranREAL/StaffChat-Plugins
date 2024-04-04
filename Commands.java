package bobcatsss.staffchat;

import org.bukkit.command.Command;

import java.util.ArrayList;

Public class Commands implements CommandExecutor {

    public Main plugins;

    plublic Commands(Main pl) {

        this.plugins = pl;
    }

    public static ArrayList<Player> Insc = new ArrayList<Player>();

    String Prefix = ChatColor.tranlateAlternateColorCodes('&', "&6[&2Sc&8]");
    String Enable = ChatColor.tranlateAlternateColorCodes('&', Prefix + "&6StaffChat has been &2Enabled");
    String Disable = ChatColor.tranlateAlternateColorCodes('&', Prefix + "&6StaffChat has been &cDisabled");
    String NoPerm = ChatColor.tranlateAlternateColorCodes('&', "&cYou don't have permission to use this command");

@Override
public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
    if(cmd.getName().equalsIgnoreCase("sc")) {

        if(!(sender instanceof Player)) {


            sender.sendMessage("You must be a player to use this command");

            return true;

        }

        Player p = (Player) sender;

        if(args.length == 0) {

            if(!(p.hasPermission("Staffchat.use"))) {

                p.sendMessage(NoPerm);

                return true;

            }

            if(Insc.contains(p)) {

                Insc.remove(p);
                p.sendMessage(Disabled);

                return  true;

            } else

                Insc.add(p);
            p.sendMessage(Enabled);

            return truc;
        }

        if(args.length >= 1) {

            p.sendMessage(Prefix + chatcolor.GRAY + "Usage: /sc");

            return true;
        }
    }
    return false;


     }
}
