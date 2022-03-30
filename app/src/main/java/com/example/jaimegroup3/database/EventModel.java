package com.example.jaimegroup3.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "event_model")
public class EventModel implements Serializable {
    @PrimaryKey (autoGenerate = true)
    @NonNull
    private int id;

    private String poiId;

    private String eventName;

    private String eventDescription;

    private String eventDate;

    private String eventFromTime;

    private String eventToTime;

}
