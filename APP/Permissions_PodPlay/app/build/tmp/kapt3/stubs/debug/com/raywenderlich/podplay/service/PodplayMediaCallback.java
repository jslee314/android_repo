package com.raywenderlich.podplay.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 82\u00020\u0001:\u000289B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J&\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\u001c\u0010&\u001a\u00020\u001b2\b\u0010\'\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\b\u0010,\u001a\u00020\u001bH\u0002J\b\u0010-\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J\u0012\u0010/\u001a\u00020\u001b2\b\u0010\'\u001a\u0004\u0018\u00010\u0018H\u0002J!\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u000104H\u0002\u00a2\u0006\u0002\u00105J\b\u00106\u001a\u00020\u001bH\u0002J\b\u00107\u001a\u00020\u001bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/raywenderlich/podplay/service/PodplayMediaCallback;", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "context", "Landroid/content/Context;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "mediaPlayer", "Landroid/media/MediaPlayer;", "(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat;Landroid/media/MediaPlayer;)V", "getContext", "()Landroid/content/Context;", "focusRequest", "Landroid/media/AudioFocusRequest;", "listener", "Lcom/raywenderlich/podplay/service/PodplayMediaCallback$PodplayMediaListener;", "getListener", "()Lcom/raywenderlich/podplay/service/PodplayMediaCallback$PodplayMediaListener;", "setListener", "(Lcom/raywenderlich/podplay/service/PodplayMediaCallback$PodplayMediaListener;)V", "mediaExtras", "Landroid/os/Bundle;", "mediaNeedsPrepare", "", "mediaUri", "Landroid/net/Uri;", "newMedia", "changeSpeed", "", "extras", "ensureAudioFocus", "initializeMediaPlayer", "onCommand", "command", "", "cb", "Landroid/os/ResultReceiver;", "onPause", "onPlay", "onPlayFromUri", "uri", "onSeekTo", "pos", "", "onStop", "pausePlaying", "prepareMedia", "removeAudioFocus", "setNewMedia", "setState", "state", "", "newSpeed", "", "(ILjava/lang/Float;)V", "startPlaying", "stopPlaying", "Companion", "PodplayMediaListener", "app_debug"})
public final class PodplayMediaCallback extends android.support.v4.media.session.MediaSessionCompat.Callback {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final android.support.v4.media.session.MediaSessionCompat mediaSession = null;
    private android.media.MediaPlayer mediaPlayer;
    @org.jetbrains.annotations.Nullable()
    private com.raywenderlich.podplay.service.PodplayMediaCallback.PodplayMediaListener listener;
    private android.net.Uri mediaUri;
    private boolean newMedia = false;
    private android.os.Bundle mediaExtras;
    private android.media.AudioFocusRequest focusRequest;
    private boolean mediaNeedsPrepare = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.raywenderlich.podplay.service.PodplayMediaCallback.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CMD_CHANGESPEED = "change_speed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CMD_EXTRA_SPEED = "speed";
    
    public PodplayMediaCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.support.v4.media.session.MediaSessionCompat mediaSession, @org.jetbrains.annotations.Nullable()
    android.media.MediaPlayer mediaPlayer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.raywenderlich.podplay.service.PodplayMediaCallback.PodplayMediaListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.raywenderlich.podplay.service.PodplayMediaCallback.PodplayMediaListener p0) {
    }
    
    @java.lang.Override()
    public void onCommand(@org.jetbrains.annotations.Nullable()
    java.lang.String command, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras, @org.jetbrains.annotations.Nullable()
    android.os.ResultReceiver cb) {
    }
    
    @java.lang.Override()
    public void onPlayFromUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPlay() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onSeekTo(long pos) {
    }
    
    private final void setNewMedia(android.net.Uri uri) {
    }
    
    private final boolean ensureAudioFocus() {
        return false;
    }
    
    private final void removeAudioFocus() {
    }
    
    private final void initializeMediaPlayer() {
    }
    
    private final void changeSpeed(android.os.Bundle extras) {
    }
    
    private final void setState(int state, java.lang.Float newSpeed) {
    }
    
    private final void prepareMedia() {
    }
    
    private final void startPlaying() {
    }
    
    private final void pausePlaying() {
    }
    
    private final void stopPlaying() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/raywenderlich/podplay/service/PodplayMediaCallback$PodplayMediaListener;", "", "onPausePlaying", "", "onStateChanged", "onStopPlaying", "app_debug"})
    public static abstract interface PodplayMediaListener {
        
        public abstract void onStateChanged();
        
        public abstract void onStopPlaying();
        
        public abstract void onPausePlaying();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/raywenderlich/podplay/service/PodplayMediaCallback$Companion;", "", "()V", "CMD_CHANGESPEED", "", "CMD_EXTRA_SPEED", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}