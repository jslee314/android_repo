package com.raywenderlich.podplay.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/podplay/service/FeedService;", "", "getFeed", "", "xmlFileURL", "", "callBack", "Lkotlin/Function1;", "Lcom/raywenderlich/podplay/service/RssFeedResponse;", "Companion", "app_debug"})
public abstract interface FeedService {
    @org.jetbrains.annotations.NotNull()
    public static final com.raywenderlich.podplay.service.FeedService.Companion Companion = null;
    
    public abstract void getFeed(@org.jetbrains.annotations.NotNull()
    java.lang.String xmlFileURL, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.podplay.service.RssFeedResponse, kotlin.Unit> callBack);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/podplay/service/FeedService$Companion;", "", "()V", "instance", "Lcom/raywenderlich/podplay/service/FeedService;", "getInstance", "()Lcom/raywenderlich/podplay/service/FeedService;", "instance$delegate", "Lkotlin/Lazy;", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final kotlin.Lazy instance$delegate = null;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.podplay.service.FeedService getInstance() {
            return null;
        }
    }
}