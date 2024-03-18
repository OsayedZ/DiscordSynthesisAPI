package me.osayed.discordsynthesis.core;

import net.md_5.bungee.api.chat.TextComponent;

import java.util.concurrent.CompletableFuture;

public interface IDSPlayer {
    void sendMessage(String message);
    void sendMessage(TextComponent component);
    void playMentionSound();
    String getUniqueId();
    boolean hasPermission(String perm);
    boolean isPlayer();
    String getName();
    String getServerName();
    boolean isOnline();
    CompletableFuture<String> setPlaceholders(String message);

}
