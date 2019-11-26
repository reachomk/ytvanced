package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggp */
final class aggp implements xbt {
    aggp() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN external_yt_file_path TEXT DEFAULT NULL");
    }
}
