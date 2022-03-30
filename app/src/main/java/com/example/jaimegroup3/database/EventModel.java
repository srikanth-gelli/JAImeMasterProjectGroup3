package com.example.jaimegroup3.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "event_model")
public class EventModel implements Serializable {
    @PrimaryKey (autoGenerate = true)
    @NonNull
    private int id;

    @ColumnInfo(name = "POI ID")
    private String poiId;

    @ColumnInfo(name = "event_name")
    private String eventName;

    @ColumnInfo(name = "event_description")
    private String eventDescription;

    @ColumnInfo(name = "event_date")
    private String eventDate;

    @ColumnInfo(name = "event_from")
    private String eventFromTime;

    @ColumnInfo(name = "event_to")
    private String eventToTime;

}
