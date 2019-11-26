package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggr */
final class aggr implements xbt {
    aggr() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN playlist_added_timestamp_millis INTEGER DEFAULT 0");
    }
}
