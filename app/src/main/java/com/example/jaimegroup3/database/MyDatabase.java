package com.example.jaimegroup3.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.jaimegroup3.database.dao.EventMasterDao;

@Database(entities = {EventModel.class}, version = 1, exportSchema = true)

/*@TypeConverters(ConverterListToString.class)*/
public abstract class MyDatabase extends RoomDatabase {

    public abstract EventMasterDao eventMasterDao();

}

