package com.raywenderlich.podplay.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.raywenderlich.podplay.model.Episode;
import com.raywenderlich.podplay.model.Podcast;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PodcastDao_Impl implements PodcastDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Podcast> __insertionAdapterOfPodcast;

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter<Episode> __insertionAdapterOfEpisode;

  private final EntityDeletionOrUpdateAdapter<Podcast> __deletionAdapterOfPodcast;

  public PodcastDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPodcast = new EntityInsertionAdapter<Podcast>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Podcast` (`id`,`feedUrl`,`feedTitle`,`feedDesc`,`imageUrl`,`lastUpdated`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Podcast value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getFeedUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFeedUrl());
        }
        if (value.getFeedTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFeedTitle());
        }
        if (value.getFeedDesc() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFeedDesc());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImageUrl());
        }
        final Long _tmp = __converters.toTimestamp(value.getLastUpdated());
        if (_tmp == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, _tmp);
        }
      }
    };
    this.__insertionAdapterOfEpisode = new EntityInsertionAdapter<Episode>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Episode` (`guid`,`podcastId`,`title`,`description`,`mediaUrl`,`mimeType`,`releaseDate`,`duration`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Episode value) {
        if (value.getGuid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getGuid());
        }
        if (value.getPodcastId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getPodcastId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getMediaUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMediaUrl());
        }
        if (value.getMimeType() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMimeType());
        }
        final Long _tmp = __converters.toTimestamp(value.getReleaseDate());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getDuration() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDuration());
        }
      }
    };
    this.__deletionAdapterOfPodcast = new EntityDeletionOrUpdateAdapter<Podcast>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Podcast` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Podcast value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public long insertPodcast(final Podcast podcast) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfPodcast.insertAndReturnId(podcast);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insertEpisode(final Episode episode) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfEpisode.insertAndReturnId(episode);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletePodcast(final Podcast podcast) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPodcast.handle(podcast);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Podcast>> loadPodcasts() {
    final String _sql = "SELECT * FROM Podcast ORDER BY FeedTitle";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Podcast"}, false, new Callable<List<Podcast>>() {
      @Override
      public List<Podcast> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFeedUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "feedUrl");
          final int _cursorIndexOfFeedTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "feedTitle");
          final int _cursorIndexOfFeedDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "feedDesc");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
          final List<Podcast> _result = new ArrayList<Podcast>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Podcast _item;
            _item = new Podcast();
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final String _tmpFeedUrl;
            if (_cursor.isNull(_cursorIndexOfFeedUrl)) {
              _tmpFeedUrl = null;
            } else {
              _tmpFeedUrl = _cursor.getString(_cursorIndexOfFeedUrl);
            }
            _item.setFeedUrl(_tmpFeedUrl);
            final String _tmpFeedTitle;
            if (_cursor.isNull(_cursorIndexOfFeedTitle)) {
              _tmpFeedTitle = null;
            } else {
              _tmpFeedTitle = _cursor.getString(_cursorIndexOfFeedTitle);
            }
            _item.setFeedTitle(_tmpFeedTitle);
            final String _tmpFeedDesc;
            if (_cursor.isNull(_cursorIndexOfFeedDesc)) {
              _tmpFeedDesc = null;
            } else {
              _tmpFeedDesc = _cursor.getString(_cursorIndexOfFeedDesc);
            }
            _item.setFeedDesc(_tmpFeedDesc);
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            _item.setImageUrl(_tmpImageUrl);
            final Date _tmpLastUpdated;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfLastUpdated);
            }
            _tmpLastUpdated = __converters.fromTimestamp(_tmp);
            _item.setLastUpdated(_tmpLastUpdated);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<Podcast> loadPodcastsStatic() {
    final String _sql = "SELECT * FROM Podcast ORDER BY FeedTitle";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFeedUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "feedUrl");
      final int _cursorIndexOfFeedTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "feedTitle");
      final int _cursorIndexOfFeedDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "feedDesc");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final List<Podcast> _result = new ArrayList<Podcast>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Podcast _item;
        _item = new Podcast();
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpFeedUrl;
        if (_cursor.isNull(_cursorIndexOfFeedUrl)) {
          _tmpFeedUrl = null;
        } else {
          _tmpFeedUrl = _cursor.getString(_cursorIndexOfFeedUrl);
        }
        _item.setFeedUrl(_tmpFeedUrl);
        final String _tmpFeedTitle;
        if (_cursor.isNull(_cursorIndexOfFeedTitle)) {
          _tmpFeedTitle = null;
        } else {
          _tmpFeedTitle = _cursor.getString(_cursorIndexOfFeedTitle);
        }
        _item.setFeedTitle(_tmpFeedTitle);
        final String _tmpFeedDesc;
        if (_cursor.isNull(_cursorIndexOfFeedDesc)) {
          _tmpFeedDesc = null;
        } else {
          _tmpFeedDesc = _cursor.getString(_cursorIndexOfFeedDesc);
        }
        _item.setFeedDesc(_tmpFeedDesc);
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        _item.setImageUrl(_tmpImageUrl);
        final Date _tmpLastUpdated;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfLastUpdated);
        }
        _tmpLastUpdated = __converters.fromTimestamp(_tmp);
        _item.setLastUpdated(_tmpLastUpdated);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Episode> loadEpisodes(final long podcastId) {
    final String _sql = "SELECT * FROM Episode WHERE podcastId = ? ORDER BY releaseDate DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, podcastId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfGuid = CursorUtil.getColumnIndexOrThrow(_cursor, "guid");
      final int _cursorIndexOfPodcastId = CursorUtil.getColumnIndexOrThrow(_cursor, "podcastId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfMediaUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "mediaUrl");
      final int _cursorIndexOfMimeType = CursorUtil.getColumnIndexOrThrow(_cursor, "mimeType");
      final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "releaseDate");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final List<Episode> _result = new ArrayList<Episode>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Episode _item;
        final String _tmpGuid;
        if (_cursor.isNull(_cursorIndexOfGuid)) {
          _tmpGuid = null;
        } else {
          _tmpGuid = _cursor.getString(_cursorIndexOfGuid);
        }
        final Long _tmpPodcastId;
        if (_cursor.isNull(_cursorIndexOfPodcastId)) {
          _tmpPodcastId = null;
        } else {
          _tmpPodcastId = _cursor.getLong(_cursorIndexOfPodcastId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpMediaUrl;
        if (_cursor.isNull(_cursorIndexOfMediaUrl)) {
          _tmpMediaUrl = null;
        } else {
          _tmpMediaUrl = _cursor.getString(_cursorIndexOfMediaUrl);
        }
        final String _tmpMimeType;
        if (_cursor.isNull(_cursorIndexOfMimeType)) {
          _tmpMimeType = null;
        } else {
          _tmpMimeType = _cursor.getString(_cursorIndexOfMimeType);
        }
        final Date _tmpReleaseDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfReleaseDate);
        }
        _tmpReleaseDate = __converters.fromTimestamp(_tmp);
        final String _tmpDuration;
        if (_cursor.isNull(_cursorIndexOfDuration)) {
          _tmpDuration = null;
        } else {
          _tmpDuration = _cursor.getString(_cursorIndexOfDuration);
        }
        _item = new Episode(_tmpGuid,_tmpPodcastId,_tmpTitle,_tmpDescription,_tmpMediaUrl,_tmpMimeType,_tmpReleaseDate,_tmpDuration);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Podcast loadPodcast(final String url) {
    final String _sql = "SELECT * FROM Podcast WHERE feedUrl = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFeedUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "feedUrl");
      final int _cursorIndexOfFeedTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "feedTitle");
      final int _cursorIndexOfFeedDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "feedDesc");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfLastUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUpdated");
      final Podcast _result;
      if(_cursor.moveToFirst()) {
        _result = new Podcast();
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final String _tmpFeedUrl;
        if (_cursor.isNull(_cursorIndexOfFeedUrl)) {
          _tmpFeedUrl = null;
        } else {
          _tmpFeedUrl = _cursor.getString(_cursorIndexOfFeedUrl);
        }
        _result.setFeedUrl(_tmpFeedUrl);
        final String _tmpFeedTitle;
        if (_cursor.isNull(_cursorIndexOfFeedTitle)) {
          _tmpFeedTitle = null;
        } else {
          _tmpFeedTitle = _cursor.getString(_cursorIndexOfFeedTitle);
        }
        _result.setFeedTitle(_tmpFeedTitle);
        final String _tmpFeedDesc;
        if (_cursor.isNull(_cursorIndexOfFeedDesc)) {
          _tmpFeedDesc = null;
        } else {
          _tmpFeedDesc = _cursor.getString(_cursorIndexOfFeedDesc);
        }
        _result.setFeedDesc(_tmpFeedDesc);
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        _result.setImageUrl(_tmpImageUrl);
        final Date _tmpLastUpdated;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfLastUpdated)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfLastUpdated);
        }
        _tmpLastUpdated = __converters.fromTimestamp(_tmp);
        _result.setLastUpdated(_tmpLastUpdated);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
