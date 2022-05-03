package com.raywenderlich.podplay.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fJ*\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\n2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\b0\u0011H\u0002J$\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0011J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\rH\u0002J\"\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0002J \u0010#\u001a\u00020\b2\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r\u0012\u0004\u0012\u00020\b0\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/raywenderlich/podplay/repository/PodcastRepo;", "", "feedService", "Lcom/raywenderlich/podplay/service/FeedService;", "podcastDao", "Lcom/raywenderlich/podplay/db/PodcastDao;", "(Lcom/raywenderlich/podplay/service/FeedService;Lcom/raywenderlich/podplay/db/PodcastDao;)V", "delete", "", "podcast", "Lcom/raywenderlich/podplay/model/Podcast;", "getAll", "Landroidx/lifecycle/LiveData;", "", "getNewEpisodes", "localPodcast", "callBack", "Lkotlin/Function1;", "Lcom/raywenderlich/podplay/model/Episode;", "getPodcast", "feedUrl", "", "callback", "rssItemsToEpisodes", "episodeResponses", "Lcom/raywenderlich/podplay/service/RssFeedResponse$EpisodeResponse;", "rssResponseToPodcast", "imageUrl", "rssResponse", "Lcom/raywenderlich/podplay/service/RssFeedResponse;", "save", "saveNewEpisodes", "podcastId", "", "episodes", "updatePodcastEpisodes", "Lcom/raywenderlich/podplay/repository/PodcastRepo$PodcastUpdateInfo;", "PodcastUpdateInfo", "app_debug"})
public final class PodcastRepo {
    private com.raywenderlich.podplay.service.FeedService feedService;
    private com.raywenderlich.podplay.db.PodcastDao podcastDao;
    
    public PodcastRepo(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.service.FeedService feedService, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.db.PodcastDao podcastDao) {
        super();
    }
    
    public final void getPodcast(@org.jetbrains.annotations.NotNull()
    java.lang.String feedUrl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.podplay.model.Podcast, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.podplay.model.Podcast>> getAll() {
        return null;
    }
    
    public final void updatePodcastEpisodes(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.raywenderlich.podplay.repository.PodcastRepo.PodcastUpdateInfo>, kotlin.Unit> callback) {
    }
    
    private final void getNewEpisodes(com.raywenderlich.podplay.model.Podcast localPodcast, kotlin.jvm.functions.Function1<? super java.util.List<com.raywenderlich.podplay.model.Episode>, kotlin.Unit> callBack) {
    }
    
    private final void saveNewEpisodes(long podcastId, java.util.List<com.raywenderlich.podplay.model.Episode> episodes) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.model.Podcast podcast) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.model.Podcast podcast) {
    }
    
    private final com.raywenderlich.podplay.model.Podcast rssResponseToPodcast(java.lang.String feedUrl, java.lang.String imageUrl, com.raywenderlich.podplay.service.RssFeedResponse rssResponse) {
        return null;
    }
    
    private final java.util.List<com.raywenderlich.podplay.model.Episode> rssItemsToEpisodes(java.util.List<com.raywenderlich.podplay.service.RssFeedResponse.EpisodeResponse> episodeResponses) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/podplay/repository/PodcastRepo$PodcastUpdateInfo;", "", "feedUrl", "", "name", "newCount", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getFeedUrl", "()Ljava/lang/String;", "getName", "getNewCount", "()I", "app_debug"})
    public static final class PodcastUpdateInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String feedUrl = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        private final int newCount = 0;
        
        public PodcastUpdateInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String feedUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String name, int newCount) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeedUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public final int getNewCount() {
            return 0;
        }
    }
}