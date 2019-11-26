package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: utq */
final class utq implements xbt {
    utq() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN id TEXT");
    }
}
