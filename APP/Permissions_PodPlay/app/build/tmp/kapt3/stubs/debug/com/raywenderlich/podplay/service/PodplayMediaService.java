package com.raywenderlich.podplay.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0003J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0016J$\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J$\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001b2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#H\u0016J\b\u0010&\u001a\u00020\u0007H\u0016J\b\u0010\'\u001a\u00020\u0007H\u0016J\b\u0010(\u001a\u00020\u0007H\u0016J\u0012\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010+H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/raywenderlich/podplay/service/PodplayMediaService;", "Landroidx/media/MediaBrowserServiceCompat;", "Lcom/raywenderlich/podplay/service/PodplayMediaCallback$PodplayMediaListener;", "()V", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "createMediaSession", "", "createNotification", "Landroid/app/Notification;", "mediaDescription", "Landroid/support/v4/media/MediaDescriptionCompat;", "bitmap", "Landroid/graphics/Bitmap;", "createNotificationChannel", "displayNotification", "getNotificationIntent", "Landroid/app/PendingIntent;", "getPausePlayActions", "Lkotlin/Pair;", "Landroidx/core/app/NotificationCompat$Action;", "isPlaying", "", "onCreate", "onGetRoot", "Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;", "clientPackageName", "", "clientUid", "", "rootHints", "Landroid/os/Bundle;", "onLoadChildren", "parentId", "result", "Landroidx/media/MediaBrowserServiceCompat$Result;", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "onPausePlaying", "onStateChanged", "onStopPlaying", "onTaskRemoved", "rootIntent", "Landroid/content/Intent;", "Companion", "app_debug"})
public final class PodplayMediaService extends androidx.media.MediaBrowserServiceCompat implements com.raywenderlich.podplay.service.PodplayMediaCallback.PodplayMediaListener {
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    @org.jetbrains.annotations.NotNull()
    public static final com.raywenderlich.podplay.service.PodplayMediaService.Companion Companion = null;
    private static final java.lang.String PODPLAY_EMPTY_ROOT_MEDIA_ID = "podplay_empty_root_media_id";
    private static final java.lang.String PLAYER_CHANNEL_ID = "podplay_player_channel";
    private static final int NOTIFICATION_ID = 1;
    
    public PodplayMediaService() {
        super();
    }
    
    @java.lang.Override()
    public void onStateChanged() {
    }
    
    @java.lang.Override()
    public void onStopPlaying() {
    }
    
    @java.lang.Override()
    public void onPausePlaying() {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable()
    android.content.Intent rootIntent) {
    }
    
    @java.lang.Override()
    public void onLoadChildren(@org.jetbrains.annotations.NotNull()
    java.lang.String parentId, @org.jetbrains.annotations.NotNull()
    androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot(@org.jetbrains.annotations.NotNull()
    java.lang.String clientPackageName, int clientUid, @org.jetbrains.annotations.Nullable()
    android.os.Bundle rootHints) {
        return null;
    }
    
    private final void createMediaSession() {
    }
    
    private final kotlin.Pair<androidx.core.app.NotificationCompat.Action, androidx.core.app.NotificationCompat.Action> getPausePlayActions() {
        return null;
    }
    
    private final boolean isPlaying() {
        return false;
    }
    
    private final android.app.PendingIntent getNotificationIntent() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void createNotificationChannel() {
    }
    
    private final android.app.Notification createNotification(android.support.v4.media.MediaDescriptionCompat mediaDescription, android.graphics.Bitmap bitmap) {
        return null;
    }
    
    private final void displayNotification() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/podplay/service/PodplayMediaService$Companion;", "", "()V", "NOTIFICATION_ID", "", "PLAYER_CHANNEL_ID", "", "PODPLAY_EMPTY_ROOT_MEDIA_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}