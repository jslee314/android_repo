package com.raywenderlich.podplay.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B%\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/raywenderlich/podplay/adapter/PodcastListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/raywenderlich/podplay/adapter/PodcastListAdapter$ViewHolder;", "podcastSummaryViewList", "", "Lcom/raywenderlich/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "podcastListAdapterListener", "Lcom/raywenderlich/podplay/adapter/PodcastListAdapter$PodcastListAdapterListener;", "parentActivity", "Landroid/app/Activity;", "(Ljava/util/List;Lcom/raywenderlich/podplay/adapter/PodcastListAdapter$PodcastListAdapterListener;Landroid/app/Activity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSearchData", "podcastSummaryViewData", "PodcastListAdapterListener", "ViewHolder", "app_debug"})
public final class PodcastListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.raywenderlich.podplay.adapter.PodcastListAdapter.ViewHolder> {
    private java.util.List<com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData> podcastSummaryViewList;
    private final com.raywenderlich.podplay.adapter.PodcastListAdapter.PodcastListAdapterListener podcastListAdapterListener = null;
    private final android.app.Activity parentActivity = null;
    
    public PodcastListAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData> podcastSummaryViewList, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.adapter.PodcastListAdapter.PodcastListAdapterListener podcastListAdapterListener, @org.jetbrains.annotations.NotNull()
    android.app.Activity parentActivity) {
        super();
    }
    
    public final void setSearchData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData> podcastSummaryViewData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.podplay.adapter.PodcastListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.podplay.adapter.PodcastListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/raywenderlich/podplay/adapter/PodcastListAdapter$PodcastListAdapterListener;", "", "onShowDetails", "", "podcastSummaryViewData", "Lcom/raywenderlich/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "app_debug"})
    public static abstract interface PodcastListAdapterListener {
        
        public abstract void onShowDetails(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData podcastSummaryViewData);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/raywenderlich/podplay/adapter/PodcastListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "podcastListAdapterListener", "Lcom/raywenderlich/podplay/adapter/PodcastListAdapter$PodcastListAdapterListener;", "(Lcom/raywenderlich/podplay/adapter/PodcastListAdapter;Landroid/view/View;Lcom/raywenderlich/podplay/adapter/PodcastListAdapter$PodcastListAdapterListener;)V", "lastUpdatedTextView", "Landroid/widget/TextView;", "getLastUpdatedTextView", "()Landroid/widget/TextView;", "nameTextView", "getNameTextView", "podcastImageView", "Landroid/widget/ImageView;", "getPodcastImageView", "()Landroid/widget/ImageView;", "podcastSummaryViewData", "Lcom/raywenderlich/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "getPodcastSummaryViewData", "()Lcom/raywenderlich/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;", "setPodcastSummaryViewData", "(Lcom/raywenderlich/podplay/viewmodel/SearchViewModel$PodcastSummaryViewData;)V", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.raywenderlich.podplay.adapter.PodcastListAdapter.PodcastListAdapterListener podcastListAdapterListener = null;
        @org.jetbrains.annotations.Nullable()
        private com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData podcastSummaryViewData;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView nameTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView lastUpdatedTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView podcastImageView = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        com.raywenderlich.podplay.adapter.PodcastListAdapter.PodcastListAdapterListener podcastListAdapterListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData getPodcastSummaryViewData() {
            return null;
        }
        
        public final void setPodcastSummaryViewData(@org.jetbrains.annotations.Nullable()
        com.raywenderlich.podplay.viewmodel.SearchViewModel.PodcastSummaryViewData p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNameTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getLastUpdatedTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getPodcastImageView() {
            return null;
        }
    }
}