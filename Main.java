package bobcatsss.staffchat;

public class Main extends JavaPlugins{

    public void onEnable() {

        registerCommands();

        registerEvents();



    }

    public  void onDisable() {


    }

    public void registerCommands() {

        getCommand("5c").setExecutor(new Commands(this));

    }

    public void registerEvents() {

        PluginsManager pm = Bukkit.getserver().getPluginManager();
        pm.registerEvents(new Chat(this), (this));
    }
}
