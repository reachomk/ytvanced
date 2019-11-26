package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggv */
final class aggv implements xbt {
    aggv() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE videos ADD COLUMN preferred_stream_quality INTEGER NOT NULL DEFAULT 360");
        sQLiteDatabase.execSQL("ALTER TABLE playlists ADD COLUMN preferred_stream_quality INTEGER NOT NULL DEFAULT 360");
    }
}
