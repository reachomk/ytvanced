package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggu */
final class aggu implements xbt {
    aggu() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN storage_id TEXT DEFAULT NULL");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN expired_stream INTEGER DEFAULT 0");
    }
}
