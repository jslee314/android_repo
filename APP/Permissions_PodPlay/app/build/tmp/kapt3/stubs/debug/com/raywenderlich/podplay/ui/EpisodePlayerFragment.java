package com.raywenderlich.podplay.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 E2\u00020\u0001:\u0003EFGB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J \u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010\'\u001a\u00020\u001cH\u0002J\u0012\u0010(\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00102\u001a\u00020\u001cH\u0016J\b\u00103\u001a\u00020\u001cH\u0016J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u001eH\u0002J\b\u00109\u001a\u00020\u001cH\u0002J\b\u0010:\u001a\u00020\u001cH\u0002J\b\u0010;\u001a\u00020\u001cH\u0002J\u0010\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020\u001cH\u0002J\b\u0010@\u001a\u00020\u001cH\u0002J\b\u0010A\u001a\u00020\u001cH\u0002J\u0010\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020DH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "draggingScrubber", "", "episodeDuration", "", "isVideo", "mediaBrowser", "Landroid/support/v4/media/MediaBrowserCompat;", "mediaControllerCallback", "Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment$MediaControllerCallback;", "mediaPlayer", "Landroid/media/MediaPlayer;", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "playOnPrepare", "playerSpeed", "", "podcastViewModel", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel;", "getPodcastViewModel", "()Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel;", "podcastViewModel$delegate", "Lkotlin/Lazy;", "progressAnimator", "Landroid/animation/ValueAnimator;", "animateScrubber", "", "progress", "", "speed", "changeSpeed", "handleStateChange", "state", "position", "initMediaBrowser", "initMediaPlayer", "initMediaSession", "initVideoPlayer", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onStop", "registerMediaController", "token", "Landroid/support/v4/media/session/MediaSessionCompat$Token;", "seekBy", "seconds", "setSurfaceSize", "setupControls", "setupVideoUI", "startPlaying", "episodeViewData", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "togglePlayPause", "updateControls", "updateControlsFromController", "updateControlsFromMetadata", "metadata", "Landroid/support/v4/media/MediaMetadataCompat;", "Companion", "MediaBrowserCallBacks", "MediaControllerCallback", "app_debug"})
public final class EpisodePlayerFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy podcastViewModel$delegate = null;
    private android.support.v4.media.MediaBrowserCompat mediaBrowser;
    private com.raywenderlich.podplay.ui.EpisodePlayerFragment.MediaControllerCallback mediaControllerCallback;
    private float playerSpeed = 1.0F;
    private long episodeDuration = 0L;
    private boolean draggingScrubber = false;
    private android.animation.ValueAnimator progressAnimator;
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    private android.media.MediaPlayer mediaPlayer;
    private boolean isVideo = false;
    private boolean playOnPrepare = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.raywenderlich.podplay.ui.EpisodePlayerFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public EpisodePlayerFragment() {
        super();
    }
    
    private final com.raywenderlich.podplay.viewmodel.PodcastViewModel getPodcastViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void setupControls() {
    }
    
    private final void setupVideoUI() {
    }
    
    private final void updateControlsFromController() {
    }
    
    private final void initVideoPlayer() {
    }
    
    private final void initMediaPlayer() {
    }
    
    private final void initMediaSession() {
    }
    
    private final void setSurfaceSize() {
    }
    
    private final void animateScrubber(int progress, float speed) {
    }
    
    private final void updateControlsFromMetadata(android.support.v4.media.MediaMetadataCompat metadata) {
    }
    
    private final void changeSpeed() {
    }
    
    private final void seekBy(int seconds) {
    }
    
    private final void handleStateChange(int state, long position, float speed) {
    }
    
    private final void updateControls() {
    }
    
    private final void startPlaying(com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData) {
    }
    
    private final void togglePlayPause() {
    }
    
    private final void registerMediaController(android.support.v4.media.session.MediaSessionCompat.Token token) {
    }
    
    private final void initMediaBrowser() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment$MediaBrowserCallBacks;", "Landroid/support/v4/media/MediaBrowserCompat$ConnectionCallback;", "(Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment;)V", "onConnected", "", "onConnectionFailed", "onConnectionSuspended", "app_debug"})
    public final class MediaBrowserCallBacks extends android.support.v4.media.MediaBrowserCompat.ConnectionCallback {
        
        public MediaBrowserCallBacks() {
            super();
        }
        
        @java.lang.Override()
        public void onConnected() {
        }
        
        @java.lang.Override()
        public void onConnectionSuspended() {
        }
        
        @java.lang.Override()
        public void onConnectionFailed() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment$MediaControllerCallback;", "Landroid/support/v4/media/session/MediaControllerCompat$Callback;", "(Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment;)V", "onMetadataChanged", "", "metadata", "Landroid/support/v4/media/MediaMetadataCompat;", "onPlaybackStateChanged", "state", "Landroid/support/v4/media/session/PlaybackStateCompat;", "app_debug"})
    public final class MediaControllerCallback extends android.support.v4.media.session.MediaControllerCompat.Callback {
        
        public MediaControllerCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onMetadataChanged(@org.jetbrains.annotations.Nullable()
        android.support.v4.media.MediaMetadataCompat metadata) {
        }
        
        @java.lang.Override()
        public void onPlaybackStateChanged(@org.jetbrains.annotations.Nullable()
        android.support.v4.media.session.PlaybackStateCompat state) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment$Companion;", "", "()V", "newInstance", "Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.podplay.ui.EpisodePlayerFragment newInstance() {
            return null;
        }
    }
}