package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggo */
final class aggo implements xbt {
    aggo() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE videosV2 ADD COLUMN watch_next_proto BLOB DEFAULT NULL");
    }
}
