package com.raywenderlich.podplay.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002+,B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tH\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u0011H\u0002J\b\u0010)\u001a\u00020\u0011H\u0002J\b\u0010*\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006-"}, d2 = {"Lcom/raywenderlich/podplay/ui/PodcastDetailsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/raywenderlich/podplay/adapter/EpisodeListAdapter$EpisodeListAdapterListener;", "()V", "episodeListAdapter", "Lcom/raywenderlich/podplay/adapter/EpisodeListAdapter;", "listener", "Lcom/raywenderlich/podplay/ui/PodcastDetailsFragment$OnPodcastDetailsListener;", "menuItem", "Landroid/view/MenuItem;", "podcastViewModel", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel;", "getPodcastViewModel", "()Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel;", "podcastViewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "", "item", "onSelectedEpisode", "episodeViewData", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "setupControls", "updateControls", "updateMenuItem", "Companion", "OnPodcastDetailsListener", "app_debug"})
public final class PodcastDetailsFragment extends androidx.fragment.app.Fragment implements com.raywenderlich.podplay.adapter.EpisodeListAdapter.EpisodeListAdapterListener {
    private final kotlin.Lazy podcastViewModel$delegate = null;
    private com.raywenderlich.podplay.adapter.EpisodeListAdapter episodeListAdapter;
    private com.raywenderlich.podplay.ui.PodcastDetailsFragment.OnPodcastDetailsListener listener;
    private android.view.MenuItem menuItem;
    @org.jetbrains.annotations.NotNull()
    public static final com.raywenderlich.podplay.ui.PodcastDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public PodcastDetailsFragment() {
        super();
    }
    
    private final com.raywenderlich.podplay.viewmodel.PodcastViewModel getPodcastViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onSelectedEpisode(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData) {
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
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void setupControls() {
    }
    
    private final void updateControls() {
    }
    
    private final void updateMenuItem() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/podplay/ui/PodcastDetailsFragment$OnPodcastDetailsListener;", "", "onShowEpisodePlayer", "", "episodeViewData", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "onSubscribe", "onUnsubscribe", "app_debug"})
    public static abstract interface OnPodcastDetailsListener {
        
        public abstract void onSubscribe();
        
        public abstract void onUnsubscribe();
        
        public abstract void onShowEpisodePlayer(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/podplay/ui/PodcastDetailsFragment$Companion;", "", "()V", "newInstance", "Lcom/raywenderlich/podplay/ui/PodcastDetailsFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.podplay.ui.PodcastDetailsFragment newInstance() {
            return null;
        }
    }
}