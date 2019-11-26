package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: utu */
final class utu implements xbt {
    utu() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE identity ADD COLUMN datasync_id TEXT");
    }
}
