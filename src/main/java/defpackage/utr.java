package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: utr */
final class utr implements xbt {
    utr() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN is_persona INTEGER DEFAULT 0");
    }
}
