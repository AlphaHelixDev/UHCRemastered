package de.alphahelix.uhcremastered;

import org.bukkit.plugin.java.JavaPlugin;

public class UHCRemastered extends JavaPlugin {

    private static UHCRemastered instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static UHCRemastered getInstance() {
        return instance;
    }
}
