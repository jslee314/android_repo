package com.raywenderlich.podplay.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J2\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u001a\u0010\n\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/podplay/repository/ItunesRepo;", "", "itunesService", "Lcom/raywenderlich/podplay/service/ItunesService;", "(Lcom/raywenderlich/podplay/service/ItunesService;)V", "searchByTermAndCountry", "", "term", "", "country", "callBack", "Lkotlin/Function1;", "", "Lcom/raywenderlich/podplay/service/PodcastResponse$ItunesPodcast;", "app_debug"})
public final class ItunesRepo {
    private final com.raywenderlich.podplay.service.ItunesService itunesService = null;
    
    public ItunesRepo(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.service.ItunesService itunesService) {
        super();
    }
    
    public final void searchByTermAndCountry(@org.jetbrains.annotations.NotNull()
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.raywenderlich.podplay.service.PodcastResponse.ItunesPodcast>, kotlin.Unit> callBack) {
    }
}