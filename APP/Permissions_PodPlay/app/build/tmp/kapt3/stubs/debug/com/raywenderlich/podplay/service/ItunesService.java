package com.raywenderlich.podplay.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/podplay/service/ItunesService;", "", "searchPodcastByTermAndCountry", "Lretrofit2/Call;", "Lcom/raywenderlich/podplay/service/PodcastResponse;", "term", "", "country", "Companion", "app_debug"})
public abstract interface ItunesService {
    @org.jetbrains.annotations.NotNull()
    public static final com.raywenderlich.podplay.service.ItunesService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/search?media=podcast")
    public abstract retrofit2.Call<com.raywenderlich.podplay.service.PodcastResponse> searchPodcastByTermAndCountry(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "term")
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "country")
    java.lang.String country);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/podplay/service/ItunesService$Companion;", "", "()V", "instance", "Lcom/raywenderlich/podplay/service/ItunesService;", "getInstance", "()Lcom/raywenderlich/podplay/service/ItunesService;", "instance$delegate", "Lkotlin/Lazy;", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final kotlin.Lazy instance$delegate = null;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.podplay.service.ItunesService getInstance() {
            return null;
        }
    }
}