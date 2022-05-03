package com.raywenderlich.podplay.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002./B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001d\u001a\u00020\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0015H\u0002J$\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00162\u0014\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001e0%J\u0014\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\fH\u0002J\u0006\u0010*\u001a\u00020\u001eJ$\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u0014\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u001e0%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u00060"}, d2 = {"Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "activeEpisodeViewData", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "getActiveEpisodeViewData", "()Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "setActiveEpisodeViewData", "(Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;)V", "activePodcast", "Lcom/raywenderlich/podplay/model/Podcast;", "activePodcastViewData", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$PodcastViewData;", "getActivePodcastViewData", "()Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$PodcastViewData;", "setActivePodcastViewData", "(Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$PodcastViewData;)V", "livePodcastData", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "podcastRepo", "Lcom/raywenderlich/podplay/repository/PodcastRepo;", "getPodcastRepo", "()Lcom/raywenderlich/podplay/repository/PodcastRepo;", "setPodcastRepo", "(Lcom/raywenderlich/podplay/repository/PodcastRepo;)V", "deleteActivePodcast", "", "episodesToEpisodesView", "episodes", "Lcom/raywenderlich/podplay/model/Episode;", "getPodcast", "podcastSummaryViewData", "callback", "Lkotlin/Function1;", "getPodcasts", "podcastToPodcastView", "podcast", "podcastToSummaryView", "saveActivePodcast", "setActivePodcast", "feedUrl", "", "EpisodeViewData", "PodcastViewData", "app_debug"})
public final class PodcastViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.raywenderlich.podplay.repository.PodcastRepo podcastRepo;
    @org.jetbrains.annotations.Nullable()
    private com.raywenderlich.podplay.viewmodel.PodcastViewModel.PodcastViewData activePodcastViewData;
    @org.jetbrains.annotations.Nullable()
    private com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData activeEpisodeViewData;
    private androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData>> livePodcastData;
    private com.raywenderlich.podplay.model.Podcast activePodcast;
    
    public PodcastViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.raywenderlich.podplay.repository.PodcastRepo getPodcastRepo() {
        return null;
    }
    
    public final void setPodcastRepo(@org.jetbrains.annotations.Nullable()
    com.raywenderlich.podplay.repository.PodcastRepo p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.raywenderlich.podplay.viewmodel.PodcastViewModel.PodcastViewData getActivePodcastViewData() {
        return null;
    }
    
    public final void setActivePodcastViewData(@org.jetbrains.annotations.Nullable()
    com.raywenderlich.podplay.viewmodel.PodcastViewModel.PodcastViewData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData getActiveEpisodeViewData() {
        return null;
    }
    
    public final void setActiveEpisodeViewData(@org.jetbrains.annotations.Nullable()
    com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData p0) {
    }
    
    public final void setActivePodcast(@org.jetbrains.annotations.NotNull()
    java.lang.String feedUrl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData, kotlin.Unit> callback) {
    }
    
    public final void getPodcast(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData podcastSummaryViewData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.podplay.viewmodel.PodcastViewModel.PodcastViewData, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData>> getPodcasts() {
        return null;
    }
    
    public final void saveActivePodcast() {
    }
    
    public final void deleteActivePodcast() {
    }
    
    private final com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData podcastToSummaryView(com.raywenderlich.podplay.model.Podcast podcast) {
        return null;
    }
    
    private final com.raywenderlich.podplay.viewmodel.PodcastViewModel.PodcastViewData podcastToPodcastView(com.raywenderlich.podplay.model.Podcast podcast) {
        return null;
    }
    
    private final java.util.List<com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData> episodesToEpisodesView(java.util.List<com.raywenderlich.podplay.model.Episode> episodes) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003JS\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\u0005H\u00d6\u0001R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006+"}, d2 = {"Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$PodcastViewData;", "", "subscribed", "", "feedTitle", "", "feedUrl", "feedDesc", "imageUrl", "episodes", "", "Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEpisodes", "()Ljava/util/List;", "setEpisodes", "(Ljava/util/List;)V", "getFeedDesc", "()Ljava/lang/String;", "setFeedDesc", "(Ljava/lang/String;)V", "getFeedTitle", "setFeedTitle", "getFeedUrl", "setFeedUrl", "getImageUrl", "setImageUrl", "getSubscribed", "()Z", "setSubscribed", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class PodcastViewData {
        private boolean subscribed;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String feedTitle;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String feedUrl;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String feedDesc;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String imageUrl;
        @org.jetbrains.annotations.NotNull()
        private java.util.List<com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData> episodes;
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.podplay.viewmodel.PodcastViewModel.PodcastViewData copy(boolean subscribed, @org.jetbrains.annotations.Nullable()
        java.lang.String feedTitle, @org.jetbrains.annotations.Nullable()
        java.lang.String feedUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String feedDesc, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
        java.util.List<com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData> episodes) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PodcastViewData(boolean subscribed, @org.jetbrains.annotations.Nullable()
        java.lang.String feedTitle, @org.jetbrains.annotations.Nullable()
        java.lang.String feedUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String feedDesc, @org.jetbrains.annotations.Nullable()
        java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
        java.util.List<com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData> episodes) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getSubscribed() {
            return false;
        }
        
        public final void setSubscribed(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFeedTitle() {
            return null;
        }
        
        public final void setFeedTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFeedUrl() {
            return null;
        }
        
        public final void setFeedUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFeedDesc() {
            return null;
        }
        
        public final void setFeedDesc(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImageUrl() {
            return null;
        }
        
        public final void setImageUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData> getEpisodes() {
            return null;
        }
        
        public final void setEpisodes(@org.jetbrains.annotations.NotNull()
        java.util.List<com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData> p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000bH\u00c6\u0003J[\u0010\'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010\u00a8\u0006-"}, d2 = {"Lcom/raywenderlich/podplay/viewmodel/PodcastViewModel$EpisodeViewData;", "", "guid", "", "title", "description", "mediaUrl", "releaseDate", "Ljava/util/Date;", "duration", "isVideo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getDuration", "setDuration", "getGuid", "setGuid", "()Z", "setVideo", "(Z)V", "getMediaUrl", "setMediaUrl", "getReleaseDate", "()Ljava/util/Date;", "setReleaseDate", "(Ljava/util/Date;)V", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
    public static final class EpisodeViewData {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String guid;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String title;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String description;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String mediaUrl;
        @org.jetbrains.annotations.Nullable()
        private java.util.Date releaseDate;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String duration;
        private boolean isVideo;
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.podplay.viewmodel.PodcastViewModel.EpisodeViewData copy(@org.jetbrains.annotations.Nullable()
        java.lang.String guid, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String mediaUrl, @org.jetbrains.annotations.Nullable()
        java.util.Date releaseDate, @org.jetbrains.annotations.Nullable()
        java.lang.String duration, boolean isVideo) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public EpisodeViewData() {
            super();
        }
        
        public EpisodeViewData(@org.jetbrains.annotations.Nullable()
        java.lang.String guid, @org.jetbrains.annotations.Nullable()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String mediaUrl, @org.jetbrains.annotations.Nullable()
        java.util.Date releaseDate, @org.jetbrains.annotations.Nullable()
        java.lang.String duration, boolean isVideo) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGuid() {
            return null;
        }
        
        public final void setGuid(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMediaUrl() {
            return null;
        }
        
        public final void setMediaUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date getReleaseDate() {
            return null;
        }
        
        public final void setReleaseDate(@org.jetbrains.annotations.Nullable()
        java.util.Date p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDuration() {
            return null;
        }
        
        public final void setDuration(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final boolean isVideo() {
            return false;
        }
        
        public final void setVideo(boolean p0) {
        }
    }
}