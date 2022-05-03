package com.raywenderlich.podplay.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.raywenderlich.podplay.db.Converters.class})
@androidx.room.Database(entities = {com.raywenderlich.podplay.model.Podcast.class, com.raywenderlich.podplay.model.Episode.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/raywenderlich/podplay/db/PodPlayDatabase;", "Landroidx/room/RoomDatabase;", "()V", "podcastDao", "Lcom/raywenderlich/podplay/db/PodcastDao;", "Companion", "app_debug"})
public abstract class PodPlayDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.raywenderlich.podplay.db.PodPlayDatabase.Companion Companion = null;
    private static com.raywenderlich.podplay.db.PodPlayDatabase instance;
    
    public PodPlayDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.raywenderlich.podplay.db.PodcastDao podcastDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/podplay/db/PodPlayDatabase$Companion;", "", "()V", "instance", "Lcom/raywenderlich/podplay/db/PodPlayDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.podplay.db.PodPlayDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}