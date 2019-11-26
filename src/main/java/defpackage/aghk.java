package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aghk */
final class aghk implements xbt {
    aghk() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN player_response_tracking_params BLOB DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE playlistsV2 ADD COLUMN player_response_tracking_params BLOB DEFAULT NULL");
    }
}
