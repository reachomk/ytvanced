package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: aggh */
final class aggh implements xbt {
    aggh() {
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE video_listsV13 ADD COLUMN selection_strategy INTEGER DEFAULT 0");
    }
}
