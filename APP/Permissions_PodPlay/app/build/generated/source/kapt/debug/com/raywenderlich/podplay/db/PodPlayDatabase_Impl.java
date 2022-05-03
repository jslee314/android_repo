package com.raywenderlich.podplay.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PodPlayDatabase_Impl extends PodPlayDatabase {
  private volatile PodcastDao _podcastDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Podcast` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `feedUrl` TEXT NOT NULL, `feedTitle` TEXT NOT NULL, `feedDesc` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Episode` (`guid` TEXT NOT NULL, `podcastId` INTEGER, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `mediaUrl` TEXT NOT NULL, `mimeType` TEXT NOT NULL, `releaseDate` INTEGER NOT NULL, `duration` TEXT NOT NULL, PRIMARY KEY(`guid`), FOREIGN KEY(`podcastId`) REFERENCES `Podcast`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_Episode_podcastId` ON `Episode` (`podcastId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '02289daa2be2798f9ab838570c81bca5')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Podcast`");
        _db.execSQL("DROP TABLE IF EXISTS `Episode`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPodcast = new HashMap<String, TableInfo.Column>(6);
        _columnsPodcast.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPodcast.put("feedUrl", new TableInfo.Column("feedUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPodcast.put("feedTitle", new TableInfo.Column("feedTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPodcast.put("feedDesc", new TableInfo.Column("feedDesc", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPodcast.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPodcast.put("lastUpdated", new TableInfo.Column("lastUpdated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPodcast = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPodcast = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPodcast = new TableInfo("Podcast", _columnsPodcast, _foreignKeysPodcast, _indicesPodcast);
        final TableInfo _existingPodcast = TableInfo.read(_db, "Podcast");
        if (! _infoPodcast.equals(_existingPodcast)) {
          return new RoomOpenHelper.ValidationResult(false, "Podcast(com.raywenderlich.podplay.model.Podcast).\n"
                  + " Expected:\n" + _infoPodcast + "\n"
                  + " Found:\n" + _existingPodcast);
        }
        final HashMap<String, TableInfo.Column> _columnsEpisode = new HashMap<String, TableInfo.Column>(8);
        _columnsEpisode.put("guid", new TableInfo.Column("guid", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisode.put("podcastId", new TableInfo.Column("podcastId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisode.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisode.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisode.put("mediaUrl", new TableInfo.Column("mediaUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisode.put("mimeType", new TableInfo.Column("mimeType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisode.put("releaseDate", new TableInfo.Column("releaseDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEpisode.put("duration", new TableInfo.Column("duration", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEpisode = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysEpisode.add(new TableInfo.ForeignKey("Podcast", "CASCADE", "NO ACTION",Arrays.asList("podcastId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesEpisode = new HashSet<TableInfo.Index>(1);
        _indicesEpisode.add(new TableInfo.Index("index_Episode_podcastId", false, Arrays.asList("podcastId"), Arrays.asList("ASC")));
        final TableInfo _infoEpisode = new TableInfo("Episode", _columnsEpisode, _foreignKeysEpisode, _indicesEpisode);
        final TableInfo _existingEpisode = TableInfo.read(_db, "Episode");
        if (! _infoEpisode.equals(_existingEpisode)) {
          return new RoomOpenHelper.ValidationResult(false, "Episode(com.raywenderlich.podplay.model.Episode).\n"
                  + " Expected:\n" + _infoEpisode + "\n"
                  + " Found:\n" + _existingEpisode);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "02289daa2be2798f9ab838570c81bca5", "82072405b6999342b9d224307f0dfc33");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Podcast","Episode");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `Podcast`");
      _db.execSQL("DELETE FROM `Episode`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PodcastDao.class, PodcastDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public PodcastDao podcastDao() {
    if (_podcastDao != null) {
      return _podcastDao;
    } else {
      synchronized(this) {
        if(_podcastDao == null) {
          _podcastDao = new PodcastDao_Impl(this);
        }
        return _podcastDao;
      }
    }
  }
}
