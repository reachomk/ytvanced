package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggn */
final class aggn implements xbt {
    aggn() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN stream_status INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE streams ADD COLUMN stream_status_timestamp INTEGER DEFAULT 0");
    }
}
