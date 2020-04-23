package com.google.samples.apps.sunflower.data;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GardenPlantingDao_Impl implements GardenPlantingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfGardenPlanting;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfGardenPlanting;

  public GardenPlantingDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGardenPlanting = new EntityInsertionAdapter<GardenPlanting>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `garden_plantings`(`id`,`plant_id`,`plant_date`,`last_watering_date`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GardenPlanting value) {
        stmt.bindLong(1, value.getGardenPlantingId());
        if (value.getPlantId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPlantId());
        }
        final long _tmp;
        _tmp = __converters.calendarToDatestamp(value.getPlantDate());
        stmt.bindLong(3, _tmp);
        final long _tmp_1;
        _tmp_1 = __converters.calendarToDatestamp(value.getLastWateringDate());
        stmt.bindLong(4, _tmp_1);
      }
    };
    this.__deletionAdapterOfGardenPlanting = new EntityDeletionOrUpdateAdapter<GardenPlanting>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `garden_plantings` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GardenPlanting value) {
        stmt.bindLong(1, value.getGardenPlantingId());
      }
    };
  }

  @Override
  public long insertGardenPlanting(final GardenPlanting gardenPlanting) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfGardenPlanting.insertAndReturnId(gardenPlanting);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteGardenPlanting(final GardenPlanting gardenPlanting) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfGardenPlanting.handle(gardenPlanting);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<GardenPlanting>> getGardenPlantings() {
    final String _sql = "SELECT * FROM garden_plantings";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"garden_plantings"}, false, new Callable<List<GardenPlanting>>() {
      @Override
      public List<GardenPlanting> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfGardenPlantingId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPlantId = CursorUtil.getColumnIndexOrThrow(_cursor, "plant_id");
          final int _cursorIndexOfPlantDate = CursorUtil.getColumnIndexOrThrow(_cursor, "plant_date");
          final int _cursorIndexOfLastWateringDate = CursorUtil.getColumnIndexOrThrow(_cursor, "last_watering_date");
          final List<GardenPlanting> _result = new ArrayList<GardenPlanting>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GardenPlanting _item;
            final String _tmpPlantId;
            _tmpPlantId = _cursor.getString(_cursorIndexOfPlantId);
            final Calendar _tmpPlantDate;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfPlantDate);
            _tmpPlantDate = __converters.datestampToCalendar(_tmp);
            final Calendar _tmpLastWateringDate;
            final long _tmp_1;
            _tmp_1 = _cursor.getLong(_cursorIndexOfLastWateringDate);
            _tmpLastWateringDate = __converters.datestampToCalendar(_tmp_1);
            _item = new GardenPlanting(_tmpPlantId,_tmpPlantDate,_tmpLastWateringDate);
            final long _tmpGardenPlantingId;
            _tmpGardenPlantingId = _cursor.getLong(_cursorIndexOfGardenPlantingId);
            _item.setGardenPlantingId(_tmpGardenPlantingId);
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
  public LiveData<GardenPlanting> getGardenPlanting(final long gardenPlantingId) {
    final String _sql = "SELECT * FROM garden_plantings WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, gardenPlantingId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"garden_plantings"}, false, new Callable<GardenPlanting>() {
      @Override
      public GardenPlanting call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfGardenPlantingId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPlantId = CursorUtil.getColumnIndexOrThrow(_cursor, "plant_id");
          final int _cursorIndexOfPlantDate = CursorUtil.getColumnIndexOrThrow(_cursor, "plant_date");
          final int _cursorIndexOfLastWateringDate = CursorUtil.getColumnIndexOrThrow(_cursor, "last_watering_date");
          final GardenPlanting _result;
          if(_cursor.moveToFirst()) {
            final String _tmpPlantId;
            _tmpPlantId = _cursor.getString(_cursorIndexOfPlantId);
            final Calendar _tmpPlantDate;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfPlantDate);
            _tmpPlantDate = __converters.datestampToCalendar(_tmp);
            final Calendar _tmpLastWateringDate;
            final long _tmp_1;
            _tmp_1 = _cursor.getLong(_cursorIndexOfLastWateringDate);
            _tmpLastWateringDate = __converters.datestampToCalendar(_tmp_1);
            _result = new GardenPlanting(_tmpPlantId,_tmpPlantDate,_tmpLastWateringDate);
            final long _tmpGardenPlantingId;
            _tmpGardenPlantingId = _cursor.getLong(_cursorIndexOfGardenPlantingId);
            _result.setGardenPlantingId(_tmpGardenPlantingId);
          } else {
            _result = null;
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
  public LiveData<GardenPlanting> getGardenPlantingForPlant(final String plantId) {
    final String _sql = "SELECT * FROM garden_plantings WHERE plant_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (plantId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, plantId);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"garden_plantings"}, false, new Callable<GardenPlanting>() {
      @Override
      public GardenPlanting call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfGardenPlantingId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfPlantId = CursorUtil.getColumnIndexOrThrow(_cursor, "plant_id");
          final int _cursorIndexOfPlantDate = CursorUtil.getColumnIndexOrThrow(_cursor, "plant_date");
          final int _cursorIndexOfLastWateringDate = CursorUtil.getColumnIndexOrThrow(_cursor, "last_watering_date");
          final GardenPlanting _result;
          if(_cursor.moveToFirst()) {
            final String _tmpPlantId;
            _tmpPlantId = _cursor.getString(_cursorIndexOfPlantId);
            final Calendar _tmpPlantDate;
            final long _tmp;
            _tmp = _cursor.getLong(_cursorIndexOfPlantDate);
            _tmpPlantDate = __converters.datestampToCalendar(_tmp);
            final Calendar _tmpLastWateringDate;
            final long _tmp_1;
            _tmp_1 = _cursor.getLong(_cursorIndexOfLastWateringDate);
            _tmpLastWateringDate = __converters.datestampToCalendar(_tmp_1);
            _result = new GardenPlanting(_tmpPlantId,_tmpPlantDate,_tmpLastWateringDate);
            final long _tmpGardenPlantingId;
            _tmpGardenPlantingId = _cursor.getLong(_cursorIndexOfGardenPlantingId);
            _result.setGardenPlantingId(_tmpGardenPlantingId);
          } else {
            _result = null;
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
  public LiveData<List<PlantAndGardenPlantings>> getPlantAndGardenPlantings() {
    final String _sql = "SELECT * FROM plants";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"garden_plantings","plants"}, true, new Callable<List<PlantAndGardenPlantings>>() {
      @Override
      public List<PlantAndGardenPlantings> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true);
          try {
            final int _cursorIndexOfPlantId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
            final int _cursorIndexOfGrowZoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "growZoneNumber");
            final int _cursorIndexOfWateringInterval = CursorUtil.getColumnIndexOrThrow(_cursor, "wateringInterval");
            final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
            final int _cursorIndexOfLocalImage = CursorUtil.getColumnIndexOrThrow(_cursor, "localImage");
            final ArrayMap<String, ArrayList<GardenPlanting>> _collectionGardenPlantings = new ArrayMap<String, ArrayList<GardenPlanting>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfPlantId);
              ArrayList<GardenPlanting> _tmpGardenPlantingsCollection = _collectionGardenPlantings.get(_tmpKey);
              if (_tmpGardenPlantingsCollection == null) {
                _tmpGardenPlantingsCollection = new ArrayList<GardenPlanting>();
                _collectionGardenPlantings.put(_tmpKey, _tmpGardenPlantingsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipgardenPlantingsAscomGoogleSamplesAppsSunflowerDataGardenPlanting(_collectionGardenPlantings);
            final List<PlantAndGardenPlantings> _result = new ArrayList<PlantAndGardenPlantings>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final PlantAndGardenPlantings _item;
              final Plant _tmpPlant;
              if (! (_cursor.isNull(_cursorIndexOfPlantId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfGrowZoneNumber) && _cursor.isNull(_cursorIndexOfWateringInterval) && _cursor.isNull(_cursorIndexOfImageUrl) && _cursor.isNull(_cursorIndexOfLocalImage))) {
                final String _tmpPlantId;
                _tmpPlantId = _cursor.getString(_cursorIndexOfPlantId);
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final String _tmpDescription;
                _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
                final int _tmpGrowZoneNumber;
                _tmpGrowZoneNumber = _cursor.getInt(_cursorIndexOfGrowZoneNumber);
                final int _tmpWateringInterval;
                _tmpWateringInterval = _cursor.getInt(_cursorIndexOfWateringInterval);
                final String _tmpImageUrl;
                _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
                final String _tmpLocalImage;
                _tmpLocalImage = _cursor.getString(_cursorIndexOfLocalImage);
                _tmpPlant = new Plant(_tmpPlantId,_tmpName,_tmpDescription,_tmpGrowZoneNumber,_tmpWateringInterval,_tmpImageUrl,_tmpLocalImage);
              }  else  {
                _tmpPlant = null;
              }
              ArrayList<GardenPlanting> _tmpGardenPlantingsCollection_1 = null;
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfPlantId);
              _tmpGardenPlantingsCollection_1 = _collectionGardenPlantings.get(_tmpKey_1);
              if (_tmpGardenPlantingsCollection_1 == null) {
                _tmpGardenPlantingsCollection_1 = new ArrayList<GardenPlanting>();
              }
              _item = new PlantAndGardenPlantings();
              _item.plant = _tmpPlant;
              _item.setGardenPlantings(_tmpGardenPlantingsCollection_1);
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  private void __fetchRelationshipgardenPlantingsAscomGoogleSamplesAppsSunflowerDataGardenPlanting(final ArrayMap<String, ArrayList<GardenPlanting>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<GardenPlanting>> _tmpInnerMap = new ArrayMap<String, ArrayList<GardenPlanting>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _mapIndex = 0;
      int _tmpIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipgardenPlantingsAscomGoogleSamplesAppsSunflowerDataGardenPlanting(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<GardenPlanting>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipgardenPlantingsAscomGoogleSamplesAppsSunflowerDataGardenPlanting(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `id`,`plant_id`,`plant_date`,`last_watering_date` FROM `garden_plantings` WHERE `plant_id` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "plant_id");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfGardenPlantingId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPlantId = CursorUtil.getColumnIndexOrThrow(_cursor, "plant_id");
      final int _cursorIndexOfPlantDate = CursorUtil.getColumnIndexOrThrow(_cursor, "plant_date");
      final int _cursorIndexOfLastWateringDate = CursorUtil.getColumnIndexOrThrow(_cursor, "last_watering_date");
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<GardenPlanting> _tmpCollection = _map.get(_tmpKey);
        if (_tmpCollection != null) {
          final GardenPlanting _item_1;
          final String _tmpPlantId;
          _tmpPlantId = _cursor.getString(_cursorIndexOfPlantId);
          final Calendar _tmpPlantDate;
          final long _tmp;
          _tmp = _cursor.getLong(_cursorIndexOfPlantDate);
          _tmpPlantDate = __converters.datestampToCalendar(_tmp);
          final Calendar _tmpLastWateringDate;
          final long _tmp_1;
          _tmp_1 = _cursor.getLong(_cursorIndexOfLastWateringDate);
          _tmpLastWateringDate = __converters.datestampToCalendar(_tmp_1);
          _item_1 = new GardenPlanting(_tmpPlantId,_tmpPlantDate,_tmpLastWateringDate);
          final long _tmpGardenPlantingId;
          _tmpGardenPlantingId = _cursor.getLong(_cursorIndexOfGardenPlantingId);
          _item_1.setGardenPlantingId(_tmpGardenPlantingId);
          _tmpCollection.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
