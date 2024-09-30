package net.minevn.minigameplaceholder;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public class MinigameExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "minigamecount";
    }

    @Override
    public @NotNull String getAuthor() {
        return "MineVN";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, String params) {
        if (params.equals("all")) {
            return String.valueOf(MinigamePlaceholder.getInstance().getTotalPlayerCount());
        }
        return String.valueOf(MinigamePlaceholder.getInstance().getPlayerCount(params));
    }
}
