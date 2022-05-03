package com.raywenderlich.podplay.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J&\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/podplay/service/RssFeedService;", "Lcom/raywenderlich/podplay/service/FeedService;", "()V", "domToRssFeedResponse", "", "node", "Lorg/w3c/dom/Node;", "rssFeedResponse", "Lcom/raywenderlich/podplay/service/RssFeedResponse;", "getFeed", "xmlFileURL", "", "callBack", "Lkotlin/Function1;", "app_debug"})
public final class RssFeedService implements com.raywenderlich.podplay.service.FeedService {
    
    public RssFeedService() {
        super();
    }
    
    @java.lang.Override()
    public void getFeed(@org.jetbrains.annotations.NotNull()
    java.lang.String xmlFileURL, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.podplay.service.RssFeedResponse, kotlin.Unit> callBack) {
    }
    
    private final void domToRssFeedResponse(org.w3c.dom.Node node, com.raywenderlich.podplay.service.RssFeedResponse rssFeedResponse) {
    }
}