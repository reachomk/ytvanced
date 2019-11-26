package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggy */
final class aggy implements xbt {
    aggy() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN offline_audio_quality INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE playlistsV13 ADD COLUMN offline_audio_quality INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN offline_audio_quality INTEGER DEFAULT 0");
    }
}
