package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aghe */
final class aghe implements xbt {
    aghe() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN playlist_client_last_invalidation_timestamp INTEGER DEFAULT 0");
    }
}
