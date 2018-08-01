package com.randomappsinc.randomnumbergeneratorplus.persistence;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.randomappsinc.randomnumbergeneratorplus.utils.MyApplication;

public class MySQLiteHelper extends SQLiteOpenHelper {

    // Table name
    public static final String TABLE_NAME = "history";

    // COLUMNS
    public static final String COLUMN_RNG_TYPE = "rng_type";
    public static final String COLUMN_RECORD_TEXT = "record_text";
    public static final String COLUMN_TIME_INSERTED = "time_inserted";

    // Some random things fed to a super's method
    private static final String DATABASE_NAME = "RandomNumberGeneratorPlus.db";
    private static final int DATABASE_VERSION = 1;

    // Database creation sql statements
    private static final String CREATE_HISTORY_TABLE = "CREATE TABLE IF NOT EXISTS "
            + TABLE_NAME + "(" + COLUMN_RNG_TYPE
            + " INTEGER, " + COLUMN_RECORD_TEXT + " TEXT, " + COLUMN_TIME_INSERTED + " INTEGER);";

    MySQLiteHelper() {
        super(MyApplication.getAppContext(), DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(CREATE_HISTORY_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}