package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggt */
final class aggt implements xbt {
    aggt() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN playlist_offline_request_source INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN video_list_offline_request_source INTEGER DEFAULT 0");
    }
}
