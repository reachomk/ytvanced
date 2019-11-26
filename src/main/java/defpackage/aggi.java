package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggi */
final class aggi implements xbt {
    aggi() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN offline_source_ve_type INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN offline_source_ve_type INTEGER DEFAULT 0");
    }
}
