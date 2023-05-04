package com.example.note_up

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

    //  @Entity class represents a SQLite table.
    @Entity(tableName = "notes_table")  // It is the table name.
    class Note(@ColumnInfo(name="text")val text: String)  {
        @PrimaryKey(autoGenerate = true) var id = 0
}