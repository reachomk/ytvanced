package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggm */
final class aggm implements xbt {
    aggm() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE subtitles ADD COLUMN track_vss_id TEXT NOT NULL DEFAULT '-'");
    }
}
