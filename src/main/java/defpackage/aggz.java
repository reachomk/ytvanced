package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggz */
final class aggz implements xbt {
    aggz() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN last_playback_position_timestamp INTEGER DEFAULT 0");
    }
}
