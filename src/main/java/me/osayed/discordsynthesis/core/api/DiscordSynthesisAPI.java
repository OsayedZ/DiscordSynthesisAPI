package me.osayed.discordsynthesis.core.api;

import me.osayed.discordsynthesis.core.IDSPlayer;
import org.javacord.api.entity.message.embed.EmbedBuilder;

public abstract class DiscordSynthesisAPI {

    private static DiscordSynthesisAPI instance;

    public static DiscordSynthesisAPI get() throws Exception {
        if (instance == null) throw new Exception("Missing implementation");
        return instance;

    }

    public abstract IDSPlayer getPlayer(String name);
    public abstract void sendMessage(ChannelType channel, String message);
    public abstract void sendMessage(ChannelType channel, EmbedBuilder builder);
    public abstract void sendChatSyncWebhook(IDSPlayer dsPlayer, String message, String displayName);
    public abstract void sendCommandLogWebhook(IDSPlayer dsPlayer, String message, String displayName);

}
