package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aghd */
final class aghd implements xbt {
    aghd() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE playlists ADD COLUMN placeholder INTEGER NOT NULL DEFAULT 0");
    }
}
