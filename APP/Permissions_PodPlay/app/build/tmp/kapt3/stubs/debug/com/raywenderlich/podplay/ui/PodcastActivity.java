package com.raywenderlich.podplay.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\u0012\u0010%\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0014J+\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u0006012\u0006\u00102\u001a\u000203H\u0016\u00a2\u0006\u0002\u00104J\u0010\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u001aH\u0016J\b\u0010<\u001a\u00020\u001aH\u0016J\u0018\u0010=\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0006H\u0002J\b\u0010?\u001a\u00020\u001aH\u0002J\u0010\u0010@\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010A\u001a\u00020\u001aH\u0002J\b\u0010B\u001a\u00020\u001aH\u0002J\b\u0010C\u001a\u00020\u001aH\u0002J\b\u0010D\u001a\u00020\u001aH\u0002J\u0010\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u0006H\u0002J\b\u0010G\u001a\u00020\u001aH\u0002J\b\u0010H\u001a\u00020\u001aH\u0002J\b\u0010I\u001a\u00020\u001aH\u0002J\b\u0010J\u001a\u00020\u001aH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006L"}, d2 = {"Lcom/raywenderlich/podplay/ui/PodcastActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/raywenderlich/podplay/adapter/PodcastListAdapter$PodcastListAdapterListener;", "Lcom/raywenderlich/podplay/ui/PodcastDetailsFragment$OnPodcastDetailsListener;", "()V", "DEFAULT_COUNTRY", "", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "podcastListAdapter", "Lcom/raywenderlich/podplay/adapter/PodcastListAdapter;", "podcastViewModel", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel;", "getPodcastViewModel", "()Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel;", "podcastViewModel$delegate", "Lkotlin/Lazy;", "searchMenuItem", "Landroid/view/MenuItem;", "searchTerm", "searchViewModel", "Lcom/raywenderlich/podplay/viewmodel/SearchViewModel;", "getSearchViewModel", "()Lcom/raywenderlich/podplay/viewmodel/SearchViewModel;", "searchViewModel$delegate", "addBackStackListener", "", "checkLocationPermissionAndSearch", "term", "createEpisodePlayerFragment", "Lcom/raywenderlich/podplay/ui/EpisodePlayerFragment;", "createPodcastDetailsFragment", "Lcom/raywenderlich/podplay/ui/PodcastDetailsFragment;", "handleIntent", "intent", "Landroid/content/Intent;", "hideProgressBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNewIntent", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onShowDetails", "podcastSummaryViewData", "Lcom/raywenderlich/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "onShowEpisodePlayer", "episodeViewData", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "onSubscribe", "onUnsubscribe", "performSearch", "searchCountry", "scheduleJobs", "searchUsingLocation", "setupPodcastListView", "setupToolbar", "setupViewModels", "showDetailsFragment", "showError", "message", "showPlayerFragment", "showProgressBar", "showSubscribedPodcasts", "updateControls", "Companion", "app_debug"})
public final class PodcastActivity extends androidx.appcompat.app.AppCompatActivity implements com.raywenderlich.podplay.adapter.PodcastListAdapter.PodcastListAdapterListener, com.raywenderlich.podplay.ui.PodcastDetailsFragment.OnPodcastDetailsListener {
    private final kotlin.Lazy searchViewModel$delegate = null;
    private final kotlin.Lazy podcastViewModel$delegate = null;
    private com.raywenderlich.podplay.adapter.PodcastListAdapter podcastListAdapter;
    private android.view.MenuItem searchMenuItem;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private java.lang.String searchTerm = "";
    private final java.lang.String DEFAULT_COUNTRY = "US";
    @org.jetbrains.annotations.NotNull()
    public static final com.raywenderlich.podplay.ui.PodcastActivity.Companion Companion = null;
    private static final java.lang.String TAG_DETAILS_FRAGMENT = "DetailsFragment";
    private static final java.lang.String TAG_EPISODE_UPDATE_JOB = "com.raywenderlich.podplay.episodes";
    private static final java.lang.String TAG_PLAYER_FRAGMENT = "PlayerFragment";
    private java.util.HashMap _$_findViewCache;
    
    public PodcastActivity() {
        super();
    }
    
    private final com.raywenderlich.podplay.viewmodel.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    private final com.raywenderlich.podplay.viewmodel.PodcastViewModel getPodcastViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSubscribe() {
    }
    
    @java.lang.Override()
    public void onUnsubscribe() {
    }
    
    @java.lang.Override()
    public void onShowEpisodePlayer(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData episodeViewData) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onShowDetails(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData podcastSummaryViewData) {
    }
    
    private final void scheduleJobs() {
    }
    
    private final void showSubscribedPodcasts() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void checkLocationPermissionAndSearch(java.lang.String term) {
    }
    
    /**
     * Sets the user's country code based on fused location service
     */
    private final void searchUsingLocation(java.lang.String searchTerm) {
    }
    
    private final void performSearch(java.lang.String searchTerm, java.lang.String searchCountry) {
    }
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    private final void setupToolbar() {
    }
    
    private final void setupViewModels() {
    }
    
    private final void setupPodcastListView() {
    }
    
    private final void addBackStackListener() {
    }
    
    private final void updateControls() {
    }
    
    private final void showDetailsFragment() {
    }
    
    private final void showPlayerFragment() {
    }
    
    private final com.raywenderlich.podplay.ui.EpisodePlayerFragment createEpisodePlayerFragment() {
        return null;
    }
    
    private final com.raywenderlich.podplay.ui.PodcastDetailsFragment createPodcastDetailsFragment() {
        return null;
    }
    
    private final void showProgressBar() {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/podplay/ui/PodcastActivity$Companion;", "", "()V", "TAG_DETAILS_FRAGMENT", "", "TAG_EPISODE_UPDATE_JOB", "TAG_PLAYER_FRAGMENT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}